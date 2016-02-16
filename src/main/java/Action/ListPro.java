package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import common.getTable;



/**
 * 
 * @author 700sfriend
 * @TODO 关于商品清单的操作
 */
public class ListPro {
	
		static int Row = 0;
		static String url = "http://adminprodq.700paper.cn/admin/product/list";
		static WebElement TableElement = null;
		static String TablePath = "";
		private static WebDriver myDriver=null;
		private static Cookie myCookie;
		private static int myProNum;
		int myCellNum= 1;//商品名称在第1列，index为从0起。	
		
		
		
		
		/**
		 * 
		 * @param driver webdriver对象
		 * @param myCookie  保持登陆状态的session
		 * @param myProNum	外部获取的列的数字
		 */
		public  ListPro(WebDriver Driver, Cookie myCookie, int myProNum) {
			// TODO Auto-generated constructor stub
			this.myDriver = Driver;
			this.myCookie = myCookie;
			this.myProNum = myProNum;
		}

	
		
		/**
		 *@TODO 获取列表tr对象。
		 *@author 700sfriend
		 *@return TableElement
		 * @throws InterruptedException 
		 */
		public  String GetTablePath( ) throws InterruptedException{
			 myDriver.manage().addCookie(myCookie);
			 myDriver.get(url);
			 By by = By.className("gridtable");	
			 
			
			 //获取行号以后，获取列表tr对象			 
			 getTable myTable = new  getTable(by, myDriver, myProNum,myCellNum);
			 Row = myTable.toGetTableRow();
			 TablePath = ".//*[@id='productList']/table/tbody/tr["+Row+"]";
			 return TablePath;
		}
		
		/**
		 *@TODO 勾选一个商品
		 *
		 */
		public static void ChooseProduct(){	
				 String CheckPath = TablePath + "/td[1]";
				 WebElement TableCheck =  myDriver.findElement(By.xpath(CheckPath));
				 TableCheck.click();
				 
		}
		
		
		/**
		 *TODO 上架一个商品。
		 * @throws InterruptedException 
		 */
		public void ActionShelve() throws InterruptedException{	
				
				 ListPro ListPro1 = new ListPro(myDriver,myCookie, myProNum);
				 ListPro.ChooseProduct();
				/*
				 *TODO 点击上架
				 */
				 WebElement UpShelve =  myDriver.findElement(By.xpath(".//*[@id='btnShelve']"));
				 UpShelve.click();
				 
				 /*
				  * 操作弹出框，确认。
				  */
				 WebElement DialogTrue = myDriver.findElement(By.xpath(".//*[@id='btnDialogBySHFConfirm']"));
				 DialogTrue.click();
				 
				 
				 /*
				  *TODO 查看状态变化
				  */
				 Thread.sleep(1000);
				 String ShelvePath = TablePath +"/td[8]";
				 WebElement TableSlelve = myDriver.findElement(By.xpath(ShelvePath));
				 if (TableSlelve.getText().equals("上架")){
					 System.out.println("商品："+getTable.toGetProName()+"上架成功");
				 }else{
					 System.out.println("商品："+getTable.toGetProName()+"上架失败");
				 }
				 myDriver.navigate().refresh();
	}


		
		
		public void ActionUnShelve() throws InterruptedException {
			// TODO Auto-generated method stub
				 ListPro ListPro2 = new ListPro(myDriver,myCookie, myProNum);
				 ListPro.ChooseProduct();
				 WebElement UnUpShelve = myDriver.findElement(By.xpath(".//*[@id='btnUnShelve']"));
				 UnUpShelve.click();
				 WebElement DialogUnTrue = myDriver.findElement(By.xpath(".//*[@id='btnDialogBySHFConfirm']"));
				 DialogUnTrue.click();
				 Thread.sleep(1000);
				 
				 String ShelvePath = TablePath +"/td[8]";
				 WebElement TableSlelve = myDriver.findElement(By.xpath(ShelvePath));
				 if(TableSlelve.getText().equals("下架")){
					 System.out.println("商品："+getTable.toGetProName()+"下架成功");
				 }else{
					 System.out.println("商品："+getTable.toGetProName()+"下架失败");
				 }
				 myDriver.navigate().refresh();
		}	
}
