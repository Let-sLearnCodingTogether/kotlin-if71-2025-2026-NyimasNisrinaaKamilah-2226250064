package OOP

class MahasiswaThisKeyWord(val nama : String){
    fun sayGoodbye(nama : String) {
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyWord(
        "Nyimas Nisrinaa Kamilah"
    )

    mahasiswaPertama.sayGoodbye("Nyimas Nisrinaa")
}