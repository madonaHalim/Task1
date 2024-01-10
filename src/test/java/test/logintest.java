package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IAfterTest;
import pages.loginpage;

public class logintest {
    loginpage login =new loginpage();



    @Test(priority = 1)
    public void open_browser() throws InterruptedException {
        login.OpenBrowser();
    }


    @Test(priority = 2)
    public void userlogin() throws InterruptedException {
        String mail="zyd_hsn";
        String password="123456@aA";
        login.userName(login.driver, mail,password);
        Thread.sleep(1000);

    }
    @Test(priority = 3)
    public void login(){
        login.loginButton(login.driver);
    }


    @Test(priority = 4)
    public void home_page() throws InterruptedException {
        String url = login.driver.getCurrentUrl();
        Assert.assertEquals( "http://41.32.3.212:5001/login",url);
        Thread.sleep(1000);

    }
    @Test(priority = 5)
    public void title() {
        String title = login.driver.getTitle();
        Assert.assertEquals( "النيابة الإدارية - منظومة الشكاوى",title);
    }

    @Test(priority=6)
    public void close_Browser() {
        login.driver.quit();

    }

}
