package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

	@Override
	public Inventario buscarPorBodega(Integer numBodega) {
		// TODO Auto-generated method stub
		TypedQuery<Inventario> query=this.entityManager.createQuery("select i from Inventario i where i.bodega.numero= :datoNumBodega", Inventario.class);
		query.setParameter("datoNumBodega", numBodega);
		return query.getSingleResult();
	}

	@Override
	public Inventario buscarPorProducto(String codProducto) {
		// TODO Auto-generated method stub
		TypedQuery<Inventario> query=this.entityManager.createQuery("select i from Inventario i where i.producto.codigoBarras= :datoCodBarras", Inventario.class);
		query.setParameter("datoCodBarras", codProducto);
		return query.getSingleResult();
	}

}
