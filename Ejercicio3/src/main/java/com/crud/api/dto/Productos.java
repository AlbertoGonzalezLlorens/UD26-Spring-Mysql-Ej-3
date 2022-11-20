package com.crud.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.crud.api.dto.Venta;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="productos")
public class Productos {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;

	
    @OneToMany
    @JoinColumn(name="producto")
    private List<Venta> venta;
	
	//Constructores
	
	public Productos() {
	
	}


	public Productos(int codigo, String nombre, int precio) {
		//super();
		this.codigo =codigo;
		this.nombre = nombre;
		this.precio = precio;

	}

	
	//Getters y Setters

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	/**
	 * @return the usuario
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param usuario the video to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}