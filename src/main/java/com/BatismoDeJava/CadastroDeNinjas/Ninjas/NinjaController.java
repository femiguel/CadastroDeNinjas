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
    public String criarNinja(){
        return "Ninja criado";
    }

    //MOSTRAR NINJA POR ID (READ)
    @GetMapping("/ler/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    //MOSTRAR OS NINJAS (READ)
    @GetMapping("/ler")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinja();
    }

    //ALTERAR DADOS DOS NINJAS (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
    return "Alterar ninja por Id";
    }


    //DELETAR NINJA (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "O ninja deletado por ID";
    }
}
