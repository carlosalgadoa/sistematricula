package Clases;

public class Profesor extends Persona {
	
	private int _NoEmpleado;
	//constructor por defecto
	public Profesor() {
		super();
	}
	//constructor con todos los campos
	public Profesor(int _NoEmpleado) {
		super();
		this._NoEmpleado = _NoEmpleado;
	}
	//constructor usando superclase
	public Profesor(String _Nombres, String _Apellidos, String _Correo, String _Telefono, String _Direccion,int _NoEmpleado) {
		super(_Nombres, _Apellidos, _Correo, _Telefono, _Direccion);
		this._NoEmpleado = _NoEmpleado;
		
	}
	public int get_NoEmpleado() {
		return _NoEmpleado;
	}
	public void set_NoEmpleado(int _NoEmpleado) {
		this._NoEmpleado = _NoEmpleado;
	}
	@Override
	public String toString() {
		String _infoClase=String.format(",~ NÚMERO DE EMPLEADO: %s] ", this._NoEmpleado);
		return super.toString()+_infoClase;
	}
	
	
	
	
	
	
	
	
	
	

}
