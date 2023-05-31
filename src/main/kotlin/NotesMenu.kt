import java.util.Scanner

class NotesMenu(val name: String, private val list: MutableMap<Int, NotesScreen>) {

    fun menu(sp: MutableMap<Int, NotesMenu>, last: Int) {
        println("Список заметок архива '$name':\n" +
                "0. Создать заметку")
        list.keys.forEach { key -> println("${key + 1}. ${list[key]!!.name}") }
        println("${list.size + 1}. Выход")
        val sc: Int = check(list.size) ?:return
        if (sc == 0) create()
        else if (sc <= list.size) while (true) list[sc-1]!!.menu(sp, last)
        else if (sc == list.size + 1) exit()
    }

    private fun create() {
        println("Введите название Заметки:")
        val name = Scanner(System.`in`).nextLine()
        println("Введите текст Заметки:")
        val text = Scanner(System.`in`).nextLine()
        list[list.size] = NotesScreen(name, text)
        println("Создана заметка '$name'")

    }

    private fun exit() {
        startArchive()
    }


}