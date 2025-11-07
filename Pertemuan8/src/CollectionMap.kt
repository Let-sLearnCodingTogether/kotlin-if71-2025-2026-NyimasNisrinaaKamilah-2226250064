fun main() {

    //immutable
    val buah : Map<String, Int> = mapOf (
        "Jeruk" to 10, // 10 adalah value nya
        "Apel" to 3
    )

    println(buah["Jeruk"])

    val buah2 : MutableMap<String, Int> = mutableMapOf (
        "Jeruk" to 10, // 10 adalah value nya
        "Apel" to 3
    )

    println(buah2["Apel"])

}