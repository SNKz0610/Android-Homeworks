package ptbac2


fun main() {
    while (true) {
        println("Giai phuong trinh bac 2: a.x^2 + b.x + c = 0")
        println("Nhap a:")
        val a: Float? = readLine()?.toFloat()
        println("Nhap b:")
        val b: Float? = readLine()?.toFloat()
        println("Nhap c:")
        val c: Float? = readLine()?.toFloat()

        if (a == 0.toFloat()) {
            val result: Float = -b?.let { c?.div(it) }!!
            println("> Phuong trinh co 1 nghiem duy nhat x = $result")
            println("=================================")
        } else {
            val delta1: Float = (b!! * b!!) - (4 * a!! * c!!)

            if (delta1 == 0.toFloat()) {
                val result1: Float = -b!! / (2 * a!!)
                println("Phuong trinh co nghiem kep la x1 = x2 = $result1")
                println("=================================")
            } else if (delta1 < 0.toFloat()) {
                println("=> Phuong trinh vo nghiem!")
                println("=================================")
            } else if (delta1 > 0.toFloat()) {
                println("=>Phuong trinh co 2 nghiem phan biet: ")
                val sqrtDelta: Float = Math.sqrt(delta1.toDouble()).toFloat()
                val x1: Float = (-b!! - sqrtDelta) / (2 * a!!)
                val x2: Float = (-b!! + sqrtDelta) / (2 * a!!)
                println("+x1 = $x1")
                println("+x1 = $x2")
                println("=================================")
            }
        }
    }
}