package sortingarray


fun sortIntegerArray() {
    val arr = listOf<Int>(1, 3, 0, 2, 5, 4, 9, 6, 8, 7)
    println("Cau 1: Sap xep 1 day cac so nguyen giam dan")
    println("Mang so nguyen ban dau: ")
    println(arr)
    println("Mang so nguyen sau khi da sap xep giam dan: ")
    print(arr.sortedDescending())
}


class Student {
    var name: String = ""
    var age: Int = 0
    var school: String = ""

    constructor(name: String, age: Int, school: String) {
        this.name = name
        this.age = age
        this.school = school
    }
}

fun sortAgeOfStuddent() {
    val student1 = Student("Nguyen Manh Hung", 35, "PTIT")
    val student2 = Student("Tran Dinh Que", 65, "PTIT")
    val student3 = Student("Nguyen Manh Son", 30, "PTIT")
    val student4 = Student("Nguyen Manh Duy", 22, "PTIT")
    val student5 = Student("Nguyen Hong Son", 21, "PTIT")
    val arrStudent: MutableList<Student> =
        mutableListOf(student1, student2, student3, student4, student5)


    println("=> Cac hoc sinh ban dau trong danh sach: ")
    for (i in arrStudent) {
        println(i.name + " - " + i.age + " - " + i.school)
    }

    println(" \n=> Cac hoc sinh sau khi sap xep tuoi tang dan trong danh sach: ")
    val arrAgeStudent: MutableList<Int> = mutableListOf()
    for (i in arrStudent) {
        arrAgeStudent.add(i.age)
    }

    arrAgeStudent.sort()

    for (i in 0 until arrAgeStudent.size) {
        for (j in 0 until arrStudent.size) {
            if (arrAgeStudent.get(i) == arrStudent.get(j).age) {
                println(
                    arrStudent.get(j).name + " - "
                            + arrStudent.get(j).age + " - "
                            + arrStudent.get(j).school
                )
                break
            }
        }
    }

}


fun main() {
    sortIntegerArray()
    //sortAgeOfStuddent()
}