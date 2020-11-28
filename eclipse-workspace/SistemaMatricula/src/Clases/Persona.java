package Clases;

public abstract class Persona {
	 private String _Nombres;
	 private String _Apellidos;
	 private String _Correo;
	 private String _Telefono;
	 private String _Direccion;
	public Persona() {
		super();
	}
	public Persona(String _Nombres, String _Apellidos, String _Correo, String _Telefono, String _Direccion) {
		super();
		this._Nombres = _Nombres;
		this._Apellidos = _Apellidos;
		this._Correo = _Correo;
		this._Telefono = _Telefono;
		this._Direccion = _Direccion;
	}
	public String get_Nombres() {
		return _Nombres;
	}
	public void set_Nombres(String _Nombres) {
		this._Nombres = _Nombres;
	}
	public String get_Apellidos() {
		return _Apellidos;
	}
	public void set_Apellidos(String _Apellidos) {
		this._Apellidos = _Apellidos;
	}
	public String get_Correo() {
		return _Correo;
	}
	public void set_Correo(String _Correo) {
		this._Correo = _Correo;
	}
	public String get_Telefono() {
		return _Telefono;
	}
	public void set_Telefono(String _Telefono) {
		this._Telefono = _Telefono;
	}
	public String get_Direccion() {
		return _Direccion;
	}
	public void set_Direccion(String _Direccion) {
		this._Direccion = _Direccion;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("Persona[~ NOMBRES : %s, ~ APELLIDOS: %s, ~ CORREO ELECTRÓNICO: %s, ~ TELÉFONO: %s, ~ DIRECCIÓN: %s ", 
				this._Nombres,
				this._Apellidos,
				this._Correo,
				this._Telefono,
				this._Direccion
				
				
				);
	}
	
	
	 
	 

}
