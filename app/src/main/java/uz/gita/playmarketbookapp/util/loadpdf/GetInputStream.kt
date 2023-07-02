package uz.gita.playmarketbookapp.util.loadpdf

import android.content.Context
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

/**
 *   Created by Jamik on 6/27/2023 ot 6:50 PM
 **/

fun getInputStream(context: Context, path: String): InputStream {
    val inputFile = File(context.filesDir, path)
    return FileInputStream(inputFile)
}
