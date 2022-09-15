package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameMania_testFront {

		private WebDriver driver;
		
		@Before
		public void ConfigurarTeste() {
			System.setProperty("webdriver.chrome.driver", "C:\\Program FIles\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		@Test
		public void TesteNavegabilidade () {
			driver.get("http://localhost:4200/");
			driver.findElement(By.id("email")).sendKeys("algumacoisa@gmail.com");
			driver.findElement(By.id("senha")).sendKeys("senha123");
		}
	}
