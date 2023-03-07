package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public Bodega buscarPorNumeroBod(Integer numero) {
		// TODO Auto-generated method stub
		TypedQuery<Bodega> query=this.entityManager.createQuery("select b from Bodega b where b.numero= :datoNumero", Bodega.class);
		query.setParameter("datoNumero", numero);
		return query.getSingleResult();
	}

}
