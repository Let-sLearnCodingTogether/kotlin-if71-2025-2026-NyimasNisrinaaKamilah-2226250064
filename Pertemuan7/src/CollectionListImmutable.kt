fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma Struktur Data"
    )

    println("List matakuliah wajib : $mataKuliahWajib")
    println("Size list matakuliahwajib : ${mataKuliahWajib.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }

    println("List matakuliah uppercase : $mataKuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }

    println("Matakuliah lebih dari 10 karakter : $matakuliahLebihDariNKarakter")
}