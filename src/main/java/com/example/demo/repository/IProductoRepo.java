package com.example.demo.repository;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {
	
	public void insertar(Producto producto);
	
	public Producto buscarPorCodigoBarras(String codigoBarras);
	
	

}
