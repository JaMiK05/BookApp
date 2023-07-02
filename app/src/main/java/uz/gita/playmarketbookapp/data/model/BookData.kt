package uz.gita.playmarketbookapp.data.model

import uz.gita.playmarketbookapp.data.local.room.entity.BookEntity
import java.io.Serializable


/**
 *   Created by Jamik on 6/23/2023 ot 8:01 PM
 **/

data class BookData(
    val name: String,
    val bookUrl: String,
    val coverUrl: String,
    val owner: String,
    val description: String,
    val reference: String,
    val onlineBookUrl: String,
    var save: Boolean = false,
) : Serializable {
    fun dataToEntity() = BookEntity(
        name = name,
        bookUrl = bookUrl,
        coverUrl = coverUrl,
        owner = owner,
        description = description,
        onlineBookUrl = onlineBookUrl,
        reference = reference,
        save = true
    )
}
