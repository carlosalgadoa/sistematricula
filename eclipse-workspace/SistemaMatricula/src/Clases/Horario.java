package Clases;

public class Horario {
	private int _Codigo;
	private String _HoraInicio;
	private String _HoraFin;
	
	//constructor por defecto
	public Horario() {
		super();
	}
	
	//constructor con todos los campos
	public Horario(int _Codigo, String _HoraInicio, String _HoraFin) {
		super();
		this._Codigo = _Codigo;
		this._HoraInicio = _HoraInicio;
		this._HoraFin = _HoraFin;
	}
	
	
	public int get_Codigo() {
		return _Codigo;
	}

	public void set_Codigo(int _Codigo) {
		this._Codigo = _Codigo;
	}

	public String get_HoraInicio() {
		return _HoraInicio;
	}

	public void set_HoraInicio(String _HoraInicio) {
		this._HoraInicio = _HoraInicio;
	}

	public String get_HoraFin() {
		return _HoraFin;
	}

	public void set_HoraFin(String _HoraFin) {
		this._HoraFin = _HoraFin;
	}

	@Override
	public String toString() {
		
		return String.format("Horario[~ CÓDIGO DE HORARIO: %d, ~ HORA INICIO: %s, ~ HORA FIN: %s]", 
				this._Codigo,
				this._HoraInicio,
		this._HoraFin
				
				
				);
	}

	
	

}
