package com.ejercicio2.ejercicio2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/formulariogatito")
    public String getFormularioGato(Model model){
        return "formularioGatitos";
    }
}
