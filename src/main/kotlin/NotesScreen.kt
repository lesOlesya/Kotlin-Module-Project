import java.util.*

class NotesScreen(val name: String, private var text: String) {

    fun menu(sp: MutableMap<Int, NotesMenu>, last: Int)  {
        println("Заметка '${name}':\n" +
                "0. Добавить текст\n" +
                "1. Вывести текст\n" +
                "2. Выход")
        val sc: Int = check(1) ?:return
        if (sc == 0) create()
        else if (sc == 1) println(text)
        else if (sc == 2) while (true) sp[last]!!.menu(sp, last)
    }

    private fun create() {
        println("Введите текст, который хотите добавить:")
        val sc = Scanner(System.`in`).nextLine()
        text += sc
        println("Текст добавлен")

    }



}