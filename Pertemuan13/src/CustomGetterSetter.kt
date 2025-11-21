package oop

class NilaiUjian(nilaiUts : Double) {

    //cara pertama
    var nilaiUts : Double = nilaiUts

        //custom getter
        get() = field * 0.1 //backing field

        //custom setter
        set(value) {
            field = if (value < 0) 0.0
            else value
        }

    //cara kedua
    val nilaiAkhir : Double
        get() = nilaiUts * 2
}

fun main() {
    val nilaiMhs1 = NilaiUjian (80.3)

    println(nilaiMhs1.nilaiUts)
    println(nilaiMhs1.nilaiAkhir)

    nilaiMhs1.nilaiUts = -20.0
    println(nilaiMhs1.nilaiUts)

    nilaiMhs1.nilaiUts = 80.5
    println(nilaiMhs1.nilaiUts)
}