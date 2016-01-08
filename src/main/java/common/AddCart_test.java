package common;


import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.WebClient;



public class AddCart_test { 
	

	 public static   int addCart() throws InterruptedException {
			
  	   			
			String url_addToCart = "http://www.700store.com/addtocartaction?ProductRoute=baihua&SkuId=76&OrderQuantity=1";
			int clientStatusCode = 0;
			
			WebDriver Driver_addToCart = Login_test.Driver;
			
			
			Login_test.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Driver_addToCart.get(url_addToCart);
		
	        
	//获取Title,判断“加入购物车”是否成功。
			Driver_addToCart.switchTo().defaultContent();
	        assertTrue("首页 - 700Bike官方商城",Driver_addToCart.getTitle()); 

	        
	//退出，关闭浏览器
//	        Driver.quit();
	            return  clientStatusCode;
	
	    
			

			}

private static void assertTrue(String string, String title) {
// TODO Auto-generated method stub

} 
}