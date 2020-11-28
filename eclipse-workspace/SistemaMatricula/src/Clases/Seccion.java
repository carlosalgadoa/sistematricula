package Clases;

public abstract class Seccion {
	
	private int _Codigo;
	private Profesor _Profesor;
	private Aula _Aula;
	private String _Dias;
	private Horario _Horario;
	public Seccion() {
		super();
	}
	public Seccion(int _Codigo, Profesor _Profesor, Aula _Aula, String _Dias, Horario _Horario) {
		super();
		this._Codigo = _Codigo;
		this._Profesor = _Profesor;
		this._Aula = _Aula;
		this._Dias = _Dias;
		this._Horario = _Horario;
	}
	public int get_Codigo() {
		return _Codigo;
	}
	public void set_Codigo(int _Codigo) {
		this._Codigo = _Codigo;
	}
	public Profesor get_Profesor() {
		return _Profesor;
	}
	public void set_Profesor(Profesor _Profesor) {
		this._Profesor = _Profesor;
	}
	public Aula get_Aula() {
		return _Aula;
	}
	public void set_Aula(Aula _Aula) {
		this._Aula = _Aula;
	}
	public String get_Dias() {
		return _Dias;
	}
	public void set_Dias(String _Dias) {
		this._Dias = _Dias;
	}
	public Horario get_Horario() {
		return _Horario;
	}
	public void set_Horario(Horario _Horario) {
		this._Horario = _Horario;
	}
	
	@Override
	public String toString() {
		
		return String.format("Sección[~ CÓDIGO DE SECCIÓN: %d, ~ PROFESOR: %s \n~ AULA: %s \n~ DÍAS: %s \n~ HORARIO: %s ", 
				this._Codigo,
				this._Profesor.toString(),
				this._Aula.toString(),
				this._Dias.toString(),
				this._Horario.toString()
				
				
				);
	}

}
