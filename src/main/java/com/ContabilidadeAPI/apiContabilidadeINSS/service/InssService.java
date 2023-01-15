package com.ContabilidadeAPI.apiContabilidadeINSS.service;


import com.ContabilidadeAPI.apiContabilidadeINSS.model.Categoria;
import com.ContabilidadeAPI.apiContabilidadeINSS.model.Inss;
import com.ContabilidadeAPI.apiContabilidadeINSS.repository.InssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class InssService {

    @Autowired
    private InssRepository inssRepository;

    @Transactional
    public List<Inss>ListarInss(){

        List<Inss> listarInssTipos= inssRepository.findAll();
        return listarInssTipos;
    }

    @Transactional
    public Inss cadastrarSalario(Inss inss){
        Categoria categoria1=new Categoria(1);
        Categoria categoria2=new Categoria(2);
        Categoria categoria3=new Categoria(3);
        Categoria categoria4=new Categoria(4);

        if(inss.getSalario()<=1212.00){

            double result=(inss.getSalario() / 100) * 7.5;
            inss.setDesconto(result);
            inss.setCategoria(categoria1);
        }
       else if(inss.getSalario()>=1212.01&&inss.getSalario()<=2427.35){

           double result=(inss.getSalario() / 100) * 9;
            inss.setDesconto(result);
            inss.setCategoria(categoria2);

        }
       else if(inss.getSalario()>=2427.36&&inss.getSalario()<=3641.03){

            double result=(inss.getSalario() / 100) * 12;
            inss.setDesconto(result);
           inss.setCategoria(categoria3);

        }
       else if(inss.getSalario()>=3641.04&&inss.getSalario()<=7087.22){

            double result=(inss.getSalario() / 100) * 14;
            inss.setDesconto(result);
            inss.setCategoria(categoria4);

        }

        return inssRepository.save(inss);
    }




    public Optional<Inss>listarSalario(Integer id){return inssRepository.findById(id);}

    @Transactional
    public void removerSalario(Integer id){ inssRepository.deleteById(id);}


}
