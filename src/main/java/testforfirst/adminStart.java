package testforfirst;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Action.ActionClassListPro;
import Action.ListPro;
import Action.Login_adminq;
import Action.NewPro;
import WebChecker.doWebCkecker;
import common.GetCookie;

public class adminStart {
	

	public static WebDriver Driver = new FirefoxDriver();
	static String PraUsername = "administrator";
	static String PraPassword = "111111";
	static Cookie MyCookie = null;

//	public static void main(String[] args) throws IOException, InterruptedException {
	
	
	public static void Start() throws InterruptedException
	{
		
			
			/**
			 * 登录
			 */

			Login_adminq.clickForLogin(PraUsername, PraPassword, Driver);

			
			/**
			 * 获取Cookie，目的是保持用户登录状态
			 */
			 
			MyCookie = GetCookie.getCookie(Driver);
			
			
			/**
			 * 新建一个商品
			 */	
			
//			NewPro.NewMybaby(MyCookie, Driver);
			
		int i=1;	
			for(i=1;i<=2;i++){		
				NewPro.NewProduct(MyCookie, Driver,i);
					Thread.sleep(1000);
			}

			/**
			  * 商品列表操作
			  */
				
				int MyProNum =7243;
				ActionClassListPro actionList = new ActionClassListPro(Driver, MyCookie,  MyProNum);
				actionList.ActPro();
				
				
				/*
				 * 调用前台展示页面
				 */
					doWebCkecker webCheck = new doWebCkecker(Driver,MyProNum);
					webCheck.doCheck();
						

			
			
			/**
			 * 关闭所有浏览器
			 */
//	        Thread.sleep(3000);
//	        Driver.quit();  

	}

}




