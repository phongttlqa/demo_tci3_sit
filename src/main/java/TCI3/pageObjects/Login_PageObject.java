package TCI3.pageObjects;

import TCI3.pageUtils.Login_PageUI;
import common.CommonWeb;

public class Login_PageObject extends CommonWeb {
    public void oepenPage() {
        open();
    }

    public void verifyOpenLoginPage(String s) {
        verifyContainTextValueElement(Login_PageUI.button_login, s);
    }

    public void inputToEmailAndPassword(String email, String pass) {
        sendkeyToElement(Login_PageUI.txt_email, email);
        sendkeyToElement(Login_PageUI.txt_password, pass);
    }

    public void clickButtonLogin() {
        clickToElement(Login_PageUI.button_login);
    }

    public void verifyErrorMessagePopup(String message) {
        verifyContainTextValueElement(Login_PageUI.txt_error_login_message, message);
    }
}
