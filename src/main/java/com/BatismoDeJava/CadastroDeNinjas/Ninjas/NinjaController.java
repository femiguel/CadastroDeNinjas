package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/ler")
    public String mostrarNinjaPorId(){
        return "Mostrar ninjas por iD";
    }

    //MOSTRAR OS NINJAS (READ)
    @GetMapping("/lerNinjas")
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
