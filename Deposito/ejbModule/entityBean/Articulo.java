package entityBean;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Articulo implements Serializable{
	
	private String codigo;
	private String nombre;
	private String descripcion;
	private String marca;
	private float precio;
	private Image foto;
	private String origen;
	private File FichaTecnica;
	private float stock;
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articulo(String codigo, String nombre, String descripcion, String marca, float precio, Image foto,
			String origen, File fichaTecnica, float stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.foto = foto;
		this.origen = origen;
		FichaTecnica = fichaTecnica;
		this.stock = stock;
	}
	@Id
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Image getFoto() {
		return foto;
	}
	public void setFoto(Image foto) {
		this.foto = foto;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public File getFichaTecnica() {
		return FichaTecnica;
	}
	public void setFichaTecnica(File fichaTecnica) {
		FichaTecnica = fichaTecnica;
	}
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock = stock;
	}
}
	
