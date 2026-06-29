package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//CONTROLAR A ROTA
@RestController
//CRIAR O MEU CAMINHO INICIAL
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping("/missoes")
    public String missoes() {
        return "Essa são as minhas missoes Ninjas";

    }

    //CRIAR
    @PostMapping("/criar")
    public String criarMissoes() {
        return "Criar missão";
    }

    //READ
    @GetMapping("/ler")
    public String ler(){
        return "Listar missoes";
    }

    //UPDATE
    @PutMapping("/update")
    public String update(){
        return "Atualizar missao";
    }

    //DELETE
    @DeleteMapping("/deletar")
    public String delete(){
        return "Deletar missao";
    }
}
