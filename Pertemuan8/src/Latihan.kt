fun main() {
    val daftarJudulBuku : List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi" // duplikat
    )

    val koleksiGenre: MutableSet<String> = mutableSetOf(
        "Novel",
        "Filsafat",
        "Sejarah",
        "Novel" // tidak masuk karena sudah ada
    )

    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )

    println("--- 1. Inisialisasi Data ---")
    println("List judul buku: $daftarJudulBuku")
    println("Set genre: $koleksiGenre")
    println("Map inventaris buku: $inventarisBuku")
    println("-----------------------------------")

    // --- 2. Manipulasi dan Analisis Data ---
    println("--- 2. Manipulasi dan Analisis Data ---")

    // a. Cetak judul buku berdasarkan ISBN
    val isbnDicari = "978-979-3062-79-2"
    println("Judul buku dengan ISBN $isbnDicari adalah: ${inventarisBuku[isbnDicari]}")

    // b. Tambah buku baru
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")

    // c. Cetak isi inventaris sekarang
    println("Isi inventaris sekarang: $inventarisBuku")

    // d. Hitung jumlah genre unik
    println("Jumlah genre unik yang ada di toko: ${koleksiGenre.size}")

    // e. Cetak semua judul buku di daftarJudulBuku
    println("\nDaftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach { println("- $it") }
}
