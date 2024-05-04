package pages

import kotlinx.html.*
import navbar

fun HTML.index() {
    lang = "en"
    head {
        title { +"Home" }
        script { src = "https://cdn.tailwindcss.com" }
    }
    body {
        navbar("index" to "Home", "join" to "Join Us", "resources" to "Resources")
        main {
            h1 { +"Home Page" }
        }
        footer() { +"© Apollo Cameron-Boot 2024" }
    }
}