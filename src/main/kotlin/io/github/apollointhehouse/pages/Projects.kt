package io.github.apollointhehouse.pages

import kotlinx.html.*
import io.github.apollointhehouse.navbar

fun HTML.join() {
    lang = "en"
    head {
        title { +"Join Us" }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        navbar("index" to "Home", "join" to "Join Us", "resources" to "Resources")
        h1 { +"Hello, Kotlin!" }
    }
}