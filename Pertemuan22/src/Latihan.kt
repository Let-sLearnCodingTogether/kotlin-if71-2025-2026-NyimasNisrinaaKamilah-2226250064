package Exception

class NilaiTidakValidException(msg : String) : Exception (msg)

val nilai : Int = 0
fun validasiNilai(nilai : Int) {
    if (nilai < 0 || nilai > 100) {
        throw NilaiTidakValidException("Nilai harus diantara 0 hingga 100")
    }
    println("Nilai berhasil diinput: $nilai")
}

fun main() {
    try {
        validasiNilai(105)
    } catch (error : NilaiTidakValidException) {
        println("Error, ${error.message}")
    }
}