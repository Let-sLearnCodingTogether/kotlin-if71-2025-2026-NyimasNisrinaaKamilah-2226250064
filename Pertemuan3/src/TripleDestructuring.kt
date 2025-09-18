fun main() {
    val firstUser : Triple<String, Byte, Boolean> = Triple("User 1", 20, false)

    //destructuring
    val (username, age, kom) = firstUser

    println(username)
    println(age)
    println(kom)
}