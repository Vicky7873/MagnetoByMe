package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComonMethods.ScreenShot;
import ComonMethods.WaitMethod;
import ComonMethods.WindowHandle;
import junit.framework.Assert;

public class ComparePage {
	
	private WebDriver driver;
	WindowHandle windowHAndle;
	ScreenShot ss;
	mobile_list_page mlp;
	WaitMethod wait;
	public ComparePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		windowHAndle=new WindowHandle(driver);
		ss=new ScreenShot(driver);
		mlp=new mobile_list_page(driver);
		wait=new WaitMethod(driver);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]")
    @CacheLookup
    WebElement Btn_AddToCart_SonyXperia;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement BynAddToCart_Iphone;
	
	@FindBy(xpath="//button[@title=\"Compare\"]")
	@CacheLookup
	WebElement btn_compare;
	
	@FindBy(xpath="//button[@title=\"Close Window\"]")
	@CacheLookup
	WebElement btn_CloseWindow;
	
	@FindBy(xpath="//h2/a[@title='IPhone']")
	WebElement link_txt_Iphone;
	
	@FindBy(xpath="//h2/a[@title='Sony Xperia']")
	WebElement link_txt_SonyExperia;
	
	String a;
	public void clickOn_AddTocartOf_SonyXperia() {
		a=mlp.link_txt_sonyXperia.getText();
		System.out.println(a);
		Btn_AddToCart_SonyXperia.click();
	}
	String b;
	public void clickOn_AddToCart_Iphone() {
		b=link_txt_Iphone.getText();
		System.out.println(b);
		BynAddToCart_Iphone.click();
	}
	
	public void clickOnCompareButton() {
		btn_compare.click();
	}
	
	public void SwitchTowindow() {
		windowHAndle.getToMainWindow();
		windowHAndle.SwitchToChildWindow();
		windowHAndle.maximaizeTheWindow();
	}
	String cp_iphone;
	public void getThetitleOfThePge() throws IOException {
		String title=driver.getTitle();
		driver.navigate().refresh();
		if(wait.waitForVisibilityOfElementandGetTheTxt(link_txt_Iphone)!=null) {
			cp_iphone=link_txt_Iphone.getText();
			System.out.println("From if it is printing "+link_txt_Iphone.getText());
		}
		else if(wait.waitForVisibilityOfElementandGetTheTxt(link_txt_Iphone) != null){
			System.out.println("From else if it is printing "+link_txt_Iphone.getText());
		}
		else {
			System.out.println("From else it is printing "+link_txt_Iphone.getText());
		}
		System.out.println(title);
		ss.takeTheScreenshot();
	}
	
	public void AsserrtTheNAmeFromdptocp() {
		Assert.assertEquals(cp_iphone, b,"The actual text is "+cp_iphone);
	}
	
	
	
	public void closeTheWindow() {
		btn_CloseWindow.click();
	}
	
	
}
