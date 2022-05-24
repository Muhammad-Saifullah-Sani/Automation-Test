package appiumTest;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase1 extends base {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Nama']").sendKeys("Saiful");
		driver.findElementByXPath("//android.widget.Button[@text='TAMBAH']").click();
	}
}
