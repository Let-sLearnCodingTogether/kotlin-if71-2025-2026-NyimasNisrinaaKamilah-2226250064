fun main() {
    val ages : Array<Int> = arrayOf(60,25,30,40,50)

    println("Ages : ${ages.joinToString()}")

//    ages.sort() //diurutkan dari yang terkecil
//    println("Age sort : ${ages.joinToString()}")

    ages.sorted() //urutan tetap
    println("Age sort : ${ages.joinToString()}")

    ages.reverse() //urutan dari akhir ke awal
    println("Age reverse : ${ages.joinToString()}")

    println("Slice : ${ages.slice(2..4).joinToString()}") //mengambil indek ke 2-4
}