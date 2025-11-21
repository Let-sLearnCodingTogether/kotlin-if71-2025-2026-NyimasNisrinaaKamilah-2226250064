package nextOOP

open class Pegawai(val nama : String, val gajiDasar : Double){
    open fun hitungGaji(){
        println("Gaji dasar Pegawai adalah " + gajiDasar)
    }
}

class Manager(name : String, gajiDasar: Double) : Pegawai (name, gajiDasar){
    override fun hitungGaji(){
        println("Gaji dasar $nama adalah " + gajiDasar)
    }
}

class Programmer(name : String, gajiDasar: Double) : Pegawai (name, gajiDasar){
    override fun hitungGaji(){
        println("Gaji dasar $nama adalah " + gajiDasar)
    }
}

fun main() {
    val karyawan1 = Manager ("Nyimas Nisrinaa", 1500000.0)
    karyawan1.hitungGaji()

    val karyawan2 = Programmer ("Nisrinaa Kamilah", 3500000.0)
    karyawan2.hitungGaji()

    println()

    val karyawan : MutableList <Pegawai> = mutableListOf(
        Manager ("Umar Muhdhor", 1500000.0),
        Programmer ("Jesen Ong", 3500000.0),
        Programmer ("William Hidayat", 5500000.0),
    )

    karyawan.forEach {
        it.hitungGaji()
    }
}