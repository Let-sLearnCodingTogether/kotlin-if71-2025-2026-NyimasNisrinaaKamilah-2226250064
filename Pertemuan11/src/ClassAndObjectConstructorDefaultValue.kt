package OOP

class MahasiswaConstructorDefaultValue (
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
){
    init {
        println("Ini block init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        "2226250064",
        "Mahasiswa Pertama"
    )

    println(mahasiswaPertama.ipk)

    val mahasiswaKedua = MahasiswaConstructorDefaultValue (
        "2226250028",
        "Mahasiswa Kedua",
        3.9f
    )
    println(mahasiswaKedua.ipk)
}