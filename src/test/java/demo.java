

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demo {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("b4test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

}
