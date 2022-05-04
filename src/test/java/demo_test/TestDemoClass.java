package demo_test;

import static org.junit.Assert.*;

import org.junit.Test;
 

public class TestDemoClass {

	DemoClass obj=new DemoClass();   
	@Test  
	public void testSum() {  
	    assertEquals(100,obj.sum(10, 15));  
	         }  

}
