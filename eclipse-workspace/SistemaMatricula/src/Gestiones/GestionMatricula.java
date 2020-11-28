package Gestiones;

import java.util.LinkedList;

import Clases.Matricula;

public class GestionMatricula {
	private LinkedList<Matricula> listMatricula=new LinkedList<>();

	public GestionMatricula() {
		super();
	}

	public LinkedList<Matricula> getListMatricula() {
		return listMatricula;
	}
	
	/**
	 * Método utilizado para agregar Matricula
	 * @param Matricula objeto de tipo Matricula
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(Matricula Matricula) {
		if(BuscarPorCodigo(Matricula.get_Codigo())==-1) { //La Matricula no está registrada
			listMatricula.add(Matricula);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar Matricula por el índice
	 * @param posicion del Seccion
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listMatricula.size()) {
			return false;
		}else {
			listMatricula.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevaMatricula es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Matricula nuevaMatricula ) {
		if(posicion<0 || posicion>listMatricula.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevaMatricula.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listMatricula.set(posicion, nuevaMatricula);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por codigo de Matricula
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listMatricula.size();i++) {
			if(listMatricula.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Seccion que esta en la posicin de la colección listSeccion
	 */
	public Matricula getElementoPorPosicion(int posicion) {
		return listMatricula.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listMatricula.size();i++) {
			System.out.println(listMatricula.get(i));
		}
	}


}
