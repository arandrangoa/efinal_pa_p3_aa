package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Inventario;
import com.example.demo.repository.IBodegaRepo;
import com.example.demo.repository.IInventarioRepo;
import com.example.demo.repository.IProductoRepo;

@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepo iInventarioRepo;
	
	@Autowired
	private IBodegaService bodegaService;
	
	@Autowired 
	private IProductoService iProductoService;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		
		this.iInventarioRepo.insertar(inventario);
	}

	@Override
	public Inventario buscarPorBodega(Integer numBodega) {
		// TODO Auto-generated method stub
		return this.iInventarioRepo.buscarPorBodega(numBodega);
	}

	@Override
	public Inventario buscarPorProducto(String codProducto) {
		// TODO Auto-generated method stub
		return this.iInventarioRepo.buscarPorProducto(codProducto);
	}
	
	

}
