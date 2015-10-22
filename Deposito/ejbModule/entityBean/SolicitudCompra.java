package entityBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class SolicitudCompra implements Serializable {
	
	private String id;
	private Date fecha;
	private String estado;
	
	private List<ItemArticulo> articulos;
	public SolicitudCompra(String id, Date fecha, String estado, List<ItemArticulo> articulos) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.articulos = articulos;
	}
	public SolicitudCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="articulo")
	public List<ItemArticulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<ItemArticulo> articulos) {
		this.articulos = articulos;
	}
	

}
