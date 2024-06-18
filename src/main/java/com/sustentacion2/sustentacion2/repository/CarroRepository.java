package com.sustentacion2.sustentacion2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sustentacion2.sustentacion2.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer>{
    List<Carro> findByMarcaContaining(String marca);
}
