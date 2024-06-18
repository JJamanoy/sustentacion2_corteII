package com.sustentacion2.sustentacion2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sustentacion2.sustentacion2.repository.CarroRepository;
import com.sustentacion2.sustentacion2.domain.Carro;

@Service
public class CarroService {
    
    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> listarCarros(){
        return carroRepository.findAll();
    }

    public Carro agregarCarro(Carro carro){
        return carroRepository.save(carro);
    }

    public Carro editarCarro(Integer id, Carro carroDetalles){
        Optional<Carro> carroOptional = carroRepository.findById(id);
        if(carroOptional.isPresent()){
            Carro carro = carroOptional.get();
            carro.setMarca(carroDetalles.getMarca());
            carro.setModelo(carroDetalles.getModelo());
            carro.setAnio(carroDetalles.getAnio());
            carro.setColor(carroDetalles.getColor());
            carro.setPrecio(carroDetalles.getPrecio());
            carro.setTipo_vehiculo(carroDetalles.getTipo_vehiculo());
            carro.setConcesionaria(carroDetalles.getConcesionaria());
            carro.setImagen(carroDetalles.getImagen());
            return carroRepository.save(carro);
        } else {
            return null;
        }
    }

    public void eliminarCarro(Integer id){
        carroRepository.deleteById(id);
    }

    public List<Carro> buscarCarroPorMarca(String marca){
        return carroRepository.findByMarcaContaining(marca);
    }

}
