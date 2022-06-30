Feature: 01_Đăng nhập

  Background:
    Given LoginPage: mở trang tci3
    Then LoginPage: kiểm tra mở trang Đăng nhập thành công với button "ĐĂNG NHẬP" được hiển thị

  @login
  Scenario Outline: 01_Đăng nhập thành công
    Given LoginPage: nhập thông tin đăng nhập
      | case                         | email   | matKhau   |
      | Nhập [Email],[Mật khẩu] đúng | <email> | <matKhau> |
    When LoginPage: nhấn button Đăng nhập
    And HomePage: đóng popup nếu hiển thị
    Then HomePage: kiểm tra login thành công với tên user "<userName>" được hiển thị
    Examples:
      | email      | matKhau | userName          |
      | 105C300486 | abc123  | test TCBS71863318 |

#  Scenario Outline: 02_Đăng nhập không thành công
#    Given LoginPage: nhập thông tin đăng nhập
#      | email   | matKhau   |
#      | <email> | <matKhau> |
#    When LoginPage: nhấn button Đăng nhập
#    Then LoginPage: kiểm tra hiển thị thông báo lỗi
#      | thongBaoLoi   |
#      | <thongBaoLoi> |
#    Examples:
#      | case                       | email      | matKhau | thongBaoLoi                                               |
#      | Nhập [Email]không đúng     |            | abc123  | Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng nhập lại |
#      | Nhập [Mật khẩu] không đúng | 105C300486 |         | Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng nhập lại |
