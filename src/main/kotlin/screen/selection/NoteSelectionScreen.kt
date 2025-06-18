package screen.selection

import screen.view.NoteViewScreen
import model.Archive
import model.Note
import screen.creation.CreateNoteScreen

class NoteSelectionScreen(private var archive: Archive) : BaseSelectionScreen<Note>(
    archive.noteslist,
    "заметку",
    onCreate = {
        val createNoteScreen = CreateNoteScreen()
        createNoteScreen.create()
    },
    onExit = true,
    onSelect = { note ->
        val noteViewScreen = NoteViewScreen(note)
        noteViewScreen.printOptions()
        noteViewScreen.chooseOption()
    },
    onPrint = {}
) {
}
