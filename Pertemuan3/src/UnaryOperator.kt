fun main() {
    val a = 5
    val b = -a //hasil: -5
    val c = +a //hasil

    var x = 10
    println(x++) //post - increment -> cetak dulu (10), lalu x jadi 11
    println(++x) //pre - increment ->  x jadi 12, lalu cetak (12)
    println(x--) //post - increment -> cetak dulu (12), lalu jadi 11
    println(--x) //pre - increment -> x jadi 10, lalu cetak (10)

    val isTrue = false
    val result = !isTrue
}