package entityBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class ReciboCompra implements Serializable {
	
	private String id;
	private Date fecha;
	
	
	private SolicitudCompra solCompra;
	public ReciboCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReciboCompra(String id, Date fecha, SolicitudCompra solCompra) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.solCompra = solCompra;
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
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public SolicitudCompra getSolCompra() {
		return solCompra;
	}
	public void setSolCompra(SolicitudCompra solCompra) {
		this.solCompra = solCompra;
	}

}
