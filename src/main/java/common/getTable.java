package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getTable {
	
	private static WebElement MyCell = null;
	private static int Row;
	static String text;
	private static By by;
	private static WebDriver driver;
	private static int myProNum;
	private static int myCellNum;
	
	
	static WebElement table = null;
	static List<WebElement> myrows = null;	
	
	@SuppressWarnings("static-access")
	public getTable(By by,WebDriver Driver, int myProNum,int myCellNum) throws InterruptedException{
		this.by =by;
		this.driver=Driver;
		this.myProNum=myProNum;
		this.myCellNum=myCellNum;
		Thread.sleep(1000);
		table = driver.findElement(by);
		Thread.sleep(1000);
		myrows = table.findElements(By.tagName("tr"));
	}
	
	public static WebElement toGetTable() throws InterruptedException{	
		//得到table元素对象
				
				//得到table表中所有行对象，并得到所要查询的行对象。
				//然后获取行对象的列值。
				//然后获取该行对象的属性及列值的内容
				//若该属性为指定参数一致，则判断该内容为商品名称
				//返回商品名称
				//根据商品在列表的行数，获得商品对象
				 getTable DDX = new getTable(by, driver, myProNum, myCellNum);
				 for(int row=1;row<myrows.size();row++){
					 WebElement MyRow = myrows.get(row);
					 String ProData = MyRow.getAttribute("data-product");
					 int myProData = Integer.parseInt(ProData);
					 if (myProData == myProNum){
						 System.out.println("新建的商品编号为："+myProData);
						 //调用getCell方法得到对应的列对象，也就是商品对象，然后得到要查询的文本。
						 getCell myGetCell =new getCell(MyRow, myCellNum);
						 MyCell = myGetCell.toGetCell();
					 }				 
				 }	 
				return MyCell;
		}
				
			public static String toGetProName() throws InterruptedException{
						getTable DDV = new getTable(by, driver,myProNum, myCellNum);
						WebElement CellName = DDV.toGetTable();
						String text = CellName.getText();
						System.out.println("新建的商品的名称："+text);
						return text;
				}

			public static int toGetTableRow() throws InterruptedException {
				//得到table元素对象
				  getTable DDT = new getTable(by, driver,myProNum, myCellNum);
				 for(int row=1;row<myrows.size();row++){
					 WebElement MyRow = myrows.get(row);		 
					 String ProData =  MyRow.getAttribute("data-product");
					 int myProData = Integer.parseInt(ProData);
					 if (myProData == myProNum){
						 Row = row+1;
						 System.out.println("新建的商品在列表第"+Row+"行");
						 //调用getCell方法得到对应的列对象，也就是商品对象，然后得到要查询的文本。 
					 }
				 }
				 //返回商品所在的行数，方便Xpath定位。
				 return Row;
			}
			     
}
	 
		
		
