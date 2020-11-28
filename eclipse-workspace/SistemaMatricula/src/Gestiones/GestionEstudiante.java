package Gestiones;

import java.util.LinkedList;

import Clases.Estudiante;

public class GestionEstudiante {
	private LinkedList<Estudiante> listEstudiante=new LinkedList<>();

	public GestionEstudiante() {
		super();
	}
	
	public LinkedList<Estudiante> getListEstudiante(){
		return listEstudiante;
}

	/**
	 * Método para agregar estudiantes
	 * @param estudiante objeto de tipo estudiante
	 * @return true si todo se realizó correctamente, sino retorna falso
	 */
public boolean Agregar(Estudiante estudiante) {
	if(BuscarPorNumero(estudiante.get_numeroCuenta())==-1) {
		listEstudiante.add(estudiante);
		return true;
	}else {

	return false;
}
}
/**
 * Método para eliminar estudiante por la posicion
 * @param posicion del estudiante
 * @return true si todo se realizó correctamente, sino retorna false
 */
public boolean Eliminar(int posicion) {
	if(posicion<0 || posicion>listEstudiante.size()) {
		return false;
	}else {
	listEstudiante.remove(posicion);
	return true;
}
}

/**
 * Método para modificar un estudiante por un elemento en la colección
 * @param posicion del elemento en la colección
 * @param nuevoEstudiante es el nuevo objeto que vamos a reemplazar
 * @return true si tdo re realizó correctamente, sino retorna falso
 */
public boolean Modificar(int posicion, Estudiante nuevoEstudiante) {
	if(posicion<0 || posicion>listEstudiante.size()) {
		return false;
	}else {
		int posicionEncontrada=BuscarPorNumero(nuevoEstudiante.get_numeroCuenta());
		if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
			listEstudiante.set(posicion, nuevoEstudiante);
			return true;
		}else {
			return false;
		}
	}
	

}

public int BuscarPorNumero(String numeroCuenta) {
	int posicion=-1;
	for(int i=0;i<listEstudiante.size();i++) {
		if(listEstudiante.get(i).get_numeroCuenta().equals(numeroCuenta)) {
			posicion=i;
			break;
		}
	}
	return posicion;
}

public void imprimirTodos() {
	for(int i=0;i<listEstudiante.size();i++) {
		System.out.println(listEstudiante.get(i));
	}
}


public Estudiante getElementoPorPosicion(int posicion) {
	return listEstudiante.get(posicion);
}




}
