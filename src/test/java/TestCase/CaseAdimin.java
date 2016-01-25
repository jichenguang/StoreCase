package TestCase;

import org.testng.annotations.Test;

import testforfirst.adminStart;

public class CaseAdimin {
  @Test
  public void CaseAdmin_Start() {
	  
	  try {
		adminStart.Start();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("测试失败");
	}
  }
}
