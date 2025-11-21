enum class DayOfTheWeek2(val isWeekend : Boolean) {
    Senin(false),
    Selasa(false),
    Rabu(false),
    Kamis(false),
    Jumat(false),
    Sabtu(true),
    Minggu(true)
}

fun main() {
    val today = DayOfTheWeek2.Minggu
    println("hari ini : hari ${today.name}, " +
            "hari ini weekend : ${today.isWeekend}")
}