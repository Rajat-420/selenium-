package books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_001_TEST extends BaseClass {
	@Test
	public void clickOnBooks() {
		HomePage hp=new HomePage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle() ,"Demo Web shop","Books Page is not displayed");
		Reporter.log("Books page is displayed",true);
	}

}
