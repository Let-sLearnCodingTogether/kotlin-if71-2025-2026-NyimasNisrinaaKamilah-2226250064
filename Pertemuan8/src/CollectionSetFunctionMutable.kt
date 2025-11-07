fun main() {

    val animals : MutableSet<String> = mutableSetOf("Gajah")
    animals.add("Kucing")
    animals.add("Zebra")

    println(animals)

    animals.remove("Kucing")
    println(animals)

    animals.addAll(listOf("Anjing","Bebek","Babi"))
    println(animals)

    animals.removeAll(listOf("Anjing","Bebek","Babi"))
    println(animals)

    animals.retainAll(listOf("Gajah")) //mengecualikan yang dihapus
    println(animals)

    animals.clear()
    println(animals)
}