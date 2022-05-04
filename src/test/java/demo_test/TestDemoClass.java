package demo_test;

import static org.junit.Assert.*;

import org.junit.Test;
 

public class TestDemoClass {

	DemoClass obj=new DemoClass();   
	@Test  
	public void testSum() {  
	    assertEquals(5,obj.sum(1, 1));  
	         }  

}
