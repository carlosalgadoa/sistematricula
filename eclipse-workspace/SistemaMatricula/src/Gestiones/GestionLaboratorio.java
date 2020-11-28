package Gestiones;
import java.util.LinkedList;

import Clases.Laboratorio;

public class GestionLaboratorio {
	
	private LinkedList<Laboratorio> listLaboratorio=new LinkedList<>();

	public GestionLaboratorio() {
		super();
	}

	public LinkedList<Laboratorio> getListLaboratorio() {
		return listLaboratorio;
	}
	
	/**
	 * Método utilizado para agregar Lab
	 * @param Laboratorio objeto de tipo laboratorio
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(Laboratorio Laboratorio) {
		if(BuscarPorCodigo(Laboratorio.get_Codigo())==-1) { //El lab no está registrado
			listLaboratorio.add(Laboratorio);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar lab por el índice
	 * @param  posicion del lab
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listLaboratorio.size()) {
			return false;
		}else {
			listLaboratorio.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevoLaboratorio es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Laboratorio nuevoLaboratorio ) {
		if(posicion<0 || posicion>listLaboratorio.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevoLaboratorio.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listLaboratorio.set(posicion, nuevoLaboratorio);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por numero de Laboratorio
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listLaboratorio.size();i++) {
			if(listLaboratorio.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Laboratorio que esta en la posición de la colección listLaboratorio
	 */
	public Laboratorio getElementoPorPosicion(int posicion) {
		return listLaboratorio.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listLaboratorio.size();i++) {
			System.out.println(listLaboratorio.get(i));
		}
	}
	

}
