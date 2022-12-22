package ong;

public class Start {

	public static void main(String[] args) {
		
		Proyecto escuelaRural = new Proyecto();
		escuelaRural.setIdentificador("ESC001OSCOS");
		escuelaRural.setInversion(12000);
		escuelaRural.setPoblacion("Santa Eulalia de Oscos");
		
		Proyecto tallerPersonasMayores = new Proyecto();
		tallerPersonasMayores.setIdentificador("TALLER001OSCOS");
		tallerPersonasMayores.setInversion(1200);
		tallerPersonasMayores.setPoblacion("Santa Eulalia de Oscos");
		
		Sede comarcaEo = new Sede();
		comarcaEo.setLocalizacion("Comarca del Eo");
		comarcaEo.setPresupuesto(200000);
		comarcaEo.setNombreDirector("Jose Luis Fernandez");
		comarcaEo.setTelefono("677344211");
		comarcaEo.setProyecto1(escuelaRural);
		comarcaEo.setProyecto2(tallerPersonasMayores);
		
		ONG oscosAvanza = new ONG();
		oscosAvanza.setCeo("Marcos Fernandez");
		oscosAvanza.setPresupuesto(123456789);
		oscosAvanza.setSede1(comarcaEo);
		
		System.out.println(oscosAvanza);

	}

}
