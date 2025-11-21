package nextOOP

open class Hewan(val name : String ){ //tambahkan open agar bisa diturunkan
    open fun suara() {
        println("Suara hewan")
    }
}

class Ayam(name: String) : Hewan(name){
    final override fun suara(){
        println("Kuku ruyuk")
    }
}

//open class AnakAyam (name: String) : Hewan (name){
//    override fun suara() {
//        println("Petok petok")
//    }
//}

fun main() {
    val rambo = Ayam ("Rambo")
    rambo.suara()
}