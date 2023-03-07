package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_inve")
	@SequenceGenerator(name="seq_inve",sequenceName = "seq_inve", allocationSize = 1)
	@Column(name="inve_id")
	private Integer id;
	
	@Column(name="inve_cantidad_producto")
	private Integer cantidadProducto;
	
	@Column(name="inve_codigo_individual")
	private String codigoBarrasIndiv;
	
	@ManyToOne
	@JoinColumn(name="inve_id_bodega")
	private Bodega bodega;
	
	@ManyToOne
	@JoinColumn(name="inve_id_producto")
	private Producto producto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getCodigoBarrasIndiv() {
		return codigoBarrasIndiv;
	}

	public void setCodigoBarrasIndiv(String codigoBarrasIndiv) {
		this.codigoBarrasIndiv = codigoBarrasIndiv;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}
