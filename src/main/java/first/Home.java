package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;

	
	@FindBy(id="homeval")
	WebElement homevalue;
	@FindBy(id="downpayment")
	WebElement firstpay;
	
	@FindBy(id="loanamt")
	WebElement loany;
	@FindBy(id="intrstsrate")
	WebElement ir;
	@FindBy(xpath="//a[@class='example8 cboxElement']//input[@name='ratebutton']")
	WebElement klik;
	
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	
	public void price(String p) {
		homevalue.clear();
		homevalue.sendKeys(p);
	}
    public void payee(String u) {
    	firstpay.clear();
    	firstpay.sendKeys(u);
    }
    public void lo(String l) {
    	loany.clear();
    	loany.sendKeys(l);
    }
    public void in(String q) {
    	ir.clear();
    	ir.sendKeys(q);
    }
    
    public void clicky() {
    	klik.click();
		
		
		
		
		
		
		
	}
	
	
	
	
}
