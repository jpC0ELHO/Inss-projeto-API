package com.ContabilidadeAPI.apiContabilidadeINSS.model;

import javax.persistence.*;

@Entity
@Table(name="inss")
public class Inss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column()
    private double Salario;
    @Column()
    private double desconto;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    
    //Constructor
    public Inss() {
    }

    //Getters and Setters


    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
