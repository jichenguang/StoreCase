package WebChecker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 到页面前端去检查：
 * 1、后台数据的正确性
 * 2、后台操作的效果展示
 * @author 700sfriend
 *
 */

public class doWebCkecker {
	
	String webUrl = "http://webq.700paper.cn/category/peripheral-all" ;//周边频道页
	String CheckUrl = "http://webq.700paper.cn/booking/ABUSliantiaosuo1-7243";
	private WebDriver driver;
	private int myProNum;
	
	
	

	public doWebCkecker(WebDriver driver, int myProNum) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		this.myProNum = myProNum;
	}

	
	/**
	 * doCheck方法用于获取前台的商品展示效果
	 */
	public void doCheck() {
		// TODO Auto-generated method stub
		
		driver.get(webUrl);
		WebElement myWebPro = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/ul/li[2]/a/p[2]"));
		myWebPro.click();
		String TurnUrl =  driver.getCurrentUrl();
		if (TurnUrl.equals(CheckUrl)){
			System.out.println("商品"+myProNum+"上架成功");
		}else{
			System.out.println("商品"+myProNum+"上架失败");
		} 
//		Assert.assertEquals(TurnUrl,CheckUrl,"fail");
//		assertEquals(TurnUrl,CheckUrl,"");
	}

}
