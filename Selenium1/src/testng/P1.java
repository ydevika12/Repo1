package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	
	@Test
	public void carrot() {
		
		Reporter.log("from carrot method",true);
	}
	
	
	@Test
	public void banana() {
		
		Reporter.log("from banana method",true);
	}
	
	@Test
	public void apple() {
		
		Reporter.log("from apple method",true);
	}
	
}
