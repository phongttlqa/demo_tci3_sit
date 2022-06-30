package TCI3.StepsDefinitions;

import TCI3.pageObjects.Login_PageObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings({ "deprecation" })
public class Login_PageDefinitions {

    @Steps
    Login_PageObject login;

//    @Given("LoginPage: mở trang tci")
//    public void openLink(){
//        login.openPage();
//    }

    @Given("LoginPage: mở trang tci3")
    public void loginpage_mở_trang_tci() {
        login.openPage();
    }


    @Then("LoginPage: kiểm tra mở trang Đăng nhập thành công với button {string} được hiển thị")
    public void loginpageKiểmTraMởTrangĐăngNhậpThànhCôngVớiButtonĐượcHiểnThị(String s) {
        login.verifyOpenLoginPage(s);
    }

    @Given("LoginPage: nhập thông tin đăng nhập")
    public void loginpageNhậpThôngTinĐăngNhập(DataTable dataTable) {
        String email = login.getValueColumnDataTableBDD(dataTable, "email");
        String password = login.getValueColumnDataTableBDD(dataTable, "matKhau");

        if (email.trim().length() > 0 && password.trim().length() > 0) {
            login.inputToEmailAndPassword(email, password);
        }
    }

    @When("LoginPage: nhấn button Đăng nhập")
    public void loginpageNhấnButtonĐăngNhập() {
        login.clickButtonLogin();
    }


    @Then("LoginPage: kiểm tra hiển thị thông báo lỗi")
    public void loginpageKiểmTraHiểnThịThôngBáoLỗi(DataTable table) {
        String message = login.getValueColumnDataTableBDD(table, "thongBaoLoi");
        login.verifyErrorMessagePopup(message);
    }
}
