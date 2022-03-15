package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @Test
    public void loginSuccess() throws InterruptedException {
        //1.click on LOGIN - [href='/login']
        click(By.cssSelector("[href='/login']"));

        //2.inter email - #user
        type(By.cssSelector("#user"), "esimakova1984@gmail.com");
        //click on button LOGIN - #login
        click(By.cssSelector("#login"));
        //enter password - #password
        type(By.cssSelector("#password"), "Tcbvfrjdf1!");
        click(By.cssSelector("#login-submit"));
        //data-test-id='header-member-menu-button'
        Thread.sleep(5000);
        Assert.assertTrue(wd.findElements(By.cssSelector("[data-test-id='header-member-menu-button']")).size()>0);


    }

}
