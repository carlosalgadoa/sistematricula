package Clases;

import java.util.Date;

import Util.AdminFechas;

public class Periodo {
private int _NumeroPeriodo;
private String _Modalidad;
private String _FechaInicio;
private String _FechaFinal;
private int _Duracion;


public Periodo() {
	super();
}

public Periodo(int _NumeroPeriodo, String _Modalidad, String _FechaInicio, String _FechaFinal, int _Duracion) {
	super();
	this._NumeroPeriodo = _NumeroPeriodo;
	this._Modalidad = _Modalidad;
	this._FechaInicio = _FechaInicio;
	this._FechaFinal = _FechaFinal;
        this._Duracion= _Duracion;
	
}

public int get_NumeroPeriodo() {
	return _NumeroPeriodo;
}

public void set_NumeroPeriodo(int _NumeroPeriodo) {
	this._NumeroPeriodo = _NumeroPeriodo;
}

public String get_Modalidad() {
	return _Modalidad;
}

public void set_Modalidad(String _Modalidad) {
	this._Modalidad = _Modalidad;
}

public String get_FechaInicio() {
	return _FechaInicio;
}

public void set_FechaInicio(String _FechaInicio) {
	this._FechaInicio = _FechaInicio;
}

public String get_FechaFinal() {
	return _FechaFinal;
}

public void set_FechaFinal(String _FechaFinal) {
	this._FechaFinal = _FechaFinal;
}
public int get_Duracion() {
	return _Duracion;
}

public void set_Duracion(int _Duracion) {
	this._Duracion = _Duracion;
}




public int ObtenerDuracionPeriodo(){
	
	Date fechaInicioDate=AdminFechas.stringToDate(this.get_FechaInicio());
	Date fechaFinDate=AdminFechas.stringToDate(this.get_FechaFinal());
	
	return ( AdminFechas.restarFechasDias(fechaInicioDate ,fechaFinDate));
}
@Override
public String toString() {
	
	return String.format("Periodo[~ NÚMERO DE PERIODO: %d, ~ MODALIDAD: %s, ~ FECHA INICIO %s, ~ FECHA FIN: %s , ~ DURACIÓN: %d Días]", 
			this._NumeroPeriodo,
			this._Modalidad,
			this._FechaInicio,
			this._FechaFinal,
			this._Duracion
			
			
			);
}





}
