package br.com.market.adminatrator.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
class HomeController {

    @RequestMapping("/home")
    fun loginTest(): ModelAndView? {
        val modelAndView = ModelAndView()
        modelAndView.viewName = "home"
        return modelAndView
    }

}