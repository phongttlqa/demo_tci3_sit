Feature: 01_Đăng nhập

  Background:
    Given LoginPage: mở trang tci3
    Then LoginPage: kiểm tra mở trang Đăng nhập thành công với button "ĐĂNG NHẬP" được hiển thị

  @login @loginSuccess
  Scenario Outline: Testcase 01 - Đăng nhập thành công
    Given LoginPage: nhập thông tin đăng nhập
      | case                         | email   | matKhau   |
      | Nhập [Email],[Mật khẩu] đúng | <email> | <matKhau> |
    When LoginPage: nhấn button Đăng nhập
    And HomePage: đóng popup nếu hiển thị
    Then HomePage: kiểm tra login thành công với tên user "<userName>" được hiển thị
    Examples:
      | email      | matKhau | userName          |
      | 105C300486 | abc123  | test TCBS71863318 |

  @loginFail
  Scenario Outline: Testcase 02 - Đăng nhập không thành công
    Given LoginPage: nhập thông tin đăng nhập
      | case   | email   | matKhau   |
      | <case> | <email> | <matKhau> |
    When LoginPage: nhấn button Đăng nhập
    Then LoginPage: kiểm tra hiển thị thông báo lỗi
      | thongBaoLoi   |
      | <thongBaoLoi> |
    Examples:
      | case                       | email      | matKhau | thongBaoLoi                                        |
      | Nhập [Email]không đúng     | a          | abc123  | (203004) Tên đăng nhập hoặc mật khẩu không hợp lệ. |
      | Nhập [Mật khẩu] không đúng | 105C300486 | 1       | (203004) Tên đăng nhập hoặc mật khẩu không hợp lệ. |