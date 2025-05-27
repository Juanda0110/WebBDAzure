package co.edu.poli.examen2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "¡Aplicación desplegada exitosamente en Azures!";
    }
}
