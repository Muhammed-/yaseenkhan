package com.yaseenkha.maven.purapractice.mavenpractice;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//*"));
		
		int adpcount=0;
		
		for(WebElement elements:element) {
		String tagname =elements.getTagName();
		if (tagname.equalsIgnoreCase("a")) {
			String text =elements.getText();
			if(text.contains("adp")||text.contains("ADP")) {
				adpcount++;
				
			}		
		}
		}
		
		System.out.println("the NUMBER  of counts are::"+adpcount);*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		List<WebElement> elements =driver.findElements(By.xpath("//*"));
		int count=0;
		Iterator< WebElement>iterator =elements.iterator();
		while(iterator.hasNext()) {
	WebElement  element=iterator.next();
	String value =element.getAttribute("type");
	if (value.equalsIgnoreCase("radio")||value.equalsIgnoreCase("checkbox")) {
		count++;
		
	}
	
		}
		System.out.println("the counts are"+count);
		
		
		
		/*String a = "yaseenkhan";
		String reverse= "";
		for(int i=a.length()-1;i>=0;i--)
		{
			char ch = a.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
		
		
		int count=0, num=23454;
		while(num!=0) {
			
			num/=10;
			count++;
		}
		System.out.println("the counts are"+count);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
