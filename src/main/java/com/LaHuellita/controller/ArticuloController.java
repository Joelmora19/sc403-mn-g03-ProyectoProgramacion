package com.LaHuellita.controller;

import com.LaHuellita.domain.Articulo;
import com.LaHuellita.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articulo")
public class ArticuloController {
    @Autowired
    ArticuloService articuloService;   
     
     
    @GetMapping("/listado")
    public String inicio(Model model) {
     //   var articulos = articuloService.getArticulos(false);
     var articulos = articuloService.getArticulos(false);
        model.addAttribute("articulos", articulos);
        model.addAttribute("totalArticulos",articulos.size());        
        return "/articulo/listado";
    }

    @GetMapping("/eliminar/{idArticulo}")
    public String eliminaArticulo(Articulo articulo) {
        articuloService.deleteArticulo(articulo);
        return "redirect:/articulo/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoArticulo(Articulo articulo) {
        return "/articulo/modifica";
    }
    @PostMapping("/guardar")
    public String guardaArticulo(Articulo articulo) {
        articuloService.saveArticulo(articulo);
        return "redirect:/articulo/listado";
    }

    @GetMapping("/modificar/{idArticulo}")
    public String modificaArticulo(Articulo articulo, Model model) {
        articulo = articuloService.getArticulo(articulo);
        model.addAttribute("articulo", articulo);
        return "/articulo/modifica";
    }
}
