package OOP

class MahasiswaFunction (val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction ("Nyimas Nisrinaa Kamilah")
    mahasiswaPertama.sayHello()
}