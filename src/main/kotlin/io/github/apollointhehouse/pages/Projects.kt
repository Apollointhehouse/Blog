package io.github.apollointhehouse.pages

import kotlinx.html.*
import io.github.apollointhehouse.components.navbar

fun HTML.projects() {
    lang = "en"
    head {
        title { +"Projects" }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        navbar("Home" to "../", "Projects" to "./")
        main {
            h1 { +"Coming Soon..." }
        }
    }
}