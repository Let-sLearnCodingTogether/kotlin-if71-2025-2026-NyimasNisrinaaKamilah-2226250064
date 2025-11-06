package OOP

class Karyawan (val nama : String, val id : String, val gajiPokok : Double){

    fun tampilkanProfile() {
        println("Nama      : $nama")
        println("ID        : $id")
        println("Gaji Pokok: Rp. ${gajiPokok.toInt()}")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk.toDouble() / 22.0) * gajiPokok
    }
}

fun main() {
    val karyawanA = Karyawan ("Nyimas Nisrinaa Kamilah", "N001", 10000000.0)
    println("Profile Karyawan A:")
    karyawanA.tampilkanProfile()
    println()

    val karyawanB = Karyawan ("Reni Aurelia", "N002", 1500000.0)
    println("Profile Karyawan B:")
    karyawanB.tampilkanProfile()
    println()

    val gajiKaryawanA = karyawanA.hitungGajiBulanan(10)
    println("Total gaji: Rp. $gajiKaryawanA")
    val gajiKaryawanB = karyawanA.hitungGajiBulanan(19)
    println("Total gaji: Rp. $gajiKaryawanB")
}