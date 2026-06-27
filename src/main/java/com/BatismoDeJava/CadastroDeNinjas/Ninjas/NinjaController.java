package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {


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
    @GetMapping("/todosId")
    public String mostrarNinjaPorId(){
        return "Mostrar ninjas por iD";
    }

    //MOSTRAR OS NINJAS (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninjas";
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
