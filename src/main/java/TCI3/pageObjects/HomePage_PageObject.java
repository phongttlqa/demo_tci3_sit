package TCI3.pageObjects;

import TCI3.pageUtils.HomePage_PageUI;
import TCI3.pageUtils.Login_PageUI;
import common.CommonWeb;

public class HomePage_PageObject extends CommonWeb {

    public void closePopup() throws InterruptedException {
        Thread.sleep(2000);
        if (getListElement(HomePage_PageUI.button_DONG_popup).size() > 0) clickToElement(HomePage_PageUI.button_DONG_popup);
        backToTopWindows();
    }
}
