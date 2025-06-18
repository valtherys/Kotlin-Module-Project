package model

data class Archive(override val name: String) : Named {
    var noteslist: MutableList<Note> = mutableListOf()
}