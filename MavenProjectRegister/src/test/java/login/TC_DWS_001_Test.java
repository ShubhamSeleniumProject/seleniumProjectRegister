package login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tyss.genericutility.BaseClassUtility;
import com.tyss.genericutility.ListenerUtility;
import com.tyss.objectrepository.HomePage;

@Listeners(ListenerUtility.class)

public class TC_DWS_001_Test extends BaseClassUtility{
	
	@Test
	public void login_test() throws EncryptedDocumentException, IOException
	{
		
		 hp=new HomePage(driver);
		
		String expected_title = eu.getDataFromExcel("login",2,2);
		
		Assert.assertEquals(driver.getTitle(),expected_title,"not able to login");
		
		test.log(Status.PASS,"succesfully login");
		
		
		
	}

}
