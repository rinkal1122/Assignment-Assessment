package MODUL_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
  @RunWith(Parameterized.class)
public class QUSTION15 {
 String username,password;
 AddDemo2 ad;
 @Before
  public void before() {
	ad= new AddDemo2();
	
}
 public QUSTION15 (String username, String password) {
	 this.username=username;
	 this.password=password;
	
	
}
    @Parameterized.Parameters
 public   static Collection input() {
	 return Arrays.asList(new Object[][]{ {"test123@gmil.com", "123"},{"tes@gmil.com","123"}}); 
	
}@Test
 public void test() throws InterruptedException   {
	 ad.login(username, password);
	
 
 }	
}
