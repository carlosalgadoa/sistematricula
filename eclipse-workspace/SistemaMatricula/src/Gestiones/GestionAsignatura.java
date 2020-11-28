package Gestiones;

import java.util.LinkedList;

import Clases.Asignatura;


public class GestionAsignatura {
	
	private LinkedList<Asignatura> lstAsignatura=new LinkedList<>();

	public GestionAsignatura() {
		super();
	}

	public LinkedList<Asignatura> getLstAsignatura() {
		return lstAsignatura;
	}

	public void setLstAsignatura(LinkedList<Asignatura> lstAsignatura) {
		this.lstAsignatura = lstAsignatura;
	}
	
	/**
	 * Método para buscar por codigo de asignatura
	 * @param CodigoAsignatura a buscar
	 * @return -2 si no lo encuentra, caso contrario retorna la posición en la colección
	 */
	
	public int BuscarAsignatura(String CodigoAsignatura) {
		int posicion=-1;
		for(int i=0;i<lstAsignatura.size();i++) {
			if(lstAsignatura.get(i).get_CodigoAsignatura().equals(CodigoAsignatura)) {
				posicion=i;
				break;
			}
		}
		return posicion;
		
		
	}
	/**
	 * Método utilizado para agregar una Asignatura
	 * @param asignatura objeto de tipo Asignatura
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Agregar(Asignatura asignatura) {
		if(BuscarAsignatura(asignatura.get_CodigoAsignatura())==-1) { //Si el estudiante no está registrado
			lstAsignatura.add(asignatura);
			return true;
		}else {
			return false;
		}
		
	}
	/**
	 * Método para eliminar asignatura por posicion 
	 * @param posicion de la asignatura
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>lstAsignatura.size()) {
			return false;
		}else {
			lstAsignatura.remove(posicion);
			return true;
		}
	
	}
	/**
	 * Método para modificar una asignatura
	 * @param posicion del elemento en la colección
	 * @param AsignaturaModificada es la nueva asignatura que se va a reemplazar
	 * @return  true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Modificar(Asignatura AsignaturaModificada, int posicion ) {
		if(posicion<0 || posicion>lstAsignatura.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarAsignatura(AsignaturaModificada.get_CodigoAsignatura());
			
			if(posicionEncontrada==-2 || posicionEncontrada==posicion ) {
				lstAsignatura.set(posicion, AsignaturaModificada);
				return true;
			}else {
				return false;
			}
			
			
		}
		
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de cargo que esta en la posición de la colección lstCargo
	 */
	public Asignatura getElementoPorPosicion(int posicion) {
		return lstAsignatura.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<lstAsignatura.size();i++) {
			System.out.println(lstAsignatura.get(i));
		}
	}
	

}
