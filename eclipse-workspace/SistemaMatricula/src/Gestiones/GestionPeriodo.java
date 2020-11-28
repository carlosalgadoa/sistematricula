package Gestiones;

import java.util.LinkedList;

import Clases.Periodo;
public class GestionPeriodo {

	private LinkedList<Periodo> lstPeriodo=new LinkedList<>();

	public GestionPeriodo() {
		super();
	}

	public LinkedList<Periodo> getLstPeriodo() {
		return lstPeriodo;
	}

	public void setLstPeriodo(LinkedList<Periodo> lstPeriodo) {
		this.lstPeriodo = lstPeriodo;
	}
	
	/**
	 * Método para buscar por numero de periodo
	 * @param NumeroPeriodo a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posición en la colección
	 */
	
	public int BuscarPeriodo(int NumeroPeriodo) {
		int posicion=-1;
		for(int i=0;i<lstPeriodo.size();i++) {
			if(lstPeriodo.get(i).get_NumeroPeriodo()==NumeroPeriodo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Método utilizado para agregar periodo
	 * @param periodo objeto de tipo Periodo
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Agregar(Periodo periodo) {
		if(BuscarPeriodo(periodo.get_NumeroPeriodo())==-1) { //El cargo no está registrado
			lstPeriodo.add(periodo);
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método para eliminar periodo por posicion
	 * @param  posicion del periodo
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>lstPeriodo.size()) {
			return false;
		}else {
			lstPeriodo.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar periodo de la coleccion
	 * @param posicion del periodo en la colección
	 * @param NuevoPeriodo es el nuevo objeto que voy a reemplazar en la coleccion
	 * @return  true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Modificar(int posicion, Periodo NuevoPeriodo ) {
		if(posicion<0 || posicion>lstPeriodo.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPeriodo(NuevoPeriodo.get_NumeroPeriodo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				lstPeriodo.set(posicion, NuevoPeriodo);
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
	public Periodo getElementoPorPosicion(int posicion) {
		return lstPeriodo.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<lstPeriodo.size();i++) {
			System.out.println(lstPeriodo.get(i));
		}
	}
}
