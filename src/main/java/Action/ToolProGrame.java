package Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ToolProGrame {


	private static CharSequence KeyProName;
	private static CharSequence ValueProContext;
	private static HashMap<String, String> maps = new HashMap<String, String>();

	
	
	public static void testProGrame(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement myElement17 = driver.findElement(By.xpath(".//*[@id='tbCustomAttr']/tr/td[1]/input"));
		WebElement myElement18 = driver.findElement(By.xpath(".//*[@id='tbCustomAttr']/tr/td[2]/input"));
		WebElement myElement19 = driver.findElement(By.xpath(".//*[@id='createCustomAttr']"));
		
		
		
		/*
		 * 先删除已有的属性
		 */
		ActionClassDel action = new ActionClassDel(driver);
		action.ActionDel();
		
		/**
		 * 设置周边.锁的商品属性
		 */
		String[] ProName={"品牌:","型号:","材质","重量","颜色","尺寸","产地"};
		String[] ProContext={"Knog","partyfrank香肠锁","医疗级矽胶包覆的加强编织钢缆","250g","黑色","620mm","澳洲"};
		
		
		for(int i=0;i<ProName.length;i++)
		{			

			// 创建一个映射对象
			maps.put(ProName[i], ProContext[i]);			
		}

			Set<String> set = maps.keySet();
			//遍历K的集合，得到set的迭代器  
			Iterator<String> iter = set.iterator();  
			while(iter.hasNext()){  
			    //取出一个key  
				KeyProName = iter.next();  
				System.out.println(KeyProName);
			    //根据key得到对应的Value  
			    ValueProContext = maps.get(KeyProName);      
			    System.out.println("商品属性是："+KeyProName+"\t"+ValueProContext);
			    
			    myElement17.clear();
			    Thread.sleep(300);
				myElement17.sendKeys(KeyProName);
				Thread.sleep(300);
				myElement18.clear();
				Thread.sleep(300);
				myElement18.sendKeys(ValueProContext);
				Thread.sleep(300);
				myElement19.click();
				Thread.sleep(300);
				myElement17.clear();
				myElement18.clear();
			}  

	}
	
	
}
