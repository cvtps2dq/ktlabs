package lab8

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.*
import java.io.File

suspend fun downloadImageWithCustomName(client: HttpClient, imageUrl: String, fileName: String) {
    val response: HttpResponse = client.get(imageUrl)
    val imageBytes: ByteArray = response.body<ByteArray>()
    File(fileName).writeBytes(imageBytes)
}

suspend fun downloadImageWithOriginalName(client: HttpClient, imageUrl: String, directory: File, x: Number) {
    val response: HttpResponse = client.get(imageUrl)
    val imageBytes: ByteArray = response.body<ByteArray>()
    val fileName = x.toString() + imageUrl.substringAfterLast("/")
    val file = File(directory, fileName)
    file.writeBytes(imageBytes)
}

suspend fun main() {
    val client = HttpClient()

    // Первый способ: с заданием имен для файлов
    val customDirectory = File("custom_images")
    if (!customDirectory.exists()) {
        customDirectory.mkdirs()
    }
    val customJobs = mutableListOf<Job>()
    repeat(100) {
        val fileName = "image_$it.jpg"
        customJobs += GlobalScope.launch {
            downloadImageWithCustomName(client, "https://24warez.ru/uploads/posts/2015-11/1447172520_3.gif", "${customDirectory.absolutePath}/$fileName")
        }
    }
    customJobs.joinAll()

    // Второй способ: сохранение оригинального имени файла
    val originalDirectory = File("original_images")
    if (!originalDirectory.exists()) {
        originalDirectory.mkdirs()
    }
    val originalJobs = mutableListOf<Job>()
    repeat(100) {
        val imageUrl = "https://24warez.ru/uploads/posts/2015-11/1447172520_3.gif"
        originalJobs += GlobalScope.launch {
            downloadImageWithOriginalName(client, imageUrl, originalDirectory, it)
        }
    }
    originalJobs.joinAll()

    client.close()
}