fun main() {
    val finalExam = 'A'
    var nilaiKotlin = 0.00

    when(finalExam){
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' ->println("Ya bisa lulus")
        else -> {
            println("Tidak lulus")
        }
    }

    when(finalExam){
        'A', 'B' -> println("Lulus")
        'C' ->println("Ya bisa lulus")
        else -> {
            println("Tidak lulus")
        }
    }

    when {
        nilaiKotlin == 0.00 -> nilaiKotlin == 10.0
    }
    println(nilaiKotlin)


//    var status = false
//    when (finalExam){
//        'A', 'B' -> status = true
//        else -> status = false
//    }
//    println(status)

    var status = when(finalExam) {
        'A', 'B' -> true
        else -> false
    }
    println(status)

    val nilaiLulus = arrayOf('A','B')
    when (finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when (finalExam) {
        is Char -> println("ya, ini char")
        is String -> println("Ini String")
        !is Char -> println ("Bukan Char")
    }
}