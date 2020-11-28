package Clases;

public class Aula {
	private int _NoAula;
	private Edificio _Edificio;
	private String _Nivel;
	
	//constructor por defecto
	public Aula() {
		super();
	}

	//constructor con todos los campos
	
	public Aula(int _NoAula, Edificio _Edificio,String _Nivel) {
		super();
		this._NoAula = _NoAula;
		this._Edificio = _Edificio;
		this._Nivel = _Nivel;
	}

	public int get_NoAula() {
		return _NoAula;
	}

	public void set_NoAula(int _NoAula) {
		this._NoAula = _NoAula;
	}

	public Edificio get_Edificio() {
		return _Edificio;
	}

	public void set_Edificio(Edificio _Edificio) {
		this._Edificio = _Edificio;
	}

	public String get_Nivel() {
		return _Nivel;
	}

	public void set_Nivel(String _Nivel) {
		this._Nivel = _Nivel;
	}

	@Override
	public String toString() {
		
		return String.format("Aula[~ NÚMERO DE AULA: %d, ~ EDIFICIO: %s, ~ NIVEL: %S]", 
				this._NoAula,
				this._Edificio,
				this._Nivel
				
				
				);
	}

	
	
	

}
