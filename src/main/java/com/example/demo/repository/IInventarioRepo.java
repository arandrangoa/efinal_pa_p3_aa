package com.example.demo.repository;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;

public interface IInventarioRepo {
	
	public void insertar(Inventario inventario);
	
	public Inventario buscarPorBodega(Integer numBodega);
	
	public Inventario buscarPorProducto(String codProducto);

}
