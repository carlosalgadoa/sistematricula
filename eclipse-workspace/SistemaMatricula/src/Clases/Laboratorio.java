package Clases;

public class Laboratorio {
	
	private int _Codigo;
	private String _Nombre;
	
	//constrcutor por defecto
	public Laboratorio() {
		super();
	}
	
	//constructor con todos los campos
	public Laboratorio(int _Codigo, String _Nombre) {
		super();
		this._Codigo = _Codigo;
		this._Nombre = _Nombre;
	}
	public int get_Codigo() {
		return _Codigo;
	}
	public void set_Codigo(int _Codigo) {
		this._Codigo = _Codigo;
	}
	public String get_Nombre() {
		return _Nombre;
	}
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}
	
	@Override
	public String toString() {
		
		return String.format("Laboratorio[~ CÓDIGO DE LABORATORIO: %d, ~ NOMBRE DE LABORATORIO: %s]", 
				this._Codigo,
				this._Nombre
				
				
				);
	}
	
	

}
