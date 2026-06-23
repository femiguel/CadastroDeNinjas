package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping("/missoes")
    public String missoes() {
        return "Essa são as minhas missoes Ninjas";
    }
}
