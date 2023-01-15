package com.ContabilidadeAPI.apiContabilidadeINSS.controller;


import com.ContabilidadeAPI.apiContabilidadeINSS.model.Inss;
import com.ContabilidadeAPI.apiContabilidadeINSS.service.InssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/inss")
public class InssController {


    @Autowired
    private InssService inssService;

    @GetMapping
    public ResponseEntity<Object> getAllInss(){
        return ResponseEntity.status(HttpStatus.OK).body(inssService.ListarInss());
    }

    @PostMapping
    public ResponseEntity<Object>inserirSalario(@RequestBody Inss inss){
        return ResponseEntity.status(HttpStatus.CREATED).body(inssService.cadastrarSalario(inss));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Object>getInss(@PathVariable(value="id") Integer id){

        return ResponseEntity.status(HttpStatus.OK).body(inssService.listarSalario(id));
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Object>inserirInss(@PathVariable(value="id") Integer id,@RequestBody Inss inss){
        Optional<Inss>dadosInss=inssService.listarSalario(id);
        Inss inssAlterar=dadosInss.get();
        inssAlterar.setNome(inss.getNome());
        inssAlterar.setDesconto(inss.getDesconto());

        return ResponseEntity.status(HttpStatus.OK).body(inssService.cadastrarSalario(inssAlterar));
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Object>deleteSalario(@PathVariable(value="id") Integer id){
        inssService.removerSalario(id);
        return ResponseEntity.status(HttpStatus.OK).body("Registro removido com sucesso");
    }

}
