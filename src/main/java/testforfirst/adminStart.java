package testforfirst;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Action.Login_adminq;
import Action.NewPro;
import common.GetCookie;

public class adminStart {
	
	

	public static WebDriver Driver = new FirefoxDriver();
	static String PraUsername = "administrator";
	static String PraPassword = "111111";
	static Cookie MyCookie = null;

//	public static void main(String[] args) throws IOException, InterruptedException {
	
	public static void Start() throws InterruptedException
	{
		
		
		// TODO Auto-generated method stub
		

		
		try {
			
			/*
			 * 登录
			 */
			Login_adminq.clickForLogin(PraUsername, PraPassword, Driver);
			
			
			
			/* 
			 * 获取Cookie，目的是保持用户登录状态
			 */
			 
			MyCookie = GetCookie.getCookie(Driver);
			
			
			/*
			 * 新建一个商品
			 */
			 
			NewPro.NewProduct(MyCookie, Driver);
			
			
			
			/*
			 * 关闭所有浏览器
			 */
	        Thread.sleep(3000);
	        Driver.quit();  
			
			
			
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}




