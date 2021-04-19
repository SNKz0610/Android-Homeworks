Android Homeworks
(19/0/2021)
Question: Trong project Android của bạn, người dùng cần chạy tối thiểu phiên bản Android nào mới có thể sử dụng được app?
* 
- Người dung cần chạy tối thiểu phiên bản Android 16.0 để có thể sử dụng app. Thông số này chúng ta có thể xem ở thư mục build.gradle (module) ở mục defaultConfig, dòng minSdkVersion. Ngoài ra chúng ta còn 1 thông số về phiên bản android lớn nhất mà project hỗ trợ (như với app của mình là Android 30.0) ở dòng ngay ở dưới là targetSdkVersion
