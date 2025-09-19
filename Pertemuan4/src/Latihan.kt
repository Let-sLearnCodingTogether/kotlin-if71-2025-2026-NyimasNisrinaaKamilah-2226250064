fun main() {
    val hari : Array <String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    println("=======================================")
    println("Jumlah Hari   : ${hari.size}")
    println("Hari Pertama  : ${hari.get(0)}")
    println("Hari Terakhir : ${hari.get(6)}")
    hari.set(4, "Jum'at Barokah")
    println(hari[4])
    println("=======================================")
}