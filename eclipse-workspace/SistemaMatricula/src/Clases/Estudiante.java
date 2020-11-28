package Clases;
public class Estudiante extends Persona{
	private String _numeroCuenta;
	private CarreraDeEstudio _carreraDeEstudio;
	
	//Constructor por defecto
	public Estudiante() {
		super();
	}

	//Constructor usando todos los campos
	public Estudiante(String _numeroCuenta, CarreraDeEstudio _carreraDeEstudio) {
		super();
		this._numeroCuenta = _numeroCuenta;
		this._carreraDeEstudio = _carreraDeEstudio;
	}

	//Constructor usando la superclase
	public Estudiante(String _Nombres, String _Apellidos, String _Correo, String _Telefono, String _Direccion,String _numeroCuenta, CarreraDeEstudio _carreraDeEstudio) {
		super(_Nombres, _Apellidos, _Correo, _Telefono, _Direccion);
		this._numeroCuenta = _numeroCuenta;
		this._carreraDeEstudio = _carreraDeEstudio;
	}

	public String get_numeroCuenta() {
		return _numeroCuenta;
	}

	public void set_numeroCuenta(String _numeroCuenta) {
		this._numeroCuenta = _numeroCuenta;
	}

	public CarreraDeEstudio get_carreraDeEstudio() {
		return _carreraDeEstudio;
	}

	public void set_carreraDeEstudio(CarreraDeEstudio _carreraDeEstudio) {
		this._carreraDeEstudio = _carreraDeEstudio;
	}

	@Override
	public String toString() {
		String _infoClase=String.format(",~ NÚMERO DE CUENTA: %s, ~ CARRERA DE ESTUDIO... %s] ", this._numeroCuenta
				,this._carreraDeEstudio);
		return super.toString()+_infoClase;
	}
	
	
	
	
	
	
	
}


	