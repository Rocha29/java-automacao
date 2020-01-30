package primeiroteste;

import java.io.File;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		Page pg = new Page();
		
		
		
		//Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\AutomationDependencies\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/");
		
		// Entrando na pagina
		click(pg.botao1);
 				 		
 		//Cadastro de usuarios
		click(pg.formulario);
 		
 		sleep(500);
 		click(pg.usuario);
 		print("01 - Antes de preencher");
 		send(pg.name, "Robson");
 		send(pg.lastname, "Rocha");
 		send(pg.email, "rocha@gmail.com");
 		send(pg.endereco, "Rua Tres dois um");
 		send(pg.universidade, "Aquela mesmo");	
 		send(pg.profissao, "QA");
 		send(pg.genero, "M");
 		send(pg.idade, "31");
 		print("02 - Depois de preencher");
 		click(pg.criar);
 		
 		// validar cadastro
 		try
 		{
	 		click(pg.validacao);
	 		System.out.println("Cadastro Realizado");
	 		print("03 - Cadastro realizado");
 		}
 		catch (NoSuchElementException e)
 		{
 			System.out.println("Cadastro não realizado");
 		}
 		 		
 		// Mapeando botoes
 		click(pg.btnbuscadeelementos);
 		sleep(300);
 		click(pg.btnbotoes);
 		click(pg.btnRaised);
 		click(pg.btnFloating);
 		click(pg.btnFlat);
 		click(pg.btnSubmit);
 		
 		//Localizando elemento
 		By by = By.xpath(pg.btnDisable);
 		WebElement element = driver.findElement(by);
 		
 		//Verificando se está ativo
 		if (hasClass(element, "disabled"))
 		{
 			System.out.println("Botão estava desativado.");
 		}
 		else
 		{
 			click(pg.btnDisable);
 		}
 		
 		
 		
 		
	}
	
	static void sleep(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			
		}
	}
	
	static void click (String s) {
		By mapeamento = By.xpath(s);
		WebElement element = driver.findElement(mapeamento);
		element.click();
	}
	static void send (String s, String t) {
		By mapeamento = By.xpath(s);
		WebElement element = driver.findElement(mapeamento);
		element.sendKeys(t);
	}
	
	static void print (String nomeDoArquivo) 
	{
		try
		{
			File file = new File("C:\\print\\" + nomeDoArquivo +".png");
			FileOutputStream screen = new FileOutputStream(file);
			screen.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			screen.close();
		}
		catch (Exception e)
		{
			System.out.println("n deu pra tirar print men...");
		}
	}
	
	static boolean hasClass(WebElement element, String s)
	{
	    String classes = element.getAttribute("class");
	    for (String c : classes.split(" "))
	    {
	        if (c.equals(s))
	        {
	            return true;
	        }
	    }

	    return false;
	}
}
