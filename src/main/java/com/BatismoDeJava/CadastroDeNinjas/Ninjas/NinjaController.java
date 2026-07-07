package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

    //ADICIONAR NINJA (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    //MOSTRAR NINJA POR ID (READ)
    @GetMapping("/ler/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    //MOSTRAR OS NINJAS (READ)
    @GetMapping("/ler")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinja();
    }

    //ALTERAR DADOS DOS NINJAS (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorId() {
        return "Alterar ninja por Id";
    }


    //DELETAR NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id) {
        ninjaService.deletarID(id);
    }

    //UPDATE NINJA
    @PutMapping("/update/{id}")
    public NinjaModel updateNinja (@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }
}

