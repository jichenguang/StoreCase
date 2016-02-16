package Action;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class ActionClassListPro {

	static WebDriver driver;
	static Cookie myCookie;
	static int myProNum = 0 ;
	
	
	public ActionClassListPro(WebDriver driver, Cookie myCookie, int myProNum){
		this.driver=driver;
		this.myCookie=myCookie;
		this.myProNum=myProNum;
	}
	
	public void ActPro() throws InterruptedException{
		
		ListPro listPro = new ListPro(driver,myCookie,myProNum);
		Thread.sleep(1000);
		listPro.GetTablePath();
		Thread.sleep(1000);
		listPro.ChooseProduct();
		Thread.sleep(1000);
		listPro.ActionShelve();
		Thread.sleep(1000);
		listPro.ActionUnShelve();
		Thread.sleep(1000);
		
	}
	
}
