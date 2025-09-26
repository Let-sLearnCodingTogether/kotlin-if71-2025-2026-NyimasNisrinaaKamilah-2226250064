fun sayHello1 (firstName : String, lastName : String = "Tanpa lastname"){
    println("Hello, $firstName $lastName")
}

fun main() {
    sayHello1("Budi", "123")
    sayHello1("Ani")
}