package com.example.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bar.model.cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente , Long> {

    static void Save(Object cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Save'");
    }
    
}
