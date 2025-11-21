package OOP

//library
class UserProfile(val username : String) {

}

fun UserProfile.usernameToUpperCase() : String {
    return this.username.uppercase() //this untuk menuju kekelasnya sendiri
}

fun main() {
    val user1 = UserProfile("Nyimas")
    println(user1.usernameToUpperCase())
}