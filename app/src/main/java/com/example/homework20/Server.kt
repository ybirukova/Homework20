package com.example.homework20

object Server {
    fun getElement(): List<Any> = listOf(
        TitleItem("News"),
        LinkItem("https://www.onliner.by/", "onliner"),
        LinkItem("https://www.euronews.com/news", "euronews"),

        TitleItem("Social Media"),
        LinkItem("https://www.instagram.com/", "instagram"),
        LinkItem("https://www.facebook.com/", "facebook"),
        LinkItem("https://www.linkedin.com/", "linkedin"),

        TitleItem("Movies"),
        LinkItem("https://www.kinopoisk.ru/", "kinopoisk"),
        LinkItem("https://www.lostfilm.tv/", "lostfilm"),
        LinkItem("https://www.netflix.com/", "netflix"),

        TitleItem("Other"),
        LinkItem("https://www.pinterest.com/", "pinterest"),
        LinkItem("https://github.com/", "github"),
    )
}