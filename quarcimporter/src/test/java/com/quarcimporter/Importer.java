package com.quarcimporter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JComboBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class Importer {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException, AWTException
	{
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Octopus\\Applications\\QA\\MEDarchon.Importer\\3.4.209\\MEDarchon.Importer.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		Robot robot = new Robot();
		driver.findElementById("FileSelect").click();
		Thread.sleep(2000);
		driver.findElementById("1148").click();
		driver.findElementById("1148").sendKeys("ClientInstall - Community_112816 (1)");
		driver.findElementById("1").click();
		Thread.sleep(1000);
			
		driver.findElementById("1001").click();
		driver.findElementById("1001").sendKeys("Tags");
		robot.keyPress(KeyEvent.VK_DOWN);

		driver.findElementById("TypeSelect").click();
		driver.findElementById("TypeSelect").sendKeys("User Tag Import");
		robot.keyPress(KeyEvent.VK_DOWN);

		driver.findElementById("button1").click();

		System.out.println("Done");
	}

}
