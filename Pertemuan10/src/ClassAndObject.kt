package OOP

//Immutable dan Mutable
class MahasiswaConstructor (
    val npm : String,
    val nama : String,
    var ipk : Float
)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor (
        "2226250064",
        "Mahasiswa Pertama",
        3.5f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}