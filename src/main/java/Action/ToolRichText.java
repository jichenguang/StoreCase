package Action;

<<<<<<< HEAD
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolRichText {
	
	
/**
 * 编辑商品描述
 * 
 */
	
	

@Test
public static void testRichText(WebDriver driver)
  {

      
//    driver.switchTo().frame("content_ifr");
      WebElement editor = driver.findElement(By.xpath(".//*[@id='xhe0_container']/table"));
      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
      jsExecutor.executeScript(
    		  "arguments[0].innerHTML ="
    		  + " '<h1>商品描述</h1>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  + "创新、防弹性体合成涂料，防止损坏自行车表面；多款潮流颜色可选；防切割设计。<br>"
    		  +"'",editor);
      System.out.println(jsExecutor.toString());
=======
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolRichText {
	
	

	
	

public static void testRichText(WebDriver driver)
  {

      
//    driver.switchTo().frame("content_ifr");
      WebElement editor = driver.findElement(By.xpath(".//*[@id='xhe0_container']/table"));
      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
      jsExecutor.executeScript(
    		  "arguments[0].innerHTML ="
    		  + " '<h1>Selenium Test </h1>I love Selenium <br> this article Post By Selenium WebDriver<br>"
    		  + "<h2>Create By Young</h2>'", editor);
       
>>>>>>> branch 'master' of https://github.com/jichenguang/adminqRSS.git
//    driver.switchTo().defaultContent();
      
      

      

  }



}
