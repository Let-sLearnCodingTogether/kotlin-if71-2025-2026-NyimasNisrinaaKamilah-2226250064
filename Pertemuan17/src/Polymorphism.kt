package nextOOP

open class Kendaraan(){
    open fun klakson() {
        println("Suara Klakson")
    }
}

class Mobil() : Kendaraan(){
    override fun klakson() {
        println("klakson Mobil")
    }
}

class Motor() : Kendaraan(){
    override fun klakson() {
        println("klakson Motor")
    }
}

fun main() {

//    val kendaraan1 = Mobil ()
//    kendaraan1.klakson()
//
//    val kendaraan2 = Motor ()
//    kendaraan2.klakson()

    Mobil().klakson()
    Motor().klakson()
}