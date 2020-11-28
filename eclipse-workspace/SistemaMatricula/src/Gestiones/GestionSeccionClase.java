package Gestiones;

import java.util.LinkedList;

import Clases.SeccionClase;

public class GestionSeccionClase {
	
	private LinkedList<SeccionClase> listSeccion=new LinkedList<>();

	public GestionSeccionClase() {
		super();
	}

	public LinkedList<SeccionClase> getListHorario() {
		return listSeccion;
	}
	
	/**
	 * Método utilizado para agregar Seccion
	 * @param Seccion objeto de tipo Seccion
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(SeccionClase Seccion) {
		if(BuscarPorCodigo(Seccion.get_Codigo())==-1) { //La seccion no está registrada
			listSeccion.add(Seccion);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar Seccion por el índice
	 * @param posicion del Sección
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listSeccion.size()) {
			return false;
		}else {
			listSeccion.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevaSeccion es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, SeccionClase nuevaSeccion ) {
		if(posicion<0 || posicion>listSeccion.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevaSeccion.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listSeccion.set(posicion, nuevaSeccion);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por codigo de Seccion
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listSeccion.size();i++) {
			if(listSeccion.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Seccion que esta en la posición de la colección listSeccion
	 */
	public SeccionClase getElementoPorPosicion(int posicion) {
		return listSeccion.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listSeccion.size();i++) {
			System.out.println(listSeccion.get(i));
		}
	}

	
	
	

}
