fun main() {
    print("Nama kamu?")
    val name = readln()

    print("Umur kamu?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null){
        println("Nama Kamu : $name")
        println("Umur kamu : $age")
    }else {
        println("Umur tidak valid")
    }
}