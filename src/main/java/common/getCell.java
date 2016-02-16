package common;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class getCell {
	
	
	
	private static WebElement MyRow = null;
	private static int myCellNum;

	/*
	 *   根据Row对象，及给定的数字，获取列
	 */
		
	@SuppressWarnings("static-access")
	public getCell(WebElement MyRow,int myCellNum){
		this.MyRow = MyRow;
		this.myCellNum =myCellNum;
	}
	
	public WebElement toGetCell(){
		 List<WebElement> MyCells;
		 WebElement target = null;
		 //列里面有"<th>"、"<td>"两种标签，所以分开处理。
		 if(MyRow.findElements(By.tagName("th")).size()>0){
			MyCells = MyRow.findElements(By.tagName("th"));
			target = MyCells.get(myCellNum);
		 }
		 if(MyRow.findElements(By.tagName("td")).size()>0){
			MyCells = MyRow.findElements(By.tagName("td"));
			target = MyCells.get(myCellNum);
		 }		 		 
		return target;
	}
}
