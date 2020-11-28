package Clases;

import java.util.Date;

public class Matricula {
	
	private int _Codigo;
	private String _Fecha;
	private Estudiante _Estudiante;
	private Periodo _Periodo;
	private TipoMatricula _TipoMatricula;
	private SeccionClase _Seccion;
	private SeccionLaboratorio _SeccionLaboratorio;
	private Pago _Pago;
	public Matricula() {
		super();
	}
	public Matricula(int _Codigo, String _Fecha, Estudiante _Estudiante, Periodo _Periodo,
			TipoMatricula _TipoMatricula, SeccionClase _Seccion, SeccionLaboratorio _SeccionLaboratorio, Pago _Pago) {
		super();
		this._Codigo = _Codigo;
		this._Fecha = _Fecha;
		this._Estudiante = _Estudiante;
		this._Periodo = _Periodo;
		this._TipoMatricula = _TipoMatricula;
		this._Seccion = _Seccion;
		this._SeccionLaboratorio = _SeccionLaboratorio;
		this._Pago = _Pago;
	}
	public int get_Codigo() {
		return _Codigo;
	}
	public void set_Codigo(int _Codigo) {
		this._Codigo = _Codigo;
	}
	public String get_Fecha() {
		return _Fecha;
	}
	public void set_Fecha(String _Fecha) {
		this._Fecha = _Fecha;
	}
	public Estudiante get_Estudiante() {
		return _Estudiante;
	}
	public void set_Estudiante(Estudiante _Estudiante) {
		this._Estudiante = _Estudiante;
	}
	public Periodo get_Periodo() {
		return _Periodo;
	}
	public void set_Periodo(Periodo _Periodo) {
		this._Periodo = _Periodo;
	}
	public TipoMatricula get_TipoMatricula() {
		return _TipoMatricula;
	}
	public void set_TipoMatricula(TipoMatricula _TipoMatricula) {
		this._TipoMatricula = _TipoMatricula;
	}
	public SeccionClase get_Seccion() {
		return _Seccion;
	}
	public void set_Seccion(SeccionClase _Seccion) {
		this._Seccion = _Seccion;
	}
	public SeccionLaboratorio get_SeccionLaboratorio() {
		return _SeccionLaboratorio;
	}
	public void set_SeccionLaboratorio(SeccionLaboratorio _SeccionLaboratorio) {
		this._SeccionLaboratorio = _SeccionLaboratorio;
	}
	public Pago get_Pago() {
		return _Pago;
	}
	public void set_Pago(Pago _Pago) {
		this._Pago = _Pago;
	}
	
	@Override
	public String toString() {
		
		return String.format("Matricula[~ CÓDIGO DE MATRICULA: %d, ~ FECHA: %s \n~ ESTUDIANTE: %s, ~ PERIODO: %s \n~ TIPO MATRICULA: %s, ~ SECCIÓN ASIGNATURA: %s \n~ SECCIÓN LABORATORIO: %s , ~ PAGO: %s]", 
		this._Codigo,
		this._Fecha,
		this._Estudiante,
		this._Periodo,
		this._TipoMatricula,
		this._Seccion,
		this._SeccionLaboratorio,
		this._Pago
				
				);
	}
	
	
	 
	
	
	
	
	

}
