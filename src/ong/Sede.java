package ong;

public class Sede {

	private String localizacion;
	private float presupuesto;
	private String nombreDirector;
	private String telefono;

	private Proyecto proyecto1;
	private Proyecto proyecto2;

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Proyecto getProyecto1() {
		return proyecto1;
	}

	public void setProyecto1(Proyecto proyecto1) {
		this.proyecto1 = proyecto1;
	}

	public Proyecto getProyecto2() {
		return proyecto2;
	}

	public void setProyecto2(Proyecto proyecto2) {
		this.proyecto2 = proyecto2;
	}

	@Override
	public String toString() {
		return "Sede [localizacion=" + localizacion + ", presupuesto=" + presupuesto + ", nombreDirector="
				+ nombreDirector + ", telefono=" + telefono + ", proyecto1=" + proyecto1 + ", proyecto2=" + proyecto2
				+ "]";
	}

}
