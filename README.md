ĐỀ TÀI: ỨNG DỤNG TÍNH TIỀN NƯỚC CHO CÔNG TY DỊCH VỤ NƯỚC ĐÔ THỊ
I. Hiện trạng:
1. Tổng quan thế giới thực :
- Giới thiệu : Ngày nay, nhu cầu sử dụng nước ngày càng tăng , phương thức thanh toán truyền thống bằng việc ghi ,xuất hóa đơn gây ra nhiều điều bất tiện ,cùng với sự bùng nổ mạnh mẽ của internet ,việc thanh toán hóa đơn online trở nên hiệu quả hơn .
- Quy mô hoạt động :Ứng dụng được sử dụng trong phạm vi khách hàng sử dụng nước gồm các đối tượng: admin(quản lý hệ thống ), nhân viên ,chủ hộ.
- Các hoạt động tham gia :
• Quản lý các tài khoản chủ hộ , nhân viên
• Quản lý nhân viên
• Quản lý chủ hộ
• Nhập hóa đơn
• Thống kê doanh thu , số nước sử dụng ,số lượng chủ hộ
-Các chức năng: 
	Chủ hộ : xem hóa đơn (tất cả số nước tất cả các tháng ).
	Nhân viên : +Thêm ,xóa ,sửa hóa đơn , công tơ điện. 
+Thêm,xóa,sửa chủ hộ (và account của chủ hộ) .
	Quản lý : Tất cả các chức năng của chủ hộ và nhân viên 

- Mục tiêu : Xây dựng phần mềm giúp cho việc thanh toán hóa đơn dễ dàng , dễ quản lý , sử dụng , hiệu quả , tiện lợi.
- Phần mềm sử dụng :Netbeans,SQL Server
- Ngôn ngữ sử dụng :Java
- Phần mềm được viết dưới dạng Application Desktop theo mô hình MVC .
2. Các khái niệm:
-Bảng sử dụng nước liên quan đến việc theo dõi và quản lý thông tin về sử dụng nước của các chủ hộ.
-Chủ hộ là khách hàng của công ty bao gồm các thông tin :Cccd,tên, địa chỉ, số điện thoại và các thông tin cá nhân khác của chủ hộ,chủ hộ có tài khoản có thể xem thông tin hóa đơn của bản thân trong các tháng.
- Nhân viên là người trong nội bộ nhân sự của công ty được sắp xếp làm trong công ty bao gồm:Cccd,tên, địa chỉ, số điện thoại và các thông tin cá nhân khác của nhân viên,nhân viên là cách gọi chung của: quản lý và nhân viên. Tuy nhiên khi đề cập đến bộ phận hoặc phân quyền thì nhân viên chỉ gồm: nhân viên tính và thu tiền nước.
- Quản lý là nhân viên điều hành và quản trị hệ thống, có trách nhiệm quản lý các chức năng của nhân viên, được công ty tín nhiệm quyền quản lý tài khoản.Mọi thông báo cũng như quyết định của công ty đều do người này truyền đạt và tổ chức thực hiện.
- Tài khoản là đại diện của nhân viên và chủ hộ khi đăng nhập vào ứng dụng. Quyền cũng chính là chức danh nghiệp vụ của nhân viên.
- Hóa đơn là một khái niệm quan trọng liên quan đến việc cung cấp thông tin về chi phí sử dụng nước của chủ hộ, là biểu mẫu liệt kê các phương thức thanh toán,trạng thái thanh toán,chỉ số đầu tháng , chỉ số cuối tháng của công tơ nước(ghi trong bảng sử dụng nước) và trên đó thể hiện rõ giá tiền  của từng m3 nước và tổng tiền mà khách phải trả.
3. Cơ cấu tổ chức và quy trình :
	Tổ chức quản lý, nhân viên, chủ hộ và tài khoản :
- Trong một thời điểm, sẽ có nhiều nhân viên, nhiều chủ hộ và chỉ có 1 quản lý. Quản lý có trách nhiệm điều hành, trông coi tiến độ làm việc của nhân viên cũng như các thông tin tài khoản của nhân viên, chủ hộ. 
- Việc tuyển dụng, thêm nhân viên hay một chủ hộ nào đó có nhu cầu đăng ký sử dụng nước bên Công ty  thì đều do phía bộ phận nhân sự của Công ty. Dựa vào thông tin bên phía bộ phận cung cấp, phía Admin sẽ quyết định xem có nên cấp tài khoản cho nhân viên hoặc chủ hộ hay không dưới quyền yêu cầu của quản lý.
- Một chủ hộ (CHUHO) sẽ bao gồm các thuộc tính :
• CCCD – Căn cước công dân (khóa chính)
• Name – Họ tên chủ hộ
• DOB – Ngày sinh chủ hộ
• Address – Địa chỉ nơi ở chủ hộ
• Phone – Số điện thoại chủ hộ
• CCCD_NV– Căn cước công dân của nhân viên (khóa ngoại)
• id_congtonuoc - là id_congtonuoc của bảng sử dụng nước(khóa ngoại)


