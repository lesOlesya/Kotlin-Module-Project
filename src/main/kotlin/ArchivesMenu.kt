import kotlin.system.exitProcess
import java.util.Scanner

class ArchivesMenu {
    private val list = mutableMapOf<Int, NotesMenu>()

    fun menu() {
        println("Список архивов:\n" +
                "0. Создать архив")
        list.keys.forEach { key -> println("${key + 1}. ${list[key]!!.name}") }
        println("${list.size + 1}. Выход")
        val sc: Int = check(list.size) ?:return
        if (sc == 0) create()
        else if (sc <= list.size) while (true) list[sc-1]!!.menu(list, sc-1)
        else if (sc == list.size + 1) exit()
    }

    private fun create() {
        println("Введите название Архива:")
        val name = Scanner(System.`in`).nextLine()
        list[list.size] = NotesMenu(name, mutableMapOf())
        println("Создан архив '$name'")

    }

    private fun exit() {
        exitProcess(-1)
    }


}