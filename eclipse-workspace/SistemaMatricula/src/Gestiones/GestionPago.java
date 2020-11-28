package Gestiones;
import java.util.LinkedList;

import Clases.Pago;

public class GestionPago {

	private LinkedList<Pago> listPago=new LinkedList<>();

	public GestionPago() {
		super();
	}

	public LinkedList<Pago> getListPago() {
		return listPago;
	}
	
	/**
	 * M´rtodo utilizado para agregar Pago
	 * @param Pago objeto de tipo Pago
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Agregar(Pago Pago) {
		if(BuscarPorCodigo(Pago.get_Codigo())==-1) { //El pago no está registrado
			listPago.add(Pago);
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/**
	 * Método para eliminar Pago por el índice
	 * @param posicion del Pago
	 * @return true - si todo se realizó correctamente , sino retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>listPago.size()) {
			return false;
		}else {
			listPago.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar un elemento en la colección
	 * @param posicion o índice del elemento en la colección
	 * @param nuevoPago es el nuevo objeto que vamos a reemplazar
	 * @return  true - si todo se realizó correctamente , sino retorna false
	 */
	
	public boolean Modificar(int posicion, Pago nuevoPago ) {
		if(posicion<0 || posicion>listPago.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarPorCodigo(nuevoPago.get_Codigo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				listPago.set(posicion, nuevoPago);
				return true;
			}else {
				return false;
			}			
		}
	}
	
	/**
	 * Método para buscar por codigo de Pago
	 * @param codigo a buscar
	 * @return -1 si no lo encuentra, sino retorna la posición en la colección
	 */
	
	public int BuscarPorCodigo(int codigo) {
		int posicion=-1;
		for(int i=0;i<listPago.size();i++) {
			if(listPago.get(i).get_Codigo()==codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Retorna el elemento de una colección según su posición
	 * @param posicion del elemento a retornar
	 * @return un objeto de Pago que esta en la posición de la colección listPago
	 */
	public Pago getElementoPorPosicion(int posicion) {
		return listPago.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<listPago.size();i++) {
			System.out.println(listPago.get(i));
		}
	}
}
