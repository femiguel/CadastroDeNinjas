package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import com.BatismoDeJava.CadastroDeNinjas.Ninjas.NinjaModel;
import com.BatismoDeJava.CadastroDeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //listar
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //listar por id
    public MissoesModel lerMissaoPorId(Long id){
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    //deletar
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    //criar
    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);
    }

//    //update
//    public MissoesModel updateMissao(MissoesModel id){
//        return missoesRepository.
//    }


}
