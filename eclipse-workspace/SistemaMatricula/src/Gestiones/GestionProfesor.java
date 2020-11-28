package Gestiones;
import java.util.LinkedList;

import Clases.Profesor;

public class GestionProfesor {

	private LinkedList<Profesor> listProfesor=new LinkedList<>();

	public GestionProfesor() {
		super();
	}

	public LinkedList<Profesor> getListProfesor() {
		return listProfesor;
	}
	
	/**
	 * Método utilizado para agregar Profesor
	 * @param Profesor objeto de tipo Profesor
	 * @return true - si todo se realizé correctamente , sino retorna false
	 */
	public boolean Agregar(Profesor Profesor) {
		if(BuscarPorCodigo(Profesor.get_NoEmpleado())==-1) { //El profesor no está registrado
			listProfesor.add(Profesor);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar Profesor por el índice
	 * @param  posicion del Profesor
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listProfesor.size()) {
			return false;
		}else {
			listProfesor.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevoProfesor es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Profesor nuevoProfesor ) {
		if(posicion<0 || posicion>listProfesor.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevoProfesor.get_NoEmpleado());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listProfesor.set(posicion, nuevoProfesor);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por numero de profesor(empleador)
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listProfesor.size();i++) {
			if(listProfesor.get(i).get_NoEmpleado()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Profesor que esta en la posición de la colección listProfesor
	 */
	public Profesor getElementoPorPosicion(int posicion) {
		return listProfesor.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listProfesor.size();i++) {
			System.out.println(listProfesor.get(i));
		}
	}

}
