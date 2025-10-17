package OOP

data class GameItem(
    val id : Int,
    val name : String,
    val value : Int,
    val rarity : String)

fun main() {
    val DaftarItem = mutableListOf<GameItem>()

    val item1 = GameItem(1,"Pedang Besi", 100, "Common")
    val item2 = GameItem(2,"Ramuan Kesehatan", 50 , "Common")
    val item3 = GameItem(3,"Jubah Bayangan", 500, "Epic")

    DaftarItem.addAll(listOf(item1, item2, item3))

    val cursedSword = item1.copy(name = "Pedang Besi Terkutuk", value = 250)
    println(cursedSword.name)
    println()

    println("Objek Pedang Besi Asli : $item1")
    println("Objek Pedang Besi Terkutuk : $cursedSword")
    println()

    println("Isi Inventaris: ")
    DaftarItem.forEach { println(it) }
}