package entityBean;

import javax.persistence.Embedded;

import java.io.Serializable;

import javax.persistence.*;

public class ItemArticulo implements Serializable{
	
	private Articulo articulo;
	private float cantidad;
	
	public ItemArticulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemArticulo(Articulo articulo, float cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	@ManyToOne
	@JoinColumn(name="articulo")
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
