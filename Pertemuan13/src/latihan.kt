package oop

class PersegiPanjang (val panjang : Double, val lebar : Double){
    //tambah val atau var di value jika tidak di inisialisasi

    //custom accessor getter
    val luas : Double
        get() = panjang * lebar

}

fun main() {
    val hasil1 = PersegiPanjang(5.0, 7.0)
    println(hasil1.luas)
}