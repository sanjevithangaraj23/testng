import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\monis\\Downloads\\edgedriver_win64.exe");
	  driver= new EdgeDriver();
  }
}
