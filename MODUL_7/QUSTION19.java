package MODUL_7;

import org.testng.annotations.Test;

public class QUSTION19 {
	public class GroupDemo {
		  @Test(groups = {"red"})
		  public void red1() {
			  System.out.println("this is red group");
		  }
		  @Test(groups = {"red"})
		  public void red2() {
			  System.out.println("this is red group");
		  }
		  @Test(groups = {"red"})
		  public void red3() {
			  System.out.println("this is red group");
		  }
		  @Test(groups = {"green"})
		  public void green1() {
			  System.out.println("this is green group");
		  }
		  @Test(groups = {"green"})
		  public void green2() {
			  System.out.println("this is green group");
		  }
		  @Test(groups = {"red","green"})
		  public void greenandred() {
			  System.out.println("this is green and red group");
		  }
}

}
