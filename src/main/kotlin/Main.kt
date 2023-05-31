import java.util.*

val archive = ArchivesMenu()

fun check(m: Int) : Int? {
    val sc: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
    if (sc == null) {
        println("Следует вводить цифру")
        return null
    }
    if ((sc > m + 1) or (sc < 0)) {
        println("Такой цифры нет")
        return null
    }
    return sc

}

fun startArchive() {
    while (true) {
        archive.menu()
    }
}

fun main() {
    startArchive()

}
