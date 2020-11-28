package Gestiones;
import java.util.LinkedList;

import Clases.TipoMatricula;

public class GestionTipoMatricula {

	private LinkedList<TipoMatricula> listTipoMatricula=new LinkedList<>();

	public GestionTipoMatricula() {
		super();
	}

	public LinkedList<TipoMatricula> getListHorario() {
		return listTipoMatricula;
	}
	
	/**
	 * Método utilizado para agregar TipoMatricula
	 * @param TipoMatricula objeto de tipo TipoMatricula
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(TipoMatricula  TipoMatricula) {
		if(BuscarPorCodigo(TipoMatricula.get_Codigo())==-1) { //El TipoMatricula no está registrado
			listTipoMatricula.add(TipoMatricula);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar TipoMatricula por el índice
	 * @param posicion del TipoMatricula
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listTipoMatricula.size()) {
			return false;
		}else {
			listTipoMatricula.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevoTipoMatricula es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, TipoMatricula nuevoTipoMatricula ) {
		if(posicion<0 || posicion>listTipoMatricula.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevoTipoMatricula.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listTipoMatricula.set(posicion, nuevoTipoMatricula);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por codigo de TipoMatricula
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listTipoMatricula.size();i++) {
			if(listTipoMatricula.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de TipoMatricula que esta en la posición de la colección listTipoMatricula
	 */
	public TipoMatricula getElementoPorPosicion(int posicion) {
		return listTipoMatricula.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listTipoMatricula.size();i++) {
			System.out.println(listTipoMatricula.get(i));
		}
	}

}
