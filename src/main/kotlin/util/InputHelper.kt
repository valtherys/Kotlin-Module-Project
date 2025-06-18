package util

object InputHelper {
    fun readNotEmptyLine(): String {
        while (true) {
            val text = readlnOrNull()?.trim() ?: ""
            if (text.isNotEmpty()) return text
            println("Поле не может быть пустым. Попробуйте еще раз:")
        }
    }

    fun readInt(size: Int, printOptions: () -> Unit): Int {
        while (true) {
            val optionNumber = readlnOrNull()?.trim()?.toIntOrNull()

            when {
                optionNumber == null -> {
                    println("\nКоманда должна быть числом. Попробуйте еще раз")
                    printOptions()
                }
                optionNumber > size - 1 -> {
                    println("\nТакой команды нет. Попробуйте еще раз")
                    printOptions()
                }
                optionNumber < 0 -> {
                    println("\nТакой команды нет. Попробуйте еще раз")
                    printOptions()
                }
                else -> return optionNumber
            }
        }
    }
}