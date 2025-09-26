fun main() {
    //Null
    var student : String = "Budi"
    println(student)

    //student = null

    var prodiIf : String? = "IF"
    println(prodiIf?.length)

    var prodiIF : String? = null
    println(prodiIF?.length)

    var prodiSi : String? = null
    println(prodiSi?: "Tanpa Prodi")

    var token : String? = null
    println(token!!.length)

    var email : String? = null
    if (email != null){
        println(email.length)
    }
}