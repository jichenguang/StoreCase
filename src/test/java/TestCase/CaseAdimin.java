package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import testforfirst.adminStart;

public class CaseAdimin {
	
	
  @Test
  public void CaseAdmin_Start() {
	  
	  try {
		/*运行入口用例*/
		adminStart.Start();
		System.out.println("测试成功！");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("测试失败");
	}
  }
}
