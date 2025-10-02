fun tampilkanIsiArray(angka: IntArray) {
    print("Isi Array:")
    for (i in angka) {
        print("$i ")
    }
}

fun hitungTotalNilai(angka: IntArray): Int {
    var total = 0
    for (i in angka) {
        total += i
    }
    return total
}

fun hitungRataRata(angka: IntArray): Double {
    val total = hitungTotalNilai(angka)
    return total.toDouble() / angka.size
}

fun main() {
    val angka = intArrayOf(80, 90, 99, 40)

    tampilkanIsiArray(angka)

    val total = hitungTotalNilai(angka)
    val rataRata = hitungRataRata(angka)

    println()
    println("Total    : $total")
    println("Rata-rata: $rataRata")
}