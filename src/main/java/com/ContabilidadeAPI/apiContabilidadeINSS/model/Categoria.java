package com.ContabilidadeAPI.apiContabilidadeINSS.model;

import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String InssDesconto;



    public Categoria() {
    }public Categoria(Integer id) {
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInssDesconto() {
        return InssDesconto;
    }

    public void setInssDesconto(String inssDesconto) {
        this.InssDesconto = inssDesconto;
    }


}

