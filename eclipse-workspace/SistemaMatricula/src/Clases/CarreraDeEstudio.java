package Clases;


public class CarreraDeEstudio {

	private int _codigo;
	private String _descripcion;
	
	//Constructor por defecto
	public CarreraDeEstudio() {
		super();
	}

	//Constructor con todos los campos
	public CarreraDeEstudio(int _codigo, String _descripcion) {
		super();
		this._codigo = _codigo;
		this._descripcion = _descripcion;
	}

	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	
	@Override
	public String toString() {
		
		return String.format("Carrera De Estudio[~ CÓDIGO DE CARRERA: %d, ~ NOMBRE DE LA CARRERA: %s]", 
				this._codigo,
				this._descripcion
				
				
				);
	}
	
	
	
	
	
	
	
	
}
