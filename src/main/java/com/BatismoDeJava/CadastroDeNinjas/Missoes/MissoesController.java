package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;

public class MissoesController {
    @GetMapping("/missoes")
    public String missoes(){
        return "Essa são as minhas missoes Ninjas"
    }
}
