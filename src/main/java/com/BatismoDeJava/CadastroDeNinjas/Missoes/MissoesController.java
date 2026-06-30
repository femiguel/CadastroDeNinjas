package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import com.BatismoDeJava.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//CONTROLAR A ROTA
@RestController
//CRIAR O MEU CAMINHO INICIAL
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/missoes")
    public String missoes() {
        return "Essa são as minhas missoes Ninjas";

    }

    //CRIAR
    @PostMapping("/criar")
    public String criarMissoes() {
        return "Criar missão";
    }

    //READ POR ID
    @GetMapping("/ler/{id}")
    public MissoesModel lerNinjaPorId(@PathVariable Long id){
        return missoesService.lerMissaoPorId(id);
    }

    //READ
    @GetMapping("/ler")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
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
