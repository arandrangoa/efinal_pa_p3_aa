package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscarPorCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query=this.entityManager.createQuery("select b from Bodega b where b.numero= :datoNumero", Producto.class);
		query.setParameter("datoNumero", codigoBarras);
		return query.getSingleResult();
	}

}
