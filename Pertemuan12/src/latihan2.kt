package oop

class Mahasiswa(ipk : Double) {
    var ipk : Double = ipk

        //custom setter
        set(value) {
            field = if (value < 0) 0.0
            else if (value > 4.0) 4.0
            else value
        }

    init {
        this.ipk = ipk
    }
}

fun main() {

    val ipkMahasiswa = Mahasiswa(-3.0)
    println(ipkMahasiswa.ipk)

    ipkMahasiswa.ipk = 5.6
    println(ipkMahasiswa.ipk)

    ipkMahasiswa.ipk = 3.6
    println(ipkMahasiswa.ipk)
}
