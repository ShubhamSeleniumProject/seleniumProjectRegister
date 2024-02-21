package electronics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tyss.genericutility.BaseClassUtility;
import com.tyss.genericutility.ListenerUtility;
import com.tyss.objectrepository.CameraPage;
import com.tyss.objectrepository.ElectronicsPage;
import com.tyss.objectrepository.HomePage;


@Listeners(ListenerUtility.class)

public class TC_DWS_002_Test extends BaseClassUtility {
	
	@Test
	public void electronics_test()
	{
		
		HomePage hp=new HomePage(driver);
		hp.getElctronics_link().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
	boolean msg = ep.getMsg_electronics().isDisplayed();
	Assert.assertEquals(msg, true,"not able to display electronics page");
		test.log(Status.PASS,"elctronics page displayed");
		
		ep.getCamera_button().click();
		CameraPage cp=new CameraPage(driver);
		boolean msg_camera = cp.getCamera_msg().isDisplayed();
		Assert.assertEquals(msg_camera, true,"msg of camera is not working");
		test.log(Status.PASS,"camera page opened");
		
		
		
		Select sel=new Select(cp.getSort_products());
		sel.selectByVisibleText("Name: A to Z");
		boolean name = cp.getSort_products().isDisplayed();
		Assert.assertEquals(name, true,"name is diaplayed");
		
		
		
		
		
	}

}
