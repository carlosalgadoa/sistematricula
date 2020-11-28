package Gestiones;

import java.util.LinkedList;

import Clases.CarreraDeEstudio;

public class GestionCarreraDeEstudio {

	private LinkedList<CarreraDeEstudio> listCarreraDeEstudio=new LinkedList<>();

	public GestionCarreraDeEstudio() {
		super();
	}

	public LinkedList<CarreraDeEstudio> getListCarreraDeEstudio() {
		return listCarreraDeEstudio;
	}
	
	/**
	 * Método utilizado para agregar carrera
	 * @param CarreraDeEstudio objeto de tipo carrera de estudio
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(CarreraDeEstudio CarreraDeEstudio) {
		if(BuscarPorCodigo(CarreraDeEstudio.get_codigo())==-1) { //El cargo no está registrado
			listCarreraDeEstudio.add(CarreraDeEstudio);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar carrera por el índice
	 * @param  posicion de la carrera
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listCarreraDeEstudio.size()) {
			return false;
		}else {
			listCarreraDeEstudio.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevaCarreraDeEstudio es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, CarreraDeEstudio nuevaCarreraDeEstudio ) {
		if(posicion<0 || posicion>listCarreraDeEstudio.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevaCarreraDeEstudio.get_codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listCarreraDeEstudio.set(posicion, nuevaCarreraDeEstudio);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por código de carrera
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listCarreraDeEstudio.size();i++) {
			if(listCarreraDeEstudio.get(i).get_codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemtno de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de carrera que esta en la posición de la colección listCarreraDeEstudio
	 */
	public CarreraDeEstudio getElementoPorPosicion(int posicion) {
		return listCarreraDeEstudio.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listCarreraDeEstudio.size();i++) {
			System.out.println(listCarreraDeEstudio.get(i));
		}
	}
	

}
