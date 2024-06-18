package com.sustentacion2.sustentacion2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sustentacion2.sustentacion2.domain.Carro;
import com.sustentacion2.sustentacion2.services.CarroService;


@Controller
public class InterfazController {
    
    @Autowired
    private CarroService carroService;


    @GetMapping("/carros")
    public String listarCarros(Model model){
        model.addAttribute("carroListAttribute", carroService.listarCarros());
        return "Carros";
    }

    @GetMapping("/add-carros")
    public String agregarCarros(Model model){
        model.addAttribute("addCarros", new Carro());
        return "add-carros";
    }

    @PostMapping("/add-carros")
    public String guardarCarro(@ModelAttribute("addCarro")Carro carro){
        carroService.agregarCarro(carro);
        return "redirect:/carros";
    }
}
