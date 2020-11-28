package Clases;

public class Asignatura {

	private String _CodigoAsignatura;
	private String _NombreAsignatura;
	private int _UV;
	private CampoEstudio _Campo;
	
	public Asignatura() {
		super();
	}

	public Asignatura(String _CodigoAsignatura, String _NombreAsignatura, int _UV, CampoEstudio _Campo) {
		super();
		this._CodigoAsignatura = _CodigoAsignatura;
		this._NombreAsignatura = _NombreAsignatura;
		this._UV = _UV;
		this._Campo = _Campo;
	}

	public String get_CodigoAsignatura() {
		return _CodigoAsignatura;
	}

	public void set_CodigoAsignatura(String _CodigoAsignatura) {
		this._CodigoAsignatura = _CodigoAsignatura;
	}

	public String get_NombreAsignatura() {
		return _NombreAsignatura;
	}

	public void set_NombreAsignatura(String _NombreAsignatura) {
		this._NombreAsignatura = _NombreAsignatura;
	}

	public int get_UV() {
		return _UV;
	}

	public void set_UV(int _UV) {
		this._UV = _UV;
	}

	public CampoEstudio get_Campo() {
		return _Campo;
	}

	public void set_Campo(CampoEstudio _Campo) {
		this._Campo = _Campo;
	}

	@Override
	public String toString() {
		
		return String.format("Asignatura[~ CÓDIGO DE ASIGNATURA: %s, ~ NOMBRE DE ASIGNATURA: %s, ~ UV: %d, ~ CAMPO DE ESTUDIO: %s]", 
				this._CodigoAsignatura,
				this._NombreAsignatura,
				this._UV,
				this._Campo
				
				
				);
	}

	

	
	
	
	
	
	
}
