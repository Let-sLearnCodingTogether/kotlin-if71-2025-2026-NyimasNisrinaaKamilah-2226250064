fun main() {

    //mutable
    val daftarJudulBuku : MutableMap<String, Int> = mutableMapOf (
        "Jeruk" to 10, // 10 adalah value nya
        "Apel" to 3
    )

    buah["Jeruk"] = 12
    //buah.put("Jeruk") = 20
    println(buah.entries)

    buah.remove("Jeruk")
    println(buah.entries)

    buah.putAll(mapOf(
        "Anggur" to 2
    ))
    println(buah.entries)

    buah.clear()
    println(buah.entries)

}