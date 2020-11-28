package Gestiones;
import java.util.LinkedList;


import Clases.SeccionLaboratorio;

public class GestionSeccionLaboratorio {
	
	private LinkedList<SeccionLaboratorio> listSeccionLaboratorio=new LinkedList<>();

	public GestionSeccionLaboratorio() {
		super();
	}
	
	public LinkedList<SeccionLaboratorio> getListSeccionLaboratorio(){
		return listSeccionLaboratorio;
}

	/**
	 * Método para agregar SeccionLaboratorio
	 * @param SeccionLaboratorio objeto de tipo SeccionLaboratorio
	 * @return true si todo se realizó correctamente, sino retorna falso
	 */

	public boolean Agregar(SeccionLaboratorio SeccionLaboratorio) {
		if(BuscarPorCodigo(SeccionLaboratorio.get_Codigo())==-1) {
			listSeccionLaboratorio.add(SeccionLaboratorio);
			return true;
		}else {

		return false;
	}
	}


/**
 * Método para eliminar SeccionLaboratorio por la posicion
 * @param posicion de la SeccionLaboratorio
 * @return true si todo se realizó correctamente, sino retorna false
 */
public boolean Eliminar(int posicion) {
	if(posicion<0 || posicion>listSeccionLaboratorio.size()) {
		return false;
	}else {
	listSeccionLaboratorio.remove(posicion);
	return true;
}
}

/**
 * Método para modificar una SeccionLaboratorio por un elemento en la colección
 * @param posicion del elemento en la colección
 * @param nuevaSeccionLaboratorio es el nuevo objeto que vamos a reemplazar
 * @return true si todo re realizó correctamente, sino retorna falso
 */
public boolean Modificar(int posicion, SeccionLaboratorio nuevaSeccionLaboratorio) {
	if(posicion<0 || posicion>listSeccionLaboratorio.size()) {
		return false;
	}else {
		int posicionEncontrada=BuscarPorCodigo(nuevaSeccionLaboratorio.get_Codigo());
		if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
			listSeccionLaboratorio.set(posicion, nuevaSeccionLaboratorio);
			return true;
		}else {
			return false;
		}
	}
	

}

public int BuscarPorCodigo(int codigo) {
	int posicion=-1;
	for(int i=0;i<listSeccionLaboratorio.size();i++) {
		if(listSeccionLaboratorio.get(i).get_Codigo()==codigo) {
			posicion=i;
			break;
		}
	}
	return posicion;
}

public SeccionLaboratorio getElementoPorPosicion(int posicion) {
	return listSeccionLaboratorio.get(posicion);
}

public void imprimirTodos() {
	for(int i=0;i<listSeccionLaboratorio.size();i++) {
		System.out.println(listSeccionLaboratorio.get(i));
	}
}



}



