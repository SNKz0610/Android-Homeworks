package bai1

fun main() {
    println("Cac so chia het cho 3 trong khoang: ")

    print("+[1,100]: ")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print(" $i")
        }
    }

    print("\n+[200,100]: ")
    for (i in 200 downTo 100) {
        if (i % 3 == 0) {
            print(" $i")
        }
    }
}