package screen.creation

import model.Note
import util.InputHelper

class CreateNoteScreen : BaseCreateScreen<Note>() {
    override fun create(): Note {
        println("Введите название заметки:")
        val name = InputHelper.readNotEmptyLine()
        println("Введите текст заметки:")
        val text = InputHelper.readNotEmptyLine()
        println("\nЗаметка \"$name\" создана")
        return Note(name, text)
    }
}