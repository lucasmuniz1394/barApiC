package com.example.bar.model.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import lombok.Getter;
// import lombok.Setter;

// @Setter
// @Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobreNome;
    private String email;
    private String telefone;
    
    public Cliente(String nome, String sobreNome ,String email ,String telefone){
        // this.nome = nome;
        // this.sobreNome = sobreNome;
        // this.email = email;
        // this.telefone = telefone;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    public String getsobreNome() {
        return sobreNome;
    }

    public void setsobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

}
