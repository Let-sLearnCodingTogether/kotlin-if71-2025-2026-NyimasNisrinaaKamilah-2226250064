package OOP

data class Kendaraan(val merek : String, val tahun : Int)

fun main() {
    val tayo = Kendaraan("Tayo", 2015)
    //print(tayo.merek)
    val(merek,tahun) = tayo
    println(merek)
    println(tahun)
}