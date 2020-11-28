package Clases;

public class TipoMatricula {

	private int _Codigo;
	private String _Descripcion;
	
	//constrcutor por defecto
	public TipoMatricula() {
		super();
	}
	
	//constructor con todos los campos
	public TipoMatricula(int _Codigo, String _Descripcion) {
		super();
		this._Codigo = _Codigo;
		this._Descripcion = _Descripcion;
	}
	public int get_Codigo() {
		return _Codigo;
	}
	public void set_Codigo(int _Codigo) {
		this._Codigo = _Codigo;
	}
	public String get_Descripcion() {
		return _Descripcion;
	}
	public void set_Descripcion(String _Descripcion) {
		this._Descripcion = _Descripcion;
	}
	
	@Override
	public String toString() {
		
		return String.format("TipoMatricula[~ CÓDIGO DE TIPO-MATRICULA: %d, ~ DESCRIPCIÓN : %s]", 
				this._Codigo,
				this._Descripcion
				
				
				
				);
	}
	
}
