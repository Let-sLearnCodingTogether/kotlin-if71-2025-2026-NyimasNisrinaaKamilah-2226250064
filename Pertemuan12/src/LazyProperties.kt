package oop

class TranskipNilai {
    val list : List<Char> by lazy {
        println("List di akses")
        listOf('A', 'B', 'C')
    }
}

fun main() {
    val nilaiMhs = TranskipNilai()

    println(nilaiMhs.list)
    println(nilaiMhs.list)
}