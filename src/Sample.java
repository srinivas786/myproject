import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Sample {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.operadriver().setup();
        driver=new OperaDriver();
        driver.get("https://www.google.com");
    }
}
