package bai2

fun main() {
    println("Nhap vao 1 day so dien thoai bat ki: ")
    val phoneNumber: String? = readLine();
    val arrChar = phoneNumber?.toCharArray();

    println("=> So dien thoai da nhap vao: $phoneNumber")
    println("=> So dien thoai sau khi da convert sang chu:")
    if (arrChar != null) {
        for (eachChar in arrChar) {
            when (eachChar) {
                '0' -> print("- Không ")
                '1' -> print("- Một ")
                '2' -> print("- Hai ")
                '3' -> print("- Ba ")
                '4' -> print("- Bốn ")
                '5' -> print("- Năm ")
                '6' -> print("- Sáu ")
                '7' -> print("- Bảy ")
                '8' -> print("- Tám ")
                '9' -> print("- Chín ")
            }
        }
    }
}