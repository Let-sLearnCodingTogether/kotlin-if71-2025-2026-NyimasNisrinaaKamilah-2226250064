fun main() {
    val firstUser : Pair<String, Int> = Pair("User 1", 20)
    //untuk data yang berpasangan misal long lat
    println(firstUser.first)
    println(firstUser.second)

    val secondUser : Pair<String, Int> = "User 2" to 20
    println(secondUser.first)
    println(secondUser.second)
}