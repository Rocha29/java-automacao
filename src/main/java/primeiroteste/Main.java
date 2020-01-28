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
	
	public static void main(String[] args)
	{
		page pg = new page();
		
		
		
		//Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\AutomationDependencies\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/");
		
		//Botao 1
		click(pg.botao1);
 				 		
 		//formulario
		click(pg.formulario);
 		
		//Espera
 		sleep(500);
 		
 		//Criar Usuários
 		click(pg.usuario);
 		
 		print("01 - Antes de preencher");
 		 		 		
 		// Campo nome
 		send(pg.name, "Robson");
 		
 		// Campo sobrenome
 		send(pg.lastname, "Rocha");
 		
 		// Campo e-mail
 		send(pg.email, "rocha@gmail.com");
 		
    	// Campo endereço
 		send(pg.endereco, "Rua Tres dois um");
 	    
 		// Campo universidade
 		send(pg.universidade, "Aquela mesmo");	
 	 		
 	 	// Campo profissao
 		send(pg.profissao, "QA");
 		
 		// Campo Genero
 		send(pg.genero, "M");
 		
 		// Campo idade
 		send(pg.idade, "31");
 		
 		print("02 - Depois de preencher");
 		
 		// clique no botao criar
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
 			//driver.close();
 		
 		
 		
	}
}
