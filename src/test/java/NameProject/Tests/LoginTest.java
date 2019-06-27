package NameProject.Tests;

import NameProject.Pages.LoginPage;
import NameProject.StartClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends StartClass{

    @Test
    public void validLogin() throws InterruptedException{ //вот он начинается
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setSignInBtn();
        loginPage.setLogin("popichko@ukr.net");//тут открываешь кавычки внутри скобки и пишешь че тебе хочется - валидное невалидное пробелы че хоч, пиши
        loginPage.setPasswordFild("Qwerty123456");
        loginPage.loginBtnClick();
        loginPage.findUserName();
    }

    @Test
    public void invalidLogin (){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setSignInBtn();
        loginPage.setLogin("test");
        loginPage.setPasswordFild("test"); //берешь и меняешь значение, все. тебе не надо переписывать метолы.... еще чето. просто значение

           }
}