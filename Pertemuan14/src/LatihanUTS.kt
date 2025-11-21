package OOP

fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

// ================================================= CARA PERTAMA ===============================================================
//    //cara lain untuk mencari nilai terendah
//    var tempValue = 120
//    var tempKey = ""
//
//    stokBarang.forEach {
//        if (it.value < tempValue) {
//            tempValue = it.value
//            tempKey = it.key
//        }
//    }
//
//    println("Barang dengan stok terdikit $tempValue dengan jumlah stok $tempKey")
//    println()
// ================================================= CARA KEDUA ===============================================================

    // Menemukan item dengan jumlah stok paling sedikit
    val stokPalingSedikit = stokBarang.minByOrNull { it.value }

    // Menemukan item dengan jumlah stok paling banyak
    val stokPalingBanyak = stokBarang.maxByOrNull { it.value }

    // Menampilkan hasilnya yang sedikit
    if (stokPalingSedikit != null) {
        println("Barang dengan stok paling sedikit: ${stokPalingSedikit.key} dengan stok ${stokPalingSedikit.value}")
    } else {
        println("Tidak ada barang dalam stok.")
    }

    //menampilkan hasilnya yang banyak
    if (stokPalingBanyak != null) {
        println("Barang dengan stok paling banyak: ${stokPalingBanyak.key} dengan stok ${stokPalingBanyak.value}")
    } else {
        println("Tidak ada barang dalam stok.")
    }
}