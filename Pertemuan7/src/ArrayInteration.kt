fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2")

    users.forEach {
        println("Foreach : $it")
    }

    users.forEach { user ->
        println("Foreach2 : $user")
    }

    users.forEachIndexed { index, user ->
        println("Foreach Index : ${index + 1} :$user")
    }
}