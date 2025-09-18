fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    //Program akan berhenti disini dengan error
    fail("Terjadi Kesalahan Fatal!")
}