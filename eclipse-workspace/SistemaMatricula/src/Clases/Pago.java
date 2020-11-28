package Clases;

public class Pago {

private int _Codigo;
private int _NoClases;
private int _NoLabs;
private int _Total;
public static int _MontoMatricula=3000;
public static int _MontoClase=500;
public static int _MontoLab=300 ;

public Pago() {
	super();
}

public Pago(int _Codigo, int _NoClases, int _NoLabs, int _Total) {
	super();
	this._Codigo = _Codigo;
	this._NoClases = _NoClases;
	this._NoLabs = _NoLabs;
	this._Total= _Total;
}


public int get_Codigo() {
	return _Codigo;
}

public void set_Codigo(int _Codigo) {
	this._Codigo = _Codigo;
}

public int get_NoClases() {
	return _NoClases;
}

public void set_NoClases(int _NoClases) {
	this._NoClases = _NoClases;
}

public int get_NoLabs() {
	return _NoLabs;
}

public void set_NoLabs(int _NoLabs) {
	this._NoLabs = _NoLabs;
}

public int get_Total() {
	return _Total;
}

public void set_Total(int _Total) {
	this._Total = _Total;
}

public static int get_MontoMatricula() {
	return _MontoMatricula;
}

public static void set_MontoMatricula(int _MontoMatricula) {
	Pago._MontoMatricula = _MontoMatricula;
}

public static int get_MontoClase() {
	return _MontoClase;
}

public static void set_MontoClase(int _MontoClase) {
	Pago._MontoClase = _MontoClase;
}

public static int get_MontoLab() {
	return _MontoLab;
}

public static void set_MontoLab(int _MontoLab) {
	Pago._MontoLab = _MontoLab;
}

public int MontoPorClases(){
	return (this.get_NoClases()*_MontoClase);
}

public int MontoPorLabs(){
	return (this.get_NoLabs()*_MontoLab);
}

public int MontoTotal(){
	return (MontoPorClases()+MontoPorLabs()+ _MontoMatricula);
}
@Override
public String toString() {
	
	return String.format("Pago[~ CÓDIGO DE PAGO: %d, ~ NÚMERO CLASES MATRICULADAS: %s, ~ NÚMERO LABORATORIOS MATRICULADOS: %s, ~ TOTAL A PAGAR: %d]", 
			this._Codigo,
			this._NoClases,
			this._NoLabs,
			this._Total
			
			
			);
}







}
