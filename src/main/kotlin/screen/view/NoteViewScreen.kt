package screen.view

import model.Note
import util.InputHelper

class NoteViewScreen(private val note: Note) {

    fun printOptions() {
        println("\nЗаметка: ${note.name}")
        println(note.text)
        println("\nНажмите \"1\" для возврата в меню заметок")
    }

    fun chooseOption() {
        while (true) {
            if (InputHelper.readInt(2, ::printOptions) == 1) return
            else println("\nНажмите \"1\" для возврата в меню заметок")
        }
    }
}
