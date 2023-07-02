package uz.gita.playmarketbookapp.data.local.room.entity

import androidx.room.*
import uz.gita.playmarketbookapp.data.model.BookData

/**
 *   Created by Jamik on 6/26/2023 ot 3:09 PM
 **/
@Entity(tableName = "books")
data class BookEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val name: String,
    val bookUrl: String,
    val coverUrl: String,
    val owner: String,
    val description: String,
    val reference: String,
    val onlineBookUrl: String,
    var save: Boolean = true,
) {
    fun bookEntityToBookData() = BookData(
        name = name,
        bookUrl = bookUrl,
        coverUrl = coverUrl,
        owner = owner,
        description = description,
        onlineBookUrl = onlineBookUrl,
        reference = reference,
        save = save,
    )
}
