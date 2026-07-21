package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CONTROLAR A ROTA
@RestController
// CRIAR O MEU CAMINHO INICIAL
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // LISTAR MISSÕES
    @GetMapping("/missoes")
    public List<MissoesDTO> missoes() {
        return missoesService.listarMissoes();
    }

    // CRIAR
    @PostMapping("/criar")
    public ResponseEntity<String> criarMissao(@RequestBody MissoesDTO missao) {
        MissoesDTO novaMissao = missoesService.criarMissao(missao);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missão: " + novaMissao.getNome() + " criada com sucesso");
    }

    // READ POR ID
    @GetMapping("/ler/{id}")
    public ResponseEntity<?> lerMissaoPorId(@PathVariable Long id) {
        MissoesDTO missaoPorId = missoesService.lerMissaoPorId(id);
        if (missaoPorId != null) {
            return ResponseEntity.ok(missaoPorId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado");
        }
    }

    // READ
    @GetMapping("/ler")
    public List<MissoesDTO> listarMissoes() {
        return missoesService.listarMissoes();
    }

    // DELETE
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissao(@PathVariable Long id) {
        if (missoesService.lerMissaoPorId(id) != null) {
            missoesService.deletarMissao(id);
            return ResponseEntity.ok("Missão: " + id + " excluída com sucesso");
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão não encontrada");
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateMissao(@PathVariable Long id, @RequestBody MissoesDTO missaoAtualizada) {
        MissoesDTO missao = missoesService.updateMissao(id, missaoAtualizada);
        if (missao != null) {
            return ResponseEntity.ok(missao);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Missão não encontrada");
        }
    }
}