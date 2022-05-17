package demo_test;

import static org.junit.Assert.*;

import org.junit.Test;
 

public class TestDemoClass {

	DemoClass obj=new DemoClass();   
	@Test  
	public void testSum() {  
	    assertEquals(16,obj.sum(8,8));  
	         }  

}
