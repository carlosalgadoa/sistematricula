package Gestiones;

import java.util.LinkedList;


import Clases.Edificio;

public class GestionEdificio {

	private LinkedList<Edificio> lstEdificio=new LinkedList<>();

	public GestionEdificio() {
		super();
	}

	public LinkedList<Edificio> getLstEdificio() {
		return lstEdificio;
	}

	public void setLstEdificio(LinkedList<Edificio> lstEdificio) {
		this.lstEdificio = lstEdificio;
	}

	/**
	 * Método para buscar por código de edificio
	 * @param CodigoEdificio a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posición en la colección
	 */
	
	public int BuscarEdificio(int CodigoEdificio) {
		int posicion=-1;
		for(int i=0;i<lstEdificio.size();i++) {
			if(lstEdificio.get(i).get_CodigoEdificio()==CodigoEdificio) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Método utilizado para agregar edificio
	 * @param edificio objeto de tipo edificio
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Agregar(Edificio edificio) {
		if(BuscarEdificio(edificio.get_CodigoEdificio())==-1) { //El cargo no está registrado
			lstEdificio.add(edificio);
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método para eliminar el edificio por posicion
	 * @param  posicion del edificio
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>lstEdificio.size()) {
			return false;
		}else {
			lstEdificio.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar el edificio de la coleccion
	 * @param posicion del edificio en la colección
	 * @param NuevoEdificio es el nuevo objeto que voy a reemplazar en la coleccion
	 * @return  true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Modificar(int posicion, Edificio NuevoEdificio ) {
		if(posicion<0 || posicion>lstEdificio.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarEdificio(NuevoEdificio.get_CodigoEdificio());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				lstEdificio.set(posicion, NuevoEdificio);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Retorna el elemento de una colección según su posiciún
	 * @param posicion del elemento a retornar
	 * @return un objeto de cargo que esta en la posición de la colección lstEdificio
	 */
	public Edificio getElementoPorPosicion(int posicion) {
		return lstEdificio.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<lstEdificio.size();i++) {
			System.out.println(lstEdificio.get(i));
		}
	}
}
