fun array1(firstName: String, vararg users : String) {
    println(firstName)
    for (user in users){
        println(user)
    }
}

fun main() {
    array1("TEST", "User 1", "User 2")
}