package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado: " + novoNinja.getNome() + " (ID): " + novoNinja.getId());
    }

    //MOSTRAR NINJA POR ID (READ)
    @GetMapping("/ler/{id}")
    public ResponseEntity<?> listarNinjaPorId(@PathVariable Long id) {
        NinjaDTO ninjaPorId = ninjaService.listarNinjaPorId(id);
        if (ninjaPorId != null) {
            return ResponseEntity.ok(ninjaPorId);
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("O ninja com id " + id + " não foi localizado");
    }


    //MOSTRAR OS NINJAS (READ)
    @GetMapping("/ler")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinja();
        return ResponseEntity.ok(ninjas);
    }


    //DELETAR NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorID(@PathVariable Long id) {
        if (ninjaService.listarNinjaPorId(id) != null) {
            ninjaService.deletarID(id);
            return ResponseEntity.ok("Ninja com iD: " + id + " deletado com sucesso");
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("O ninja com o iD " + id + " não encontrado");
    }

    //UPDATE NINJA
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        NinjaDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);
        if (ninja != null) {
            return ResponseEntity.ok(ninjaAtualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com ID: " + id + " não foi encontrado");
        }
    }





}