- Một nhân viên (STAFFS) sẽ bao gồm các thuộc tính :
• CCCD – Căn cước công dân (khóa chính)
• Name – Họ tên nhân viên
• DOB – Ngày sinh nhân viên
• Address – Địa chỉ nơi ở nhân viên
• Phone – Số điện thoại của nhân viên
- Account sẽ đóng vai trò phân quyền các thực thể. Trong Account có 4 thuộc tính: CCCD (Khóa chính), Username , Password, Privilege (phân quyền dựa theo thông tin). Nghĩa là các trường dữ liệu của nhân viên, chủ hộ sẽ được phân rã vào đưa vào Account: CCCD = CCCD (Nhân viên, chủ hộ); Username, Password (do nhân viên, chủ hộ đặt). Thường khi tạo tài khoản, nhân viên hoặc chủ hộ sẽ cung cấp thông tin cũng như sơ yếu lý lịch của mình cho bên bộ phận nhân sự, bộ phận nhân sự sẽ liên hệ với quản lý. Sau đó quản lý sẽ đưa ra các quyền cũng như thông tin của các thực thể cho Admin, Admin sẽ tạo tài khoản dựa theo tên và mật khẩu mà chủ hộ hoặc nhân viên đã cung cấp. CCCD chính là chìa khóa quan trọng nhất cho việc phân quyền cũng như bảo mật thông tin, Admin sẽ dựa vào CCCD để tìm ra thông tin các thực thể từ đó tạo tài khoản và cấp quyền cho họ:
• 0: là các tài khoản thuộc phân quyền chủ hộ. Chủ hộ chỉ được xem thông tin tài khoản của mình, thông tin nhân viên đang làm việc cho mình
• 1: là các tài khoản thuộc phân quyền nhân viên. Nhân viên chỉ được xem thông tin các chủ hộ mà mình đang làm việc, thông tin hóa đơn tiền nước của các chủ hộ, được quyền quyết định chốt hóa đơn của chủ hộ. Khi làm việc, nhân viên sẽ nhìn vào chỉ số công tơ nước (bảng sử dụng nước), dựa vào thông số trên công tơ nước, nhân viên sẽ tự động tính tiền nước thông qua ứng dụng và xuất hóa đơn cho chủ hộ. Ngoài ra, nhân viên sẽ được quyền sửa lại hoặc xóa số công tơ nước mà chủ hộ sử dụng, nhưng việc sửa lại sẽ được đánh dấu vào hệ thống, hệ thống từ hóa đơn đó báo lên quản lý và dưới quyền của quản lý liệu có nên xóa sửa hay không.

• 2: là các tài khoản thuộc phân quyền quản lý. Quản lý (có thể xem là Admin) sẽ có tất cả chức năng bên chủ hộ và nhân viên. Ngoài ra, quản lý còn có thể xem được thông tin doanh thu, kiểm tra xem chủ hộ nào đã đóng tiền nước chưa.
	Tổ chức sử dụng nước, hóa đơn nước:
- Trong một hộ gia đình, mỗi nhà đều có một công tơ nước ,mỗi ID của công tơ nước sẽ là khóa chính của bảng sử dụng nước.
- Và mỗi bảng sử dụng nước sẽ dẫn xuất ra hóa đơn nước riêng. Hóa đơn nước cũng sẽ có ID riêng, nghĩa là cứ mỗi lần nhân viên ghi nước và chốt hóa đơn thì một hóa đơn nước được tạo ra, và xác định xem hóa đơn đó thuộc ID công tơ nước nào.
- Một Bảng sử dụng nước  sẽ bao gồm các thuộc tính :
• id_congtonuoc – ID công tơ nước(khóa chính)
• Days - ngày chốt chỉ số nước.
• SoNuocCu- Chỉ số dùng của công tơ nước kể từ khi nhân viên chốt tháng trước
• SoNuocMoi – Chỉ số dùng hiện tại của công tơ nước.
- Một hóa đơn điện sẽ bao gồm các thuộc tính :
• ID – ID hóa đơn điện (khóa chính)
• Day – Ngày xuất hóa đơn
• TrangThai – Trạng thái hóa đơn đã được thanh toán chưa
• CCCD_CHUHO – CCCD của chủ hộ
• CCCD_NV – ID của nhân viên chốt và xuất hóa đơn
• Amount – Tiền điện đã được tính toán thông qua nhân viên và phần mềm
-  Khi xuất hóa đơn điện, nhân viên sẽ dựa vào các thông tin như: ngày chốt hóa đơn cụ thể; trạng thái thanh toán; chỉ số nước hiện tại mà nhà đó đã tiêu thụ dựa theo công tơ. Họ sẽ ghi các thông tin đó ra và các thông tin mặc định như TrangThai, ChiSoCu, amount,... đều do phần mềm sẽ tự động thêm vào và sửa theo dữ liệu mặc định.
- Việc thống kê doanh thu hoặc kiểm tra chủ hộ có chốt hóa đơn tiền điện hay chưa sẽ đều phụ thuộc vào thực thể HOADON.
