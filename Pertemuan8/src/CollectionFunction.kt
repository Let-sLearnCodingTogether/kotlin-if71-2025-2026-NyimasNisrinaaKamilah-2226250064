fun main() {

    //immutable
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    println("Size         : ${animals.size}")
    println("Is Empty     : ${animals.isEmpty()}")
    println("Contains     : ${animals.contains("Kucing")}")
    println("Contains All : ${animals.containsAll(listOf("Zebra", "Kucing"))}")
    println()

    var animalIterator = animals.iterator()
    while (animalIterator.hasNext()){
        println("Animal       : ${animalIterator.next()}")
    }
}