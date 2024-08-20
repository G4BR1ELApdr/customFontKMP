package org.insights.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform