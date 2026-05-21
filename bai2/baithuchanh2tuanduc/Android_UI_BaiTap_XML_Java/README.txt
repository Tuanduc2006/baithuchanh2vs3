BÀI TẬP THIẾT KẾ GIAO DIỆN ANDROID STUDIO - XML + JAVA

Cách dùng nhanh:
1. Mở Android Studio.
2. Tạo project mới: Empty Views Activity, Language: Java.
3. Copy thư mục app/src/main/res/layout vào project của bạn.
4. Copy thư mục app/src/main/res/drawable vào project của bạn.
5. Copy các file Java trong app/src/main/java/com/example/baitapui vào đúng package project của bạn.
6. Nếu package của bạn khác com.example.baitapui, sửa dòng package ở đầu các file Java.
7. Thêm dependencies vào build.gradle(Module: app):
   implementation 'androidx.constraintlayout:constraintlayout:2.2.0'
   implementation 'androidx.cardview:cardview:1.0.0'
8. Sync Gradle rồi chạy app.

Nội dung:
- Bài 1: LinearLayout vertical, căn giữa, thông tin cá nhân.
- Bài 2: ConstraintLayout, guideline, form đăng nhập.
- Bài 3: ScrollView + CardView, 6 môn học.
- Bài 4: Fragment, đổi nội dung trên cùng màn hình.
- Bài 5: Mini Project UI quản lý lớp học, gồm trang chủ, danh sách sinh viên, thêm sinh viên.
