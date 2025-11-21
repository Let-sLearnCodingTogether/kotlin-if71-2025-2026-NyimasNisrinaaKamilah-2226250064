package Exception

import kotlin.math.min

class StokHabisException(msg : String) : Exception (msg)

class Barang (val nama : String,var stok : Int)

fun beliBarang(barang: Barang, jumlahBeli : Int) {
    if (jumlahBeli > barang.stok) {
        throw StokHabisException("Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}")
    }
    barang.stok -= jumlahBeli
    println("Berhasil membeli $jumlahBeli ${barang.nama}")
}

fun main() {
    val sabun = Barang("Sabun", 5)
    try {
        beliBarang(sabun, 10)
    } catch (error : StokHabisException) {
        println(error.message)
    }


    val minyak = Barang("Minyak", 5)
    try {
        beliBarang(minyak, 3)
    } catch (error : StokHabisException) {
        println(error.message)
    }
}