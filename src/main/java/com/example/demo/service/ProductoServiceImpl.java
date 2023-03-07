package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.repository.IInventarioRepo;
import com.example.demo.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo iProductoRepo;
	
	private IInventarioService iInventarioService;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.insertar(producto);
	}

}
