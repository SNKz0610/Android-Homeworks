package dailyhomeworks2604

fun main (){
    println("Nhap vao 1 chuoi bat ki: ")
    val name:String? = readLine();
    val arrChar = name?.toCharArray()
    val resultList = arrayListOf<String>();
    println("Chuoi nhap vao: $name")
    println("=> Mang ket qua so lan xuat hien cua cac ki tu trong chuoi tren:")
    var position: Int = 0;
    if (arrChar != null) {
        for(eachChar in arrChar){
            var count: Int = 1
            var position2: Int = 0;
            for (eachChar2 in arrChar){
                if (position != position2) {
                    if (eachChar.equals(eachChar2, ignoreCase = true)) {
                        count++;
                    }
                }
                position2++;
            }
            resultList.add("$eachChar - $count")
            position++;
        }
    }

    for (element in resultList){
        println(element);
    }
}