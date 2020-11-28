package Clases;

public class CampoEstudio {

	private String _NombreCampo;
	private int _CodigoCampo;
	
	public CampoEstudio() {
		super();
	}

	public CampoEstudio(String _NombreCampo, int _CodigoCampo) {
		super();
		this._NombreCampo = _NombreCampo;
		this._CodigoCampo = _CodigoCampo;
	}

	public String get_NombreCampo() {
		return _NombreCampo;
	}

	public void set_NombreCampo(String _NombreCampo) {
		this._NombreCampo = _NombreCampo;
	}

	public int get_CodigoCampo() {
		return _CodigoCampo;
	}

	public void set_CodigoCampo(int _CodigoCampo) {
		this._CodigoCampo = _CodigoCampo;
	}

	@Override
	public String toString() {
		
		return String.format("Campo De Estudio[~ CÓDIGO DE CAMPO: %d, ~ NOMBRE DE CAMPO: %s]", 
				this._CodigoCampo,
				this._NombreCampo
				
				
				);
	}
	
	
	
}
