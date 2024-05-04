package io.github.apollointhehouse.pages

import kotlinx.html.*
import io.github.apollointhehouse.components.navbar

fun HTML.index() {
    lang = "en"
    head {
        title { +"Home" }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        navbar("Home" to "index", "Projects" to "projects")
        main {
            h1 { +"Coming Soon..." }
        }
    }
}