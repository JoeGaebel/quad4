package com.fourquad.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContentController {
    @GetMapping("/content")
    fun getContent() : Content {
        return Content("But even more SICK")
    }
}

data class Content(val text: String)