package TCI3.StepsDefinitions;

import TCI3.pageObjects.HomePage_PageObject;
import TCI3.pageObjects.Login_PageObject;
import TCI3.pageUtils.HomePage_PageUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings({ "deprecation" })
public class HomePage_PageDefinitions {

    @Steps
    HomePage_PageObject homePage;

    @Then("HomePage: kiểm tra login thành công với tên user {string} được hiển thị")
    public void homepageKiểmTraLoginThànhCôngVớiTênUserĐượcHiểnThị(String s) {
        homePage.verifyContainTextValueElement(HomePage_PageUI.txt_user, s);
    }

    @And("HomePage: đóng popup nếu hiển thị")
    public void homepageĐóngpopupNếuHiểnThị() throws InterruptedException {
        homePage.closePopup();
    }
}
