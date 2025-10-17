package OOP

class Kalkulator{
    companion object {
        fun tambah (a : Int, b : Int) : Int{
            return a + b
        }
        fun kurang (a : Int, b : Int) : Int{
            return a - b
        }
    }
}

fun main() {
    println(Kalkulator.tambah(5,2))
    println(Kalkulator.kurang(5,2))
}