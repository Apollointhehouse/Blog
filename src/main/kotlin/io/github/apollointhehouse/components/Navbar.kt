package io.github.apollointhehouse.components

import kotlinx.html.*

/* name, url */
typealias Tab = Pair<String, String>

fun FlowContent.navbar(vararg pages: Tab) = nav {
    div("flex justify-between h-16 px-10 shadow items-center") {
        div("flex items-center space-x-8") {
            div("hidden md:flex justify-around space-x-4") {
                pages.forEach {
                    a(classes = "hover:text-indigo-600 text-gray-700", href = it.second) { +it.first }
                }
            }
        }
    }
}