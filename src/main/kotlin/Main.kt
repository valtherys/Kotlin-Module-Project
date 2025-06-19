import screen.selection.ArchiveSelectionScreen

fun main(args: Array<String>) {
    println("\nС возвращением! Давайте упорядочим ваши мысли:")

    val archivesScreen = ArchiveSelectionScreen()

    while (true) {
        archivesScreen.printOptions()
        archivesScreen.chooseOption()
    }
}