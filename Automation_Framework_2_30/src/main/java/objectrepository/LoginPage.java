package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTestField;

	public Object getEmailTextField() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath = "")

}
