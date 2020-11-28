package Clases;

public class Edificio {

	private String _NombreEdificio;
	private int _CodigoEdificio;
	private int _NoPisos;
	
	public Edificio() {
		super();
	}
	

	public Edificio(String _NombreEdificio, int _CodigoEdificio, int _NoPisos) {
		super();
		this._NombreEdificio = _NombreEdificio;
		this._CodigoEdificio = _CodigoEdificio;
		this._NoPisos = _NoPisos;
	}


	public String get_NombreEdificio() {
		return _NombreEdificio;
	}

	public void set_NombreEdificio(String _NombreEdificio) {
		this._NombreEdificio = _NombreEdificio;
	}

	public int get_CodigoEdificio() {
		return _CodigoEdificio;
	}

	public void set_CodigoEdificio(int _CodigoEdificio) {
		this._CodigoEdificio = _CodigoEdificio;
	}

	public int get_NoPisos() {
		return _NoPisos;
	}

	public void set_NoPisos(int _NoPisos) {
		this._NoPisos = _NoPisos;
	}

	@Override
	public String toString() {
	return String.format("Edificio[~ CÓDIGO DE EDIFICIO: %d, ~ NOMBRE DEL EDIFICIO: %s, ~ NÚMERO DE PISOS: %d]", 
			this._CodigoEdificio,
			this._NombreEdificio,
			this._NoPisos
	
	
			
			);
}
	
}
