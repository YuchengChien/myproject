package com.jason

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    println(url.readText())

    /*
    with(url.openConnection() as HttpURLConnection) {
        val br =  inputStream.bufferedReader().lines().forEach() {
            println(it)
        }
    }
    */
}