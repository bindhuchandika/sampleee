package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage {
	  //Declaration
		@FindBy(id="email")
		private WebElement usernametb;
		@FindBy(id="pass")
		private WebElement passwordtb;
		@FindBy(name="login")
		private WebElement loginbtn;
		WebDriver driver;
		//initialization
		public Facebook_LoginPage(WebDriver driver)
		{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	    }	
	    //Utilizaton
		public void usernametextbox(String name)
		{
			usernametb.sendKeys(name);
		}
		public void passwordtextbox(String pwd)
		{
			passwordtb.sendKeys(pwd);
		}
		public void loginbutton()
		{
			loginbtn.click();
		}
	

}


