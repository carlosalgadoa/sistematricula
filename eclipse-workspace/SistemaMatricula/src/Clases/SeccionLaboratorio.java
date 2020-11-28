package Clases;
public class SeccionLaboratorio extends Seccion {

	
	private Laboratorio _Laboratorio;
	
	public SeccionLaboratorio() {
		super();
	}

	public SeccionLaboratorio(Laboratorio _Laboratorio) {
		super();
		this._Laboratorio = _Laboratorio;
	}

	public SeccionLaboratorio(int _Codigo, Profesor _Profesor, Aula _Aula, String _Dias, Horario _Horario,Laboratorio _Laboratorio) {
		super(_Codigo, _Profesor, _Aula, _Dias, _Horario);
		this._Laboratorio = _Laboratorio;
		
	}

	public Laboratorio get_Laboratorio() {
		return _Laboratorio;
	}

	public void set_Laboratorio(Laboratorio _Laboratorio) {
		this._Laboratorio = _Laboratorio;
	}
	
	@Override
	public String toString() {
		String _infoClase=String.format("\nLaboratorio: %s] ", this._Laboratorio);
		return super.toString()+_infoClase;
	}
	
	
	
	
}
