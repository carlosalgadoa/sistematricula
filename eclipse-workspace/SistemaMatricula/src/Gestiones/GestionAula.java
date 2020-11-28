package Gestiones;
import java.util.LinkedList;

import Clases.Aula;

public class GestionAula {
	private LinkedList<Aula> listAula=new LinkedList<>();

	public GestionAula() {
		super();
	}

	public LinkedList<Aula> getListAula() {
		return listAula;
	}
	
	/**
	 * Método utilizado para agregar Aula
	 * @param Aula objeto de tipo aula
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(Aula Aula) {
		if(BuscarPorCodigo(Aula.get_NoAula())==-1) { //El Aula no está registrada
			listAula.add(Aula);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar aula por el índice
	 * @param posicion del aula
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listAula.size()) {
			return false;
		}else {
			listAula.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevaAula es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Aula nuevaAula ) {
		if(posicion<0 || posicion>listAula.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevaAula.get_NoAula());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listAula.set(posicion, nuevaAula);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por numero de aula
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listAula.size();i++) {
			if(listAula.get(i).get_NoAula()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de aula que esta en la posición de la colección listAula
	 */
	public Aula getElementoPorPosicion(int posicion) {
		return listAula.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listAula.size();i++) {
			System.out.println(listAula.get(i));
		}
	}

}
