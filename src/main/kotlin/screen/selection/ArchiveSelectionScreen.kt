package screen.selection

import screen.creation.CreateArchiveScreen
import model.Archive


class ArchiveSelectionScreen : BaseSelectionScreen<Archive>(
    onCreate = {
        val createArchiveScreen = CreateArchiveScreen()
        createArchiveScreen.create()
    },
    onExit = false,
    onSelect = {
        archive ->
        val noteSelectionScreen = NoteSelectionScreen(archive)
        noteSelectionScreen.printOptions()
        noteSelectionScreen.chooseOption()
    },
    onPrint = { archive -> println("\nАрхив: ${archive.name}")}
) {
}