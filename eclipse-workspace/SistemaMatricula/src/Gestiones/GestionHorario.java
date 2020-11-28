package Gestiones;
import java.util.LinkedList;

import Clases.Horario;

public class GestionHorario {

	private LinkedList<Horario> listHorario=new LinkedList<>();

	public GestionHorario() {
		super();
	}

	public LinkedList<Horario> getListHorario() {
		return listHorario;
	}
	
	/**
	 * Método utilizado para agregar Horario
	 * @param Horario objeto de tipo Horario
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(Horario Horario) {
		if(BuscarPorCodigo(Horario.get_Codigo())==-1) { //El horario no está registrado
			listHorario.add(Horario);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar Horario por el índice
	 * @param posicion del Horario
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listHorario.size()) {
			return false;
		}else {
			listHorario.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevoHorario es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Horario nuevoHorario ) {
		if(posicion<0 || posicion>listHorario.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevoHorario.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listHorario.set(posicion, nuevoHorario);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por codigo de Horario
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listHorario.size();i++) {
			if(listHorario.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Horario que esta en la posición de la colección listHorario
	 */
	public Horario getElementoPorPosicion(int posicion) {
		return listHorario.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listHorario.size();i++) {
			System.out.println(listHorario.get(i));
		}
	}

}
