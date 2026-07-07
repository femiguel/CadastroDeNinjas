package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    //INJETAR A DEPENDENCIA
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinja() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //CRIAR UM NOVO NINJA
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    //DELETAR TEM QUE SER MÉTODO VOID
    public void deletarID(Long id) {
        ninjaRepository.deleteById(id);
    }

    //UPDATE NINJA
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            ninjaRepository.save(ninjaAtualizado);
        }
        return null;

    }
}
