package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/bodegas")
public class BodegaController {
	
	@Autowired
	private IBodegaService bodegaService;
	
	@GetMapping("/nuevoProducto")
	public String nuevoProducto(Bodega bodega) {
		return "nuevoProducto";
	}
	
	@PostMapping("/insertar")
	public String insertarNuevoProducto(Bodega bodega) {
		this.bodegaService.insertar(bodega);
		return "insertarProducto";
	}

}
