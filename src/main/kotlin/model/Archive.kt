package model

data class Archive(override val name: String) : Named {
    val noteslist: MutableList<Note> = mutableListOf()
}