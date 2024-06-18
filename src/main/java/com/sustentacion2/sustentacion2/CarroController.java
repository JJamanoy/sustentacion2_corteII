package com.sustentacion2.sustentacion2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sustentacion2.sustentacion2.services.CarroService;
import com.sustentacion2.sustentacion2.domain.Carro;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
    
    @Autowired
    private CarroService carroService;

    @GetMapping
    public ResponseEntity<List<Carro>> listarCarros(){
        List<Carro> carro = carroService.listarCarros();
        return ResponseEntity.ok(carro);
    }

    @PostMapping
    public ResponseEntity<Carro> agregarCarro(@RequestBody Carro carro){
        Carro nuevoCarro = carroService.agregarCarro(carro);
        return ResponseEntity.ok(nuevoCarro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> editarCarro(@PathVariable Integer id, @RequestBody Carro carroDetalles){
        Carro carroActualizado = carroService.editarCarro(id, carroDetalles);
        if(carroActualizado != null){
            return ResponseEntity.ok(carroActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCarro(@PathVariable Integer id){
        carroService.eliminarCarro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Carro>> buscarCarros(@RequestParam(required = false) String marca){
        List<Carro> carros;
        if(marca != null){
            carros = carroService.buscarCarroPorMarca(marca);
        } else {
            carros = carroService.listarCarros();
        }
        return ResponseEntity.ok(carros);
    }
}
