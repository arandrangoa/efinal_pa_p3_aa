package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_prod")
	@SequenceGenerator(name="seq_prod",sequenceName = "seq_prod", allocationSize = 1)
	@Column(name="prod_id")
	private Integer id;
	
	@Column(name="prod_nombre")
	private String nombre;
	
	@Column(name="prod_codigo_barras")
	private String codigoBarras;
	
	@Column(name="prod_categoria")
	private String categoria;
	
	@Column(name="prod_stock")
	private Integer stock;
	
	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventarios;
	

}
