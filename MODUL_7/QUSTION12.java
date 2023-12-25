package MODUL_7;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
 * W.a.junit program to handled Assert class
 *  with all method to check its pass or fail
 *  
 */
public class QUSTION12 {

	@Test
    public void Passmethod() {
	
	int i=1,j=1;
	Assert.assertSame(i,j);
	System.out.println("this method is pass !!");
	}
	@Test
	public void Failmethod() {
		int i=1,j=1;
		Assert.assertSame(i,j);
		System.out.println("this method is fail !!");
		fail("self failed");
	}
}
