package Action;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/**
 * 清除已有的属性，防止重复编辑
 * @author 700sfriend
 *
 */
public class ActionClassDel {
		
	static WebDriver driver;
	
	
	
	
	public ActionClassDel(WebDriver driver){
		this.driver=driver;		
	}
	
	/**
	 * 从列表中删除
	 * @throws InterruptedException
	 */
	public void ActionDel() throws InterruptedException {
		// TODO Auto-generated method stub

			 /**
			  * 得到table元素对象!!!!!!!!!!!  
			  */
	       WebElement table = driver.findElement(By.id("tableAttr"));
	       /**
	        * 得到table表中所有行对象，得到table的行数  
	        */
	       List<WebElement> rows = table.findElements(By.tagName("tr")); 
	       System.out.println("属性个数："+rows.size()); 
	      
	       /**
	        * 删除已有的属性
	        */
	      for(int t=1;t<rows.size();t++)
			      {
			   	   if (rows.size()>0){
			   	   WebElement ButtonDel = driver.findElement(By.xpath(".//*[@id='tableAttr']/tbody/tr["+1+"]/td[3]/input"));
			   	   ButtonDel.click();
			   	   Thread.sleep(300);

			   	   /**
			   	    * 操作Alert窗口
			   	    */
			   	   Alert ButtonAlert = driver.switchTo().alert();
			   	   Thread.sleep(300);
			   	   ButtonAlert.accept();
			   	   Thread.sleep(300);
//			   	   System.out.println("Accept the alert: " + ButtonAlert.getText());
//			   	   Thread.sleep(300);
			   	   driver.switchTo().defaultContent();
			   	   Thread.sleep(300);
			   	   		}
			      }
		
	}

}
