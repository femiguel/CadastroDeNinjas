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
    public List<MissoesModel> missoes() {
        return missoesService.listarMissoes();
    }

    //CRIAR
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissao(missao);
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


    //DELETE
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }

//    //UPDATE
//    @PutMapping("/update/{id}")
//    public MissoesModel updateMissao(@PathVariable MissoesModel id){
//        return missoesService.updateMissao(id);
//    }
}
