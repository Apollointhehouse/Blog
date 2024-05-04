import kotlinx.html.HTML
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.html
import pages.index
import pages.join
import pages.resources
import java.io.File

val docs = mutableMapOf<String, HTML.() -> Unit>()

fun main() {
    docs["index"] = { index() }
    docs["join"] = { join() }
    docs["resources"] = { resources() }
    generateDocs()
}

fun generateDocs() {
    docs.forEach { (name, doc) ->
        val html = createHTMLDocument().html(block = doc).serialize()
        val file = File("docs/$name.html")
        file.createNewFile()

        file.writeText(html)
    }
}