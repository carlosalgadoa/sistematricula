package Clases;
public class SeccionClase extends Seccion {
	
	
    private Asignatura _Asignatura;

	public SeccionClase() {
		super();
	}

	public SeccionClase(Asignatura _Asignatura) {
		super();
		this._Asignatura = _Asignatura;
	}

	public SeccionClase(int _Codigo, Profesor _Profesor, Aula _Aula, String _Dias, Horario _Horario,Asignatura _Asignatura) {
		super(_Codigo, _Profesor, _Aula, _Dias, _Horario);
		this._Asignatura = _Asignatura;
	}

	public Asignatura get_Asignatura() {
		return _Asignatura;
	}

	public void set_Asignatura(Asignatura _Asignatura) {
		this._Asignatura = _Asignatura;
	}
	
	@Override
	public String toString() {
		String _infoClase=String.format("\n~ ASIGNATURA: %s] ", this._Asignatura);
		return super.toString()+_infoClase;
   
	
	}   

}
