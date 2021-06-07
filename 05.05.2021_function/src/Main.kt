package main

fun returnList(): IntArray {
    var list = intArrayOf()
    for (i in 1..100) {
        list += i
    }
    return list
}

fun checkPrimeNumber(number: Int): Boolean {
    var uocSo = 2
    var result = true
    for (i in 2 until number) {
        if (number % i == 0) {
            uocSo++
            break
        }
    }
    if (uocSo == 2) {
        result = false
    }
    return result
}

fun returnPrimeList(list: IntArray): IntArray {
    var listPrime = intArrayOf()
    for (i in 0 until list.size) {
        var check: Boolean = checkPrimeNumber(i)
        if (!check) {
            listPrime += i
        }
    }
    return listPrime
}

fun finalList(): IntArray {
    var listInput: IntArray = returnList()
    var listFinal: IntArray = returnPrimeList(listInput)

    return listFinal
}

fun main() {
    var listFinal: IntArray = finalList()
    println("=> Danh sach cac so nguyen to tu 1...100 la: ")
    for (i in 0 until listFinal.size) {
        var primeNumber = listFinal[i]
        print("$primeNumber ")
    }
}