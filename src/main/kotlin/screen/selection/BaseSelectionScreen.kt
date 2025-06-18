package screen.selection

import model.Named
import util.InputHelper
import kotlin.system.exitProcess

abstract class BaseSelectionScreen<T : Named>(
    private var elms: MutableList<T> = mutableListOf(),
    private val objType: String = "архив",
    val onCreate: () -> T,
    val onExit: Boolean,
    val onSelect: (T) -> Unit,
    val onPrint: (T) -> Unit,
) {
    private var options: MutableList<String> = mutableListOf()

    private fun buildOptions(elems: MutableList<T>): MutableList<String> {
        return mutableListOf("Создать $objType").apply {
            addAll(elems.map { it.name })
            add("Выход")
        }
    }

    open fun printOptions() {
        options = buildOptions(elms)
        println("\nВыберите пункт меню:")
        options.forEachIndexed { index, text -> println("$index. $text") }
    }

    fun chooseOption(){
        while (true) {
            when (val option = InputHelper.readInt(options.size, ::printOptions) ) {
                0 -> elms.add(onCreate())
                options.size - 1 -> if(onExit) return else exitProcess(0)
                else -> {
                    onPrint(elms[option - 1])
                    onSelect(elms[option - 1])
                }
            }
            printOptions()
        }
    }
}

