package com.positionvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		WebElement fn=d.findElement(By.xpath("//input[@placeholder='First Name']"));
		Point fn1=fn.getLocation();
		int fnx=fn1.getX();
		int fny=fn1.getY();
		System.out.println("First name X cord : "+fnx);
		System.out.println("First name Y cord : "+fny);
		
		Point ln=d.findElement(By.xpath("//input[@placeholder='Last Name']")).getLocation();
		int lnx=ln.getX();
		int lny=ln.getY();
		System.out.println("Last name X cord : "+lnx);
		System.out.println("Last name Y cord : "+lny);
		
		System.out.println("First name getting displayed right to the Last name : "+(fnx<lnx));
		System.out.println("*******************************************************************************");
		
		int addx=d.findElement(By.xpath("//textarea[@ng-model='Adress']")).getLocation().getX();
		int addy=d.findElement(By.xpath("//textarea[@ng-model='Adress']")).getLocation().getY();
		System.out.println("First Name displayed above the Address : "+(fny<addy));
		System.out.println("*******************************************************************************");	
		int eaddx=d.findElement(By.xpath("//input[@type=\"email\" and @ng-model=\"EmailAdress\"]")).getLocation().getX();
		int eaddy=d.findElement(By.xpath("//input[@type=\"email\" and @ng-model=\"EmailAdress\"]")).getLocation().getY();
		System.out.println("Email X cord :"+eaddx +":   Email Y cord : "+eaddy);
		System.out.println("Address displayed above the Email Address : "+(addy<eaddy));
		System.out.println("*******************************************************************************");
		int phonex=d.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).getLocation().getX();
		int phoney=d.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).getLocation().getY();
		System.out.println("Phone X cord :"+phonex +":   Phone Y cord : "+phoney);
		System.out.println("FEmail address displayed above the Phone number : "+(eaddy<phoney));
		System.out.println("*******************************************************************************");
		int mgx=d.findElement(By.xpath("//input[@value=\"Male\"]")).getLocation().getX();
		int mgy=d.findElement(By.xpath("//input[@value=\"Male\"]")).getLocation().getY();
		System.out.println("Male X cord :"+mgx +":   Male Y cord : "+mgy);
		System.out.println("Phone number displayed above the Male gender : "+(phoney<mgy));
		System.out.println("*******************************************************************************");
		int fgx=d.findElement(By.xpath("//input[@value=\"FeMale\"]")).getLocation().getX();
		int fgy=d.findElement(By.xpath("//input[@value=\"FeMale\"]")).getLocation().getY();
		System.out.println("Female X cord :"+fgx +":   Female Y cord : "+fgy);
		System.out.println("Male gender displayed left to the Female gender : "+(mgx<fgx));
		System.out.println("*******************************************************************************");
		int cricketx=d.findElement(By.xpath("//input[@value=\"Cricket\"]")).getLocation().getX();
		int crickety=d.findElement(By.xpath("//input[@value=\"Cricket\"]")).getLocation().getY();
		System.out.println("cricket X cord :"+cricketx +":   cricket Y cord : "+crickety);
		System.out.println("Male gender displayed above the cricket hobby : "+(mgy<crickety));
		System.out.println("*******************************************************************************");
		int Moviesx=d.findElement(By.xpath("//input[@value=\"Movies\"]")).getLocation().getX();
		int Moviesy=d.findElement(By.xpath("//input[@value=\"Movies\"]")).getLocation().getY();
		System.out.println("Movies X cord :"+Moviesx +":   Movies Y cord : "+Moviesy);
		System.out.println("Cricket hobby displayed above the Movie : "+(crickety<Moviesy));
		System.out.println("*******************************************************************************");
		int Hockeyx=d.findElement(By.xpath("//input[@value=\"Hockey\"]")).getLocation().getX();
		int Hockeyy=d.findElement(By.xpath("//input[@value=\"Hockey\"]")).getLocation().getY();
		System.out.println("Hockey X cord :"+Hockeyx +":   Hockey Y cord : "+Hockeyy);
		System.out.println("Movie displayed above the Hockey : "+(Moviesy<Hockeyy));
		System.out.println("*******************************************************************************");
		
		
		
		d.close();
	}
}
