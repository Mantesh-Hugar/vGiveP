package com.vGive.actiondriver;

import java.io.File;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Highlighter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vGive.base.BaseClass;

public class Action extends BaseClass {

	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static void click(WebDriver driver, WebElement ele) {
		highLighterBoarder(driver, ele);

		Actions act = new Actions(driver);
		// act.moveToElement(ele).click().build().perform();
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", ele);
		//removeBoarder(driver, ele);
	}

	public static boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			highLighterBoarder(driver, ele);
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}
		//	removeBoarder(driver, ele);
		}
		return flag;
	}

	public static boolean findElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {
			// System.out.println("Location not found: "+locatorName);
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully Found element at");

			} else {
				System.out.println("Unable to locate element at");
			}
		}
		return flag;
	}

	public static boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		}

		catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed");
			} else {
				System.out.println("MouseOver Action is not performed");
			}
		}
	}

	public static boolean isDisplayed(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) {
			flag = ele.isDisplayed();
			if (flag) {
				highLighterBoarder(driver, ele);
				System.out.println("The element is Displayed");
			} else {
				System.out.println("The element is not Displayed");
			}
		} else {
			System.out.println("Not displayed ");
		}
		return flag;
	}

	public static boolean JSClick(WebDriver driver, WebElement ele) throws Exception {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			// driver.executeAsyncScript("arguments[0].click();", element);
			ele.click();
			flag = true;

		}

		catch (Exception e) {
			throw e;

		} finally {
			if (flag) {
				System.out.println("Click Action is performed");
			} else if (!flag) {
				System.out.println("Click Action is not performed");
			}
		}
		return flag;
	}



	public static void implicitW(WebDriver driver, int i, TimeUnit seconds) {
		driver.manage().timeouts().implicitlyWait(i, seconds);
	}

	public static boolean explicitWait(WebDriver driver, WebElement element, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
		return false;
	}

	public static void highLighterBoarder(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'",ele);
	}

	public static void highLighterBackground(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	
	public static void removeBoarder(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='1px solid #959595'",ele);
	}
	
	public static void fluentWait(WebDriver driver, WebElement element, int timeOut) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                 .withTimeout(Duration.ofSeconds(30L))
                 .pollingEvery(Duration.ofSeconds(5L))
                 .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
          element.click();
  }
	
	
	public static void Dropdown(List<WebElement> element, String Type) {
        for(WebElement e:element) {
            if(e.getText().equalsIgnoreCase(Type)) {
                //highLighterMethod(getDriver(), e);
                e.click();
                String s=e.getText();
                break;
            }
            else {
                System.out.println("input not exists in dropdown");
            }
        }}
	
//	public static void DropDownYN(List<WebElement> options, String SelectText, String SelectText1) {
//		for(WebElement e:options) {
//			if(e.getText().equals(SelectText)) {
//				e.click();
//				break;
//			}else if(e.getText().equalsIgnoreCase(SelectText1)) {
//				e.click();
//
//			}
//		}
//	}
     
	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		// This new path for jenkins
		String newImageString = "C:\\Users\\ManteshHugar\\eclipse-workspace\\vGive_Project\\ScreenShots" + filename
				+ "_" + dateName + ".png";
		return newImageString;
	}

}
