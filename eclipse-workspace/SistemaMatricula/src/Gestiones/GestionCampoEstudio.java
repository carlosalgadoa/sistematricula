package Gestiones;

import java.util.LinkedList;

import Clases.CampoEstudio;


public class GestionCampoEstudio {

	private LinkedList<CampoEstudio> lstCampo= new LinkedList<>();

	public GestionCampoEstudio() {
		super();
	}

	public LinkedList<CampoEstudio> getLstCampo() {
		return lstCampo;
	}

	public void setLstCampo(LinkedList<CampoEstudio> lstCampo) {
		this.lstCampo = lstCampo;
	}
	
	/**
	 * Método para buscar por código de campo
	 * @param Codigo a buscar
	 * @return -1 si no lo encuentra, caso contrario retorna la posición en la colección
	 */
	
	public int BuscarCampoEstudio(int Codigo) {
		int posicion=-1;
		for(int i=0;i<lstCampo.size();i++) {
			if(lstCampo.get(i).get_CodigoCampo()==Codigo) {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	
	/**
	 * Método utilizado para agregar campo
	 * @param Campo objeto de tipo CampoEstudio
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Agregar(CampoEstudio Campo) {
		if(BuscarCampoEstudio(Campo.get_CodigoCampo())==-1) { //El cargo no está registrado
			lstCampo.add(Campo);
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método para eliminar campo por posición
	 * @param  posicion del campo
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean Eliminar(int posicion) {
		if(posicion<0 || posicion>lstCampo.size()) {
			return false;
		}else {
			lstCampo.remove(posicion);
			return true;
		}
	}
	
	/**
	 * Método para modificar campo de la coleccion
	 * @param posicion del campo en la colección
	 * @param CampoNuevo es el nuevo objeto que voy a reemplazar en la coleccion
	 * @return  true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean Modificar(int posicion, CampoEstudio CampoNuevo ) {
		if(posicion<0 || posicion>lstCampo.size()) {
			return false;
		}else {
			int posicionEncontrada=BuscarCampoEstudio(CampoNuevo.get_CodigoCampo());
			
			if(posicionEncontrada==-1 || posicionEncontrada==posicion ) {
				lstCampo.set(posicion, CampoNuevo);
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
	public CampoEstudio getElementoPorPosicion(int posicion) {
		return lstCampo.get(posicion);
	}
	
	
	/**
	 * Imprimir todos los elementos en la colección
	 */
	public void ImprimirTodos() {
		for(int i=0;i<lstCampo.size();i++) {
			System.out.println(lstCampo.get(i));
		}
	}
	
}
