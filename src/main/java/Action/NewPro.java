package Action;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.support.ui.Select;


import common.MySelect;

public class NewPro {
	
	

	private static Object URL="http://adminprodq.700paper.cn/admin/product/create??ProductId=";
	static String ProductId ="7260";

	public static void NewProduct(Cookie myCookie, WebDriver Driver, int i) throws InterruptedException{
		
		System.out.println("创建第"  + i + "个商品!");
		Driver.findElement(By.xpath(".//*[@id='menu-nav']/li[25]/a")).click();
		System.out.println("进入新建商品页面");
		
		MySelect myselect =new MySelect();
//		PageSelect.testSelect("周边","头盔", Driver);
//		PageSelect.testSelect("自行车","城市自行车", Driver);
		PageSelect.testSelect("周边","锁", Driver);
		
		/**
		 *@param ProName 商品名
		 *@Param Ad 广告语
		 */
		String ProName = "knog party frank香肠锁";
		String Ad = "潮流先锋，经典设计，8色可选";
		String SelValue = "KNOG";
		
//		PageEditPro.editPro("knog party frank香肠锁"+i+"号","行走江湖，安全第一",Driver);
		PageEditPro.editPro(ProName,Ad,Driver, SelValue);


		
	}

/*	public static void NewMybaby(Cookie myCookie, WebDriver driver) {
		// TODO Auto-generated method stub
		
//		driver.get(URL+ProductId);
//		System.out.println(driver.getCurrentUrl());
		 //利用js代码取出关键字
        String keyword = (String) ((JavascriptExecutor)driver).
        		executeScript("var url = http://adminprodq.700paper.cn/admin/product/create??ProductId=7777;"+
            "request.open('POST', url, true);"+
            "request.send(null)"
            );
          

		 
	}*/
=======
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.MySelect;

public class NewPro {
	
	

	public static void NewProduct(Cookie myCookie, WebDriver Driver){
		
		
		Driver.findElement(By.xpath(".//*[@id='menu-nav']/li[25]/a")).click();
		System.out.println("进入新建商品页面");
		
		MySelect myselect =new MySelect();
		PageSelect.testSelect("周边","头盔", Driver);
		

		PageEditPro.editPro("防风口罩","行走江湖，安全第一",Driver);


		
	}
>>>>>>> branch 'master' of https://github.com/jichenguang/adminqRSS.git
    

}
