package com.kotlin.demo


import org.springframework.web.bind.annotation.*
import java.util.*

data class Message(val text: String, val priority: String)

@RestController
class MessageController {

    @RequestMapping("/message")
    fun message(): Message {
        return Message("Hello from Microsoft Azure Cloud ${Random().nextInt()}",
                "High")
    }

    @RequestMapping("/kotlin")
    fun kotlin(): Message {
        return Message("I am built with Kotlin", "High")
    }

    @RequestMapping("/")
    fun landingPage(): Message {
        return Message("Hello I am a Kotlin app,\n" +
                " built with Spring boot \n" +
                "run on K8S pods \n" +
                "over Microsoft Azure cloud", "High")
    }

}
