package io.github.apollointhehouse

import kotlinx.html.HTML
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.html
import io.github.apollointhehouse.pages.index
import io.github.apollointhehouse.pages.projects
import java.io.File

fun main() {
    router {
        set("index") { index() }
        set("projects") { projects() }
    }.generateDocs()
}

fun router(block: MutableMap<String, HTML.() -> Unit>.() -> Unit): Map<String, HTML.() -> Unit> {
    val routes = mutableMapOf<String, HTML.() -> Unit>()
    routes.block()
    return routes
}

fun Map<String, HTML.() -> Unit>.generateDocs() {
    forEach { (name, doc) ->
        val html = createHTMLDocument().html(block = doc).serialize()
        val file = File("docs/$name.html")
        file.createNewFile()

        file.writeText(html)
    }
}