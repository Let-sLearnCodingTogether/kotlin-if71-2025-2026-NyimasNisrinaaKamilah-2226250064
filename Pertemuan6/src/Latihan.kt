fun hitungPanjangNama (name : String? = null): Int{
    if (name != null){
        return name.length
    }else {
        return 0
    }
}

fun main() {
    println(hitungPanjangNama("Nyimas"))
}