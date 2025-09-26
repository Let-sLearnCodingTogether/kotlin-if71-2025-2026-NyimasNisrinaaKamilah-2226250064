fun array1(users : Array<Int>) {
    for (user in users){
        println(user)
    }
}

fun main() {
    array1(arrayOf(1,3,5,7))
    array1(arrayOf(15,27))
}