package screen.creation

import model.Archive
import util.InputHelper

class CreateArchiveScreen : BaseCreateScreen<Archive> {
    override fun create(): Archive {
        println("Введите имя архива:")
        val name = InputHelper.readNotEmptyLine()
        println("\nАрхив \"$name\" создан")
        return Archive(name)
    }
}
