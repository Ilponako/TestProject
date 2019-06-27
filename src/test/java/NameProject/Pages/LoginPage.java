package NameProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage { //вот у тебя начинается класс

        WebDriver driver;
        public LoginPage(WebDriver driver){
            this.driver=driver;
        }

    @FindBy(xpath = "//a[@class=\"header-topline__user-link link-dashed\"]")
    private WebElement signInBtn;
    @FindBy (xpath = "//input[@class=\"auth-modal__form-input ng-untouched ng-pristine ng-invalid\"]")
    private WebElement loginField;
    @FindBy (xpath = "//input[@id='auth_pass']")
    private WebElement passwordFild;
    @FindBy (xpath = "//span[text()='Войти']")
    private WebElement loginBtn;
    @FindBy (xpath = "//a[@class=\"header-topline__user-link link-dashed\"]")
    private WebElement findName; // ИМЯ С МАЛЕНЬКОЙ !!!!!!!!!!!!!!




    public void setSignInBtn (){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class=\"header-topline__user-link link-dashed\"]"))));
        signInBtn.click();
    }
    public void setLogin(String login) {
        loginField.click();
        loginField.sendKeys(login);  //смотри
        //мы сейчас сказали нашей джаве что у нас тут переменная под названием логин - но мы ей не присвоили никакое значение
        //nj есть таким образом мы говорим у нас тут есть переменная логин, но мы какое значение ей захотим, такое и дадим!!!
    }

    public void setPasswordFild(String password) { //Field - ошибка в слове
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='auth_pass']"))));
        passwordFild.click();
        passwordFild.sendKeys(password); //правильно. когда у тебя вот тут заданы уникальные переменные (ты объявила просто что там чето есть
        // но не конкретизировала. а конкретизируешь конкретно в тесте. ты мош менять в любой момент
    }
    public void loginBtnClick (){
        loginBtn.click();
    }
    public void findUserName (){ // метод начинается
        WebElement FindName = driver.findElement(By.xpath("//a[@class=\"header-topline__user-link link-dashed\"]"));
    }




}
