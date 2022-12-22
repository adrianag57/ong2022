package ong;

public class Proyecto {

	private String poblacion;
	private String identificador;
	private float inversion;

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public float getInversion() {
		return inversion;
	}

	public void setInversion(float inversion) {
		this.inversion = inversion;
	}

	@Override
	public String toString() {
		return "Proyecto [poblacion=" + poblacion + ", identificador=" + identificador + ", inversion=" + inversion
				+ "]";
	}

}
