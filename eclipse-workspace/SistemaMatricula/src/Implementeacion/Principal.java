package Implementeacion;
import java.util.Date;
import java.util.Scanner;

import Clases.Asignatura;
import Clases.Aula;
import Clases.CampoEstudio;
import Clases.CarreraDeEstudio;
import Clases.Edificio;
import Clases.Estudiante;
import Clases.Horario;
import Clases.Laboratorio;
import Clases.Matricula;
import Clases.Pago;
import Clases.Periodo;
import Clases.Profesor;
import Clases.SeccionClase;
import Clases.SeccionLaboratorio;
import Clases.TipoMatricula;
import Gestiones.GestionAsignatura;
import Gestiones.GestionAula;
import Gestiones.GestionCampoEstudio;
import Gestiones.GestionCarreraDeEstudio;
import Gestiones.GestionEdificio;
import Gestiones.GestionEstudiante;
import Gestiones.GestionHorario;
import Gestiones.GestionLaboratorio;
import Gestiones.GestionMatricula;
import Gestiones.GestionPago;
import Gestiones.GestionPeriodo;
import Gestiones.GestionProfesor;
import Gestiones.GestionSeccionClase;
import Gestiones.GestionSeccionLaboratorio;
import Gestiones.GestionTipoMatricula;
import Util.AdminFechas;

public class Principal {

	public static void main(String[] args) {
		

		boolean centinelaPrincipal=true, centinelaPeriodo=true,centinelaCarreraDeEstudio=true, centinelaEstudiante=true,centinelaProfesor=true,cicloCampo=true,cicloAsignatura=true,
				cicloEdificio=true,cicloAula=true,centinelaHorario=true,centinelaSeccion=true,centinelaLaboratorio=true,centinelaSeccionLaboratorio=true,centinelaTipoMatricula=true,
				centinelaPago=true,centinelaMatricula=true;
		int opcionPrincipal,NoLabs,NoClases,Duracion,codigoMatricula,opcionMatricula, opcionPeriodo,opcionSeccionLaboratorio,codigoSeccion,opcionLaboratorio,opcionSeccion,noAsignatura, codigoCarrera,opcionHorario,codigoHorario, opcionEstudiante,opcionProfesor,noProfesor, noPeriodo, opcionCarrera,opcionCampo, codigoCampo, opcionAsignatura,UV,opcionAula,opcionEdificio;;
		int numPisos, Total=0,numeroEdificio,opcionPago,codigoPago,opcionTipoMatricula,codigoTipoMatricula, NoAula,codigoLaboratorio,codigoSeccionLaboratorio;
		String descripcionCarrera="",fechaMatricula, codigoAsignatura="",diasLab,descripcionTipoMatricula, codigoProfesor="",nombreAsignatura,nombreEdificio, nivel, tipoCampo;
		//Declarar la clase scanner
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		Scanner sc6=new Scanner(System.in);
		Scanner sc7=new Scanner(System.in);
		Scanner sc8=new Scanner(System.in);
		Scanner sc9=new Scanner(System.in);
		Scanner sc10=new Scanner(System.in);
		String numeroCuenta,dias, nombres,horaInicio,horaFin, apellidos,nombreLab, direccion, modalidad, fechaInicio,fechaFin,nombresp, apellidosp,correo,telefono;
	
		//int DuracionPeriodo;
		
		
		//Instancias de gesti�n
		GestionPeriodo gestionPeriodo=new GestionPeriodo();
		GestionCarreraDeEstudio gestionCarrera= new GestionCarreraDeEstudio();
		GestionEstudiante gestionEstudiante=new GestionEstudiante();
		GestionProfesor gestionProfesor=new GestionProfesor();
		GestionCampoEstudio gestionCampo=new GestionCampoEstudio();
		GestionAsignatura gestionAsignatura= new GestionAsignatura();
		GestionEdificio gestionEdificio=new GestionEdificio();
		GestionAula gestionAula=new GestionAula();
		GestionHorario gestionHorario=new GestionHorario();
		GestionSeccionClase gestionSeccion=new GestionSeccionClase();
		GestionLaboratorio gestionLaboratorio=new GestionLaboratorio();
		GestionSeccionLaboratorio gestionSeccionLaboratorio=new GestionSeccionLaboratorio();
		GestionTipoMatricula gestionTipoMatricula=new GestionTipoMatricula();
		GestionPago gestionPago=new GestionPago();
		GestionMatricula gestionMatricula=new GestionMatricula();
		
		while(centinelaPrincipal) {
			
			System.out.println("Menú Principal");
			System.out.println("1- Gestión de Periodo");
			System.out.println("2- Gestión de Carrera de Estudio");
			System.out.println("3- Gestión de Estudiante");
			System.out.println("4- Gestión de Profesor");
			System.out.println("5- Gestión de Campo de Estudio");
			System.out.println("6- Gestión de Asignatura");
			System.out.println("7- Gestión de Edificio");
			System.out.println("8- Gestión de Aula");
			System.out.println("9- Gestión de Horario");
			System.out.println("10- Gestión de Sección");
			System.out.println("11- Gestión de Laboratorio");
			System.out.println("12- Gestión de Sección de Laboratorio");
			System.out.println("13- Gestión de Tipo de Matricula");
			System.out.println("14- Gestión de Pago");
			System.out.println("15- Gestión de Matricula");
			
			
opcionPrincipal=sc.nextInt();
			
			switch(opcionPrincipal) {
			
			case 1: //Gestión de Periodo
				centinelaPeriodo=true;
				while(centinelaPeriodo) {
					System.out.println("Gestión de Periodo");
					System.out.println("1- Agregar");
					System.out.println("2- Modificar");
					System.out.println("3- Eliminar");
					System.out.println("4- Buscar");
					System.out.println("5- Imprimir todos");
					System.out.println("6- Salir");
					opcionPeriodo=sc.nextInt();
					
					switch(opcionPeriodo) {
					case 1:  //Agregar
						/*Pasos
						1. Solicitar los valores al usuario almacenandolos en variables
						2. Crear la instancia del nuevo objeto (Periodo)
						3. Agregar esta instancia a la gesti�n
						*/
						//Paso 1:
						System.out.println("Agregar Periodo");
						System.out.println("Ingrese el número de Periodo:");
						noPeriodo=sc.nextInt();
						System.out.println("Ingrese la modalidad del Periodo:");
						modalidad=sc2.nextLine();
						System.out.println("Ingrese la fecha de inicio (dd-mm-yyyy):");
						fechaInicio=sc2.nextLine();
						System.out.println("Ingrese la fecha final(dd-mm-yyyy):");
						fechaFin=sc2.nextLine();
						Duracion=0;
	
						Periodo nuevoPeriodo1 = new Periodo(noPeriodo, modalidad, fechaInicio,fechaFin,Duracion);
						
						//Usando m�todo para obtener la duracion del periodo
                                                Duracion=nuevoPeriodo1.ObtenerDuracionPeriodo();
						System.out.println("--------------------------------------");
						System.out.println("Duración del Periodo:"+Duracion+" Días");
						System.out.println("--------------------------------------");
						System.out.println(" ");
                                                
                                                //paso 2:
						Periodo nuevoPeriodo = new Periodo(noPeriodo, modalidad, fechaInicio,fechaFin,Duracion);
						//Paso 3:
						if(gestionPeriodo.Agregar(nuevoPeriodo)) {
							System.out.println("Periodo registrado correctamente");
						}else {
							System.out.println("Error al registrar Periodo");
						}
						
						
						
						break;
					case 2: //Modificar
						/*Pasos
						1. Buscar el periodo a modificar (b�squeda por c�digo)
						2. Solicitar los nuevos valores al usuario y almacenarlos en variables
						3. Crear la instancia del nuevo objeto (periodo)
						4. Reemplazar esta instancia a la gesti�n
						*/
						
						//Paso 1:
						int noPeriodoModificar, posicionPeriodo;
						System.out.println("Modificar Periodo");
						System.out.println("Ingrese el nímero del Periodo a modificar:");
						noPeriodoModificar=sc.nextInt();
						
						posicionPeriodo=gestionPeriodo.BuscarPeriodo(noPeriodoModificar);
						
						if(posicionPeriodo==-1) {
							System.out.println("El periodo no existe");
						}else {
							Periodo PeriodoEncontrado= gestionPeriodo.getElementoPorPosicion(posicionPeriodo);
							System.out.println(PeriodoEncontrado);
							
							//Paso 2:
							System.out.println("Ingrese el número de Periodo:");
							noPeriodo=sc.nextInt();
							System.out.println("Ingrese la modalidad del periodo:");
							modalidad=sc2.nextLine();
							System.out.println("Ingrese la fecha de inicio (dd-mm-yyyy):");
							fechaInicio=sc2.nextLine();
							System.out.println("Ingrese la fecha final (dd-mm-yyyy:");
							fechaFin=sc2.nextLine();
							 Duracion=0;
							
							//Paso 3:
							Periodo PeriodoModificado1 = new Periodo(noPeriodo, modalidad, fechaInicio, fechaFin,Duracion);
							
							//Usando m�todo para obtener la duracion del periodo
                                                        Duracion=PeriodoModificado1.ObtenerDuracionPeriodo();
							System.out.println("--------------------------------------");
							System.out.println("Duración del Periodo:"+Duracion+" Días");
							System.out.println("--------------------------------------");
							System.out.println(" ");
							
							
							//Paso 3:
							Periodo PeriodoModificado = new Periodo(noPeriodo, modalidad, fechaInicio, fechaFin,Duracion);
							//Paso 4
							if(gestionPeriodo.Modificar(posicionPeriodo, PeriodoModificado)) {
								System.out.println("Periodo modificada correctamente");
							}else {
								System.out.println("Error al modificar Periodo");
							}
						}
						
						break;
					case 3: //Eliminar
						/*Pasos
						 * 1. Solicitar el numero del Periodo a eliminar 
						 * 2. Buscar el numero de Periodo a eliminar
						 * 3. Si lo encuentra, eliminar Periodo en la gesti�n
						 * 
						 */
						
						//Paso 1:
						int noPeriodoEliminar, posicionPeriodoEliminar;
						System.out.println("Eliminar Periodo");
						System.out.println("Ingrese el número del Periodo a eliminar:");
						noPeriodoEliminar=sc.nextInt();
						
						//Paso 2
						posicionPeriodoEliminar=gestionPeriodo.BuscarPeriodo(noPeriodoEliminar);
						
						
						//Paso 3
						if(posicionPeriodoEliminar==-1) {
							System.out.println("No puede eliminar el Periodo : el periodo existe");
						}else {
							
							if(gestionPeriodo.Eliminar(posicionPeriodoEliminar)) {
								System.out.println("Periodo eliminado correctamente");
							}else {
								System.out.println("Error al eliminar Periodo");
							}
							
						}
						break;
					case 4:  //Buscar
						//Paso 1:
						int noPeriodoBuscar, posicionPeriodoBuscar;
						System.out.println("Buscar Periodo");
						System.out.println("Ingrese el número del Periodo a buscar:");
						noPeriodoBuscar=sc.nextInt();
						
						posicionPeriodoBuscar=gestionPeriodo.BuscarPeriodo(noPeriodoBuscar);
						
						if(posicionPeriodoBuscar==-1) {
							System.out.println("El Periodo no existe");
						}else {
							Periodo PeriodoEncontrado= gestionPeriodo.getElementoPorPosicion(posicionPeriodoBuscar);
							System.out.println(PeriodoEncontrado);
						}
						break;
					case 5: //Imprimir todos
						gestionPeriodo.ImprimirTodos();
						break;
					case 6: //Salir gesti�n carrera
						centinelaPeriodo=false;
						break;
					}
				}
				
				break;
				
				case 2: //Gesti�n de carrera de estudio
					centinelaCarreraDeEstudio=true;
					while(centinelaCarreraDeEstudio) {
						System.out.println("Gestión Carrera De Estudio");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionCarrera=sc.nextInt();
						
						switch(opcionCarrera) {
						case 1:  //Agregar
							/*Pasos
							1. Solicitar los valores al usuario almacenandolos en variables
							2. Crear la instancia del nuevo objeto (carrera)
							3. Agregar esta instancia a la gesti�n
							*/
							//Paso 1:
							System.out.println("Agregar Carrera");
							System.out.println("Ingrese el código:");
							codigoCarrera=sc.nextInt();
							System.out.println("Ingrese la descripción de la carrera:");
							descripcionCarrera=sc2.nextLine();
							
							//Paso 2:
							
							CarreraDeEstudio nuevaCarrera = new CarreraDeEstudio(codigoCarrera, descripcionCarrera);
							
							
							//Paso 3:
							if(gestionCarrera.Agregar(nuevaCarrera)) {
								System.out.println("Carrera registrada correctamente");
							}else {
								System.out.println("Error al registrar carrera");
							}
							
							
							
							break;
						case 2: //Modificar
							/*Pasos
							1. Buscar la carrera a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (carrera)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							int codigoCarreraModificar, posicionCarrera;
							System.out.println("Modificar Carrera");
							System.out.println("Ingrese el c�digo de la carrera a modificar:");
							codigoCarreraModificar=sc.nextInt();
							
							posicionCarrera=gestionCarrera.BuscarPorCodigo(codigoCarreraModificar);
							
							if(posicionCarrera==-1) {
								System.out.println("El cargo no existe");
							}else {
								CarreraDeEstudio carreraEncontrada= gestionCarrera.getElementoPorPosicion(posicionCarrera);
								System.out.println(carreraEncontrada);
								
								//Paso 2:
								System.out.println("Ingrese el c�digo:");
								codigoCarrera=sc.nextInt();
								System.out.println("Ingrese la descripci�n de la carrera:");
								descripcionCarrera=sc2.nextLine();
								
								//Paso 3:
								CarreraDeEstudio carreraModificada = new CarreraDeEstudio(codigoCarrera, descripcionCarrera);
								
								
								//Paso 4
								if(gestionCarrera.Modificar(posicionCarrera, carreraModificada)) {
									System.out.println("Carrera modificada correctamente");
								}else {
									System.out.println("Error al modificar carrera");
								}
							}
							
							break;
						case 3: //Eliminar
							/*Pasos
							 * 1. Solicitar el codigo de la carrera a eliminar 
							 * 2. Buscar el c�digo de carrera a eliminar
							 * 3. Si lo encuentra, eliminar  carrera en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int codigoCarreraEliminar, posicionCarreraEliminar;
							System.out.println("Eliminar Carrera");
							System.out.println("Ingrese el c�digo de la carrera a eliminar:");
							codigoCarreraEliminar=sc.nextInt();
							
							//Paso 2
							posicionCarreraEliminar=gestionCarrera.BuscarPorCodigo(codigoCarreraEliminar);
							
							
							//Paso 3
							if(posicionCarreraEliminar==-1) {
								System.out.println("No puede eliminar la carrera de estudio: el cargo no existe");
							}else {
								
								if(gestionCarrera.Eliminar(posicionCarreraEliminar)) {
									System.out.println("Carrera eliminado correctamente");
								}else {
									System.out.println("Error al eliminar carrera");
								}
								
							}
							break;
						case 4:  //Buscar
							//Paso 1:
							int codigoCarreraBuscar, posicionCarreraBuscar;
							System.out.println("Buscar Carrera");
							System.out.println("Ingrese el c�digo de la carrera a buscar:");
							codigoCarreraBuscar=sc.nextInt();
							
							posicionCarreraBuscar=gestionCarrera.BuscarPorCodigo(codigoCarreraBuscar);
							
							if(posicionCarreraBuscar==-1) {
								System.out.println("La carrera no existe");
							}else {
								CarreraDeEstudio carreraEncontrada= gestionCarrera.getElementoPorPosicion(posicionCarreraBuscar);
								System.out.println(carreraEncontrada);
							}
							break;
						case 5: //Imprimir todos
							gestionCarrera.ImprimirTodos();
							break;
						case 6: //Salir gesti�n carrera
							centinelaCarreraDeEstudio=false;
							break;
						}
					}
					
					break;
				case 3: //Gesti�n de Estudiante
					centinelaEstudiante=true;
					while(centinelaEstudiante) {
						System.out.println("Gesti�n de Estudiante");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos los estudiantes");
						System.out.println("6- Salir");
						opcionEstudiante=sc.nextInt();
						switch(opcionEstudiante) {
						case 1: //Agregar Estudiante
							/*Pasos
							1. Solicitar los valores al usuario y almacenarlos en variables
							2. Crear la instancia del nuevo objeto (Estudiante)
							3. Agregar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							System.out.print("N�mero de Estudiante: ");
							numeroCuenta=sc3.nextLine();
							System.out.println("Nombres:");
							nombres=sc3.nextLine();
							System.out.println("Apellidos:");
							apellidos=sc3.nextLine();
							System.out.println("Correo Electr�nico:");
							correo=sc3.nextLine();
							System.out.println("Tel�fono:");
							telefono=sc3.nextLine();
							System.out.println("Direcci�n:");
							direccion=sc3.nextLine();
							
							
							
							//Selecci�n de carrera
							System.out.println("Seleccione el c�digo carrera:");
							gestionCarrera.ImprimirTodos();
							codigoCarrera=sc.nextInt();
							CarreraDeEstudio carreraSeleccionada=null;
							int posicionCarreraSeleccionada=gestionCarrera.BuscarPorCodigo(codigoCarrera);
							
							if(posicionCarreraSeleccionada==-1) {
								System.out.println("Carrera incorrecta");
							}else {
								carreraSeleccionada=gestionCarrera.getElementoPorPosicion(posicionCarreraSeleccionada);
							}
			
							//Paso 2
							Estudiante est1=new Estudiante(); 
							est1.set_numeroCuenta(numeroCuenta);
							est1.set_Nombres(nombres);
							est1.set_Apellidos(apellidos);
							est1.set_Correo(correo);
							est1.set_Telefono(telefono);
							est1.set_Direccion(direccion);
							est1.set_carreraDeEstudio(carreraSeleccionada);
							
							//Paso 3
							
							if(gestionEstudiante.Agregar(est1)) {
								System.out.println("Estudiante agreado correctamente");
							}else {
								System.out.println("Error al agregar Estudiante");
							}
							
							break;
						case 2:  //Modificando Estudiante
							/*Pasos
							1. Buscar el Estudiante a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (Estudiante)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							System.out.println("Modificar Estudiante");
							System.out.println("Ingrese el n�mero de cuenta del Estudiante a modificar: ");
							String numeroEstudianteModificar=sc2.nextLine();
							int posicionModificar=gestionEstudiante.BuscarPorNumero(numeroEstudianteModificar);
							if(posicionModificar==-1) {
								System.out.println("El Estudiante no existe");
							}else {
								Estudiante EstudianteEncontrado=gestionEstudiante.getElementoPorPosicion(posicionModificar);
								System.out.println(EstudianteEncontrado);
								
								
								System.out.print("N�mero de cuenta de estudiante: ");
								numeroCuenta=sc3.nextLine();
								System.out.println("Nombres:");
								nombres=sc3.nextLine();
								System.out.println("Apellidos:");
								apellidos=sc3.nextLine();
								System.out.println("Correo Electr�nico:");
								correo=sc3.nextLine();
								System.out.println("Tel�fono:");
								telefono=sc3.nextLine();
								System.out.println("Direcci�n:");
								direccion=sc3.nextLine();
								
								//Selecci�n de carrera
								System.out.println("Seleccione el c�digo carrera:");
								gestionCarrera.ImprimirTodos();
								codigoCarrera=sc.nextInt();
								CarreraDeEstudio carreraSeleccionadaModificar=null;
								int posicionCarreraSeleccionadaModificar=gestionCarrera.BuscarPorCodigo(codigoCarrera);
								
								if(posicionCarreraSeleccionadaModificar==-1) {
									System.out.println("Carrera incorrecta");
								}else {
									carreraSeleccionadaModificar=gestionCarrera.getElementoPorPosicion(posicionCarreraSeleccionadaModificar);
								}
								
								//Paso 3
								Estudiante est1Modificado=new Estudiante(); 
								est1Modificado.set_numeroCuenta(numeroCuenta);
								est1Modificado.set_Nombres(nombres);
								est1Modificado.set_Apellidos(apellidos);
								est1Modificado.set_Direccion(direccion);
								est1Modificado.set_Correo(correo);
								est1Modificado.set_Telefono(telefono);
								est1Modificado.set_carreraDeEstudio(carreraSeleccionadaModificar);
								
								
								//Paso 4
								if(gestionEstudiante.Modificar(posicionModificar, est1Modificado)) {
									System.out.println("Estudiante modificado satisfactormente");
								}else {
									System.out.println("Error al modificar Estudiante");
								}
								
							}
							
							
							break;
						case 3:  //Eliminar Estudiante
							/*Pasos
							 * 1. Solicitar el codigo de Estudiante a eliminar 
							 * 2. Buscar el c�digo del Estudiante a eliminar
							 * 3. Si lo encuentra, eliminar el Estudiante en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int posicionEstEliminar;
							String numeroEstudianteEliminar;
							System.out.println("Eliminar Estudiante");
							System.out.println("Ingrese el n�mero de cuenta del estudiante a eliminar:");
							numeroEstudianteEliminar=sc2.nextLine();
							
							//Paso 2
							posicionEstEliminar=gestionEstudiante.BuscarPorNumero(numeroEstudianteEliminar);
							
							
							//Paso 3
							if(posicionEstEliminar==-1) {
								System.out.println("No puede eliminar el Estudiante: el Estudiante no existe");
							}else {
								
								if(gestionEstudiante.Eliminar(posicionEstEliminar)) {
									System.out.println("Estudiante eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Estudiante");
								}
								
							}
							break;
						case 4: //Buscar Estudiante
							
							/*Pasos
							1. Buscar el Estudiante (b�squeda por n�mero)
							2. Obtener el objeto y mostrar
							*/
							
							System.out.println("Buscar Estudiante");
							System.out.println("Ingrese el n�mero de Estudiante(cuenta): ");
							String numeroEstudianteBuscar=sc2.nextLine();
							int posicionBuscar=gestionEstudiante.BuscarPorNumero(numeroEstudianteBuscar);
							if(posicionBuscar==-1) {
								System.out.println("El Estudiante no existe");
							}else {
								Estudiante EstudianteEncontrado=gestionEstudiante.getElementoPorPosicion(posicionBuscar);
								System.out.println(EstudianteEncontrado);
							}
							break;
						case 5: //Imprimir todos
							gestionEstudiante.imprimirTodos();
	 						break;
						case 6: //Salir
							centinelaEstudiante=false;
							break;
						default:
							System.out.println("Opci�n incorrecta");
							break;
						}
					}
					
					break;
					
			
				
					
					
				case 4: //Gesti�n de Profesor
					centinelaProfesor=true;
					while(centinelaProfesor) {
						System.out.println("Gesti�n de Profesor");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionProfesor=sc.nextInt();
						
						switch(opcionProfesor) {
				case 1:  //Agregar
			//		Pasos
			//		1. Solicitar los valores al usuario almacenandolos en variables
			//		2. Crear la instancia del nuevo objeto (Profesor)
			//		3. Agregar esta instancia a la gesti�n
					
					//Paso 1:
				System.out.println("Agregar Profesor");
					System.out.println("Ingrese el n�mero de empleado(profesor):");
					noProfesor=sc.nextInt();
					System.out.println("Ingrese nombres del Profesor:");
					nombresp=sc2.nextLine();
					System.out.println("Ingrese apellidos del Profesor:");
					apellidosp=sc2.nextLine();
					System.out.println("Ingrese correo del Profesor:");
					correo=sc2.nextLine();
					System.out.println("Ingrese tel�fono del Profesor:");
					telefono=sc2.nextLine();
					System.out.println("Ingrese la direcci�n del Profesor:");
					direccion=sc2.nextLine();     
					//Paso 2:
					
					Profesor nuevoProfesor = new Profesor(nombresp,apellidosp,correo,telefono,direccion,noProfesor);
				
					
					
					
					//Paso 3:
					if(gestionProfesor.Agregar(nuevoProfesor)) {
						System.out.println("Profesor registrado correctamente");
					}else {
						System.out.println("Error al registrar Profesor");
					}
					
					
					
					break;
				case 2: //Modificar
					/*Pasos
					1. Buscar el Profesor a modificar (b�squeda por c�digo)
					2. Solicitar los nuevos valores al usuario y almacenarlos en variables
					3. Crear la instancia del nuevo objeto (Profesor)
					4. Reemplazar esta instancia a la gesti�n
					*/
					
					//Paso 1:
					int noProfesorModificar, posicionProfesor;
					System.out.println("Modificar Profesor");
					System.out.println("Ingrese el n�mero del Profesor(no.Empleado) a modificar:");
					noProfesorModificar=sc.nextInt();
					
					posicionProfesor=gestionProfesor.BuscarPorCodigo(noProfesorModificar);
					
					if(posicionProfesor==-1) {
						System.out.println("El Profesor no existe");
					}else {
						Profesor ProfesorEncontrado= gestionProfesor.getElementoPorPosicion(posicionProfesor);
						System.out.println(ProfesorEncontrado);
						
						//Paso 2:
						
						System.out.println("Ingrese el n�mero de empleado(profesor):");
						noProfesor=sc.nextInt();
						System.out.println("Ingrese nombres del Profesor:");
						nombresp=sc2.nextLine();
						System.out.println("Ingrese apellidos del Profesor:");
						apellidosp=sc2.nextLine();
						System.out.println("Ingrese correo del Profesor:");
						correo=sc2.nextLine();
						System.out.println("Ingrese tel�fono del Profesor:");
						telefono=sc2.nextLine();
						System.out.println("Ingrese la direcci�n del Profesor:");
						direccion=sc2.nextLine();
						
						//Paso 3:
						Profesor ProfesorModificado = new Profesor(nombresp, apellidosp, correo, telefono,direccion,noProfesor);
				
						
						//Paso 4
						if(gestionProfesor.Modificar(posicionProfesor, ProfesorModificado)) {
							System.out.println("Profesor modificado correctamente");
						}else {
							System.out.println("Error al modificar Profesor");
						}
					}
					
					break;
				case 3: //Eliminar
					/*Pasos
					 * 1. Solicitar el numero del Profesor a eliminar 
					 * 2. Buscar el numero del Profesor a eliminar
					 * 3. Si lo encuentra, eliminar Periodo en la gesti�n
					 * 
					 */
					
					//Paso 1:
					int noProfesorEliminar, posicionProfesorEliminar;
					System.out.println("Eliminar Profesor");
					System.out.println("Ingrese el n�mero del Profesor a eliminar:");
					noProfesorEliminar=sc.nextInt();
					
					//Paso 2
					posicionProfesorEliminar=gestionPeriodo.BuscarPeriodo(noProfesorEliminar);
					
					
					//Paso 3
					if(posicionProfesorEliminar==-1) {
						System.out.println("No puede eliminar el Profesor : el Profesor existe");
					}else {
						
						if(gestionProfesor.Eliminar(posicionProfesorEliminar)) {
							System.out.println("Profesor eliminado correctamente");
						}else {
							System.out.println("Error al eliminar Profesor");
						}
						
					}
					break;
				case 4:  //Buscar
					//Paso 1:
					int noProfesorBuscar, posicionProfesorBuscar;
					System.out.println("Buscar Profesor");
					System.out.println("Ingrese el n�mero del Profesor a buscar:");
					noProfesorBuscar=sc.nextInt();
					
					posicionProfesorBuscar=gestionProfesor.BuscarPorCodigo(noProfesorBuscar);
					
					if(posicionProfesorBuscar==-1) {
						System.out.println("El Profesor no existe");
					}else {
						Profesor ProfesorEncontrado= gestionProfesor.getElementoPorPosicion(posicionProfesorBuscar);
						System.out.println(ProfesorEncontrado);
					}
					break;
				case 5: //Imprimir todos
					gestionProfesor.ImprimirTodos();
					break;
				case 6: //Salir
					centinelaProfesor=false;
					break;
				default:
					System.out.println("Opci�n incorrecta");
					break;
				}
			}
					
					break;
				case 5: //Gesti�n Campo
					cicloCampo=true;
					while(cicloCampo) {
						System.out.println("Gesti�n Campo de Estudio");
						System.out.println("1- Agregar");
						System.out.println("2- Buscar");
						System.out.println("3- Eliminar");
						System.out.println("4- Modificar");
						System.out.println("5- Imprimir resultados");
						System.out.println("6- Salir");
						opcionCampo=sc.nextInt();
						
						switch (opcionCampo) {
						case 1: //Agregar
							//Paso 1:
							System.out.println("Agregar Campo de Estudio");
							System.out.println("Ingrese el c�digo del Campo de Estudio:");
							codigoCampo=sc.nextInt();
							System.out.println("Ingrese el campo de estudio que desee:");
							tipoCampo=sc2.nextLine();
							
							//Paso 2:
							CampoEstudio nuevoCampo = new CampoEstudio(tipoCampo, codigoCampo);
							
							//Paso 3:
							if(gestionCampo.Agregar(nuevoCampo)) {
								System.out.println("Campo de Estudio registrado correctamente");
							}else {
								System.out.println("Error al registrar Campo de Estudio");
							}
							
							break;
						case 2: //Buscar
							int codigoCammpoBuscar, posicionCampoBuscar;
							System.out.println("Buscar Campo De Estudio");
							System.out.println("Ingrese el c�digo del campo a buscar:");
							codigoCammpoBuscar=sc.nextInt();
							
							posicionCampoBuscar=gestionCampo.BuscarCampoEstudio(codigoCammpoBuscar);
							
							if(posicionCampoBuscar==-1) {
								System.out.println("El campo no existe");
							}else {
								CampoEstudio campoEncontrado= gestionCampo.getElementoPorPosicion(posicionCampoBuscar);
								System.out.println(campoEncontrado);
							}
							break;
							
						case 3: //Eliminar
							//Paso 1:
							int codigoCampoEliminar, posicionCampoEliminar;
							System.out.println("Eliminar un Campo de Estudio");
							System.out.println("Ingrese el c�digo del Campo a eliminar:");
							codigoCampoEliminar=sc.nextInt();
							
							//Paso 2
							posicionCampoEliminar=gestionCampo.BuscarCampoEstudio(codigoCampoEliminar);
							
							
							//Paso 3
							if(posicionCampoEliminar==-1) {
								System.out.println("No puede eliminar el Campo: el Campo no existe");
							}else {
								
								if(gestionCampo.Eliminar(posicionCampoEliminar)) {
									System.out.println("Cargo eliminado con �xito");
								}else {
									System.out.println("Error al eliminar el Campo");
								}
								
							}
							break;
							
						case 4://modificar
							//Paso 1:
							int codigoCampoModificar, posicionCampoModificar;
							System.out.println("Modificar un Campo de Estudio");
							System.out.println("Ingrese el c�digo del Campo a modificar:");
							codigoCampoModificar=sc.nextInt();
							
							posicionCampoModificar=gestionCampo.BuscarCampoEstudio(codigoCampoModificar);
							
							if(posicionCampoModificar==-1) {
								System.out.println("El campo no existe");
							}else {
								CampoEstudio campoEncontrado= gestionCampo.getElementoPorPosicion(posicionCampoModificar);
								System.out.println(campoEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el c�digo del Campo");
								codigoCampo=sc.nextInt();
								System.out.println("Ingrese el nombre del Campo de Estudio:");
								tipoCampo=sc2.nextLine();
								
								//Paso 3:
								CampoEstudio campoModificado = new CampoEstudio(tipoCampo, codigoCampo);
								
								
								//Paso 4
								if(gestionCampo.Modificar(posicionCampoModificar, campoModificado)) {
									System.out.println("Campo modificado con �xito");
								}else {
									System.out.println("Error al modificar el Campo");
								}
							}
							
							break;
							
						case 5: //Imprimir
							gestionCampo.ImprimirTodos();
							break;
						case 6: //Salir gesti�n cargo
							cicloCampo=false;
							break;
						}
					}
					break;
				case 6: //Gesti�n Asignatura
					cicloAsignatura=true;
					while(cicloAsignatura) {
						System.out.println("Gesti�n de Asignatura");
						System.out.println("1- Agregar");
						System.out.println("2- Buscar");
						System.out.println("3- Eliminar");
						System.out.println("4- Modificar");
						System.out.println("5- Imprimir todas las Asignaturas");
						System.out.println("6- Salir");
						opcionAsignatura=sc.nextInt();
						
						switch(opcionAsignatura) {
						case 1: //Agregar Asignaturas
							System.out.print("Codigo de la Asignatura ");
							codigoAsignatura=sc2.nextLine();
							System.out.print("Nombre de la Asignatura ");
							nombreAsignatura=sc2.nextLine();
							System.out.print("Unidades Valorativas de la Asignatura ");
							UV=sc2.nextInt();
							
							//Selecci�n de campo
							System.out.println("Seleccione el c�digo de campo de estudio:");
							gestionCampo.ImprimirTodos();
							codigoCampo=sc.nextInt();
							CampoEstudio campoSeleccionado=null;
							int posicionCampoSeleccionado=gestionCampo.BuscarCampoEstudio(codigoCampo);
							
							if(posicionCampoSeleccionado==-1) {
								System.out.println("Campo incorrecto");
							}else {
								campoSeleccionado=gestionCampo.getElementoPorPosicion(posicionCampoSeleccionado);
							}
							//Paso 2
							Asignatura lstAsignatura=new Asignatura(); 
							lstAsignatura.set_CodigoAsignatura(codigoAsignatura);
							lstAsignatura.set_NombreAsignatura(nombreAsignatura);
							lstAsignatura.set_UV(UV);
							lstAsignatura.set_Campo(campoSeleccionado); 
							
							//Paso 3
							
							if(gestionAsignatura.Agregar(lstAsignatura)) {
								System.out.println("Asignatura agreada con �xito");
							}else {
								System.out.println("Error al agregar Asignatura");
							}
							
							break;
						case 2://Buscar Asignatura
							System.out.println("Buscar Asignatura");
							System.out.println("Ingrese el c�digo de la Asignatura ");
							String numeroAsignaturaBuscar=sc2.nextLine();
							int posicionBuscar=gestionAsignatura.BuscarAsignatura(numeroAsignaturaBuscar);
							if(posicionBuscar==-1) {
								System.out.println("La Asignatura no existe");
							}else {
								Asignatura asignaturaEncontrada=gestionAsignatura.getElementoPorPosicion(posicionBuscar);
								System.out.println(asignaturaEncontrada);
							}
							break;
						case 3: //eliminar Asignatura
							//Paso 1:
							int posicionAsignaturaEliminar;
							String codigoAsignaturaEliminar;
							System.out.println("Eliminar Asinatura");
							System.out.println("Ingrese el c�digo de la Asignatura a eliminar:");
							codigoAsignaturaEliminar=sc2.nextLine();
							
							//Paso 2
							posicionAsignaturaEliminar=gestionAsignatura.BuscarAsignatura(codigoAsignaturaEliminar);
							
							
							//Paso 3
							if(posicionAsignaturaEliminar==-1) {//No lo encontr�
								System.out.println("No puede eliminar la Asignatura: la Asignatura no existe");
							}else {
								
								if(gestionAsignatura.Eliminar(posicionAsignaturaEliminar)) {
									System.out.println("Asignatura eliminada con �xito");
								}else {
									System.out.println("Error al eliminar Asignatura");
								}
								
							}
							break;
						case 4: //modificar Asignatura
							//Paso 1
							System.out.println("Modificar Asignatura");
							System.out.println("Ingrese el c�digo de la Asignatura a modificar: ");
							String codigoAsignaturaModificar=sc2.nextLine();
							int posicionModificar=gestionAsignatura.BuscarAsignatura(codigoAsignaturaModificar);
							if(posicionModificar==-1) {
								System.out.println("La Asignatura no existe");
							}else {
								Asignatura asignaturaEncontrada=gestionAsignatura.getElementoPorPosicion(posicionModificar);
								System.out.println(asignaturaEncontrada);
								
								//Paso 2
								System.out.print("C�digo de la Asignatura ");
								codigoAsignatura=sc2.nextLine();
								System.out.println("Nombre de la Asignatura");
								nombreAsignatura=sc2.nextLine();
								System.out.println("Unidades Valorativas:");
								UV=sc2.nextInt();
								
					
								//Selecci�n del campo
								System.out.println("Seleccione el c�digo del campo:");
								gestionCampo.ImprimirTodos();
								codigoCampo=sc.nextInt();
								CampoEstudio campoSeleccionadoModificado=null;
								int posicionCampoSelecModificado=gestionCampo.BuscarCampoEstudio(codigoCampo);
								
								if(posicionCampoSelecModificado==-1) {
									System.out.println("Campo incorrecto");
								}else {
									campoSeleccionadoModificado=gestionCampo.getElementoPorPosicion(posicionCampoSelecModificado);
								}
								
								//Paso 3
								Asignatura lstAsignaturaMod=new Asignatura(); 
								lstAsignaturaMod.set_CodigoAsignatura(codigoAsignatura);
								lstAsignaturaMod.set_NombreAsignatura(nombreAsignatura);
								lstAsignaturaMod.set_UV(UV);
								lstAsignaturaMod.set_Campo(campoSeleccionadoModificado);
								
								
								//Paso 4
								if(gestionAsignatura.Modificar(lstAsignaturaMod,posicionModificar)) {
									System.out.println("Asignatura modificada satisfactormente");
								}else {
									System.out.println("Error al modificar Asignatura");
								}
								
							}
							
							
							break;
						case 5: //Imprimir
							gestionAsignatura.ImprimirTodos();
	 						break;
						case 6: //Salir
							cicloAsignatura=false;
							break;
						
						}
					}
					break;
				case 7: //Gesti�n Edificio
					cicloEdificio=true;
					while(cicloEdificio) {
						System.out.println("Gesti�n Edificio");
						System.out.println("1- Agregar");
						System.out.println("2- Buscar");
						System.out.println("3- Eliminar");
						System.out.println("4- Modificar");
						System.out.println("5- Imprimir resultados");
						System.out.println("6- Salir");
						opcionEdificio=sc4.nextInt();
						
						switch (opcionEdificio) {
						case 1: //Agregar
							//Paso 1:
							System.out.println("Agregar Edificio");
							System.out.println("Ingrese el n�mero del Edificio:");
							numeroEdificio=sc4.nextInt();
							System.out.println("Ingrese el n�mero del de pisos del edificio:");
							numPisos=sc.nextInt();
							System.out.println("Ingrese el nombre del Edificio:");
							nombreEdificio=sc8.nextLine();
							
							//Paso 2:
							Edificio nuevoEdificio = new Edificio(nombreEdificio, numeroEdificio,numPisos);
							
							//Paso 3:
							if(gestionEdificio.Agregar(nuevoEdificio)) {
								System.out.println("Edificio registrado correctamente");
							}else {
								System.out.println("Error al registrar Edificio");
							}
							
							break;
						case 2: //Buscar Edificio
							int codigoEdificioBuscar, posicionEdificioBuscar;
							System.out.println("Buscar Edificio");
							System.out.println("Ingrese el n�mero de Edificio a buscar:");
							codigoEdificioBuscar=sc4.nextInt();
							
							posicionEdificioBuscar=gestionEdificio.BuscarEdificio(codigoEdificioBuscar);
							
							if(posicionEdificioBuscar==-1) {
								System.out.println("El Edificio no existe");
							}else {
								Edificio edificioEncontrado= gestionEdificio.getElementoPorPosicion(posicionEdificioBuscar);
								System.out.println(edificioEncontrado);
							}
							break;
							
						case 3: //Eliminar
							//Paso 1:
							int codigoEdificioEliminar, posicionEdificioEliminar;
							System.out.println("Eliminar un Edificio");
							System.out.println("Ingrese el n�mero de Edificio a eliminar:");
							codigoEdificioEliminar=sc4.nextInt();
							
							//Paso 2
							posicionEdificioEliminar=gestionEdificio.BuscarEdificio(codigoEdificioEliminar);
							
							
							//Paso 3
							if(posicionEdificioEliminar==-1) {
								System.out.println("No puede eliminar el Edificio: el Edificio no existe");
							}else {
								
								if(gestionEdificio.Eliminar(posicionEdificioEliminar)) {
									System.out.println("Edificio eliminado con �xito");
								}else {
									System.out.println("Error al eliminar el Edificio");
								}
								
							}
							break;
							
						case 4://modificar
							//Paso 1:
							int codigoEdificioModificar, posicionEdificioModificar;
							System.out.println("Modificar un Edificio");
							System.out.println("Ingrese el n�mero de Edificio a modificar:");
							codigoEdificioModificar=sc4.nextInt();
							
							posicionEdificioModificar=gestionEdificio.BuscarEdificio(codigoEdificioModificar);
							
							if(posicionEdificioModificar==-1) {
								System.out.println("El edicio no existe");
							}else {
								Edificio edificioEncontrado= gestionEdificio.getElementoPorPosicion(posicionEdificioModificar);
								System.out.println(edificioEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el n�mero de edificio");
								numeroEdificio=sc.nextInt();
								System.out.println("Ingrese el nombre del Edificio:");
								nombreEdificio=sc2.nextLine();
								System.out.println("Ingrese el n�mero de pisos del Edificio:");
								numPisos=sc4.nextInt();
								
								//Paso 3:
								Edificio edificioModificado = new Edificio(nombreEdificio, numeroEdificio,numPisos);
								
								
								//Paso 4
								if(gestionEdificio.Modificar(posicionEdificioModificar, edificioModificado)) {
									System.out.println("Edificio modificado con �xito");
								}else {
									System.out.println("Error al modificar el Edificio");
								}
							}
							
							break;
							
						case 5: //Imprimir
							gestionEdificio.ImprimirTodos();
							break;
						case 6: //Salir gesti�n cargo
							cicloEdificio=false;
							break;
						}
					}
					break;
				case 8: //Gesti�n Aula
					cicloAula=true;
					while(cicloAula) {
						System.out.println("Gesti�n de Aula");
						System.out.println("1- Agregar");
						System.out.println("2- Buscar");
						System.out.println("3- Eliminar");
						System.out.println("4- Modificar");
						System.out.println("5- Imprimir todas las Aulas");
						System.out.println("6- Salir");
						opcionAula=sc.nextInt();
						
						switch(opcionAula) {
						case 1: //Agregar Aulas
							System.out.println("c�digo del aula");
							NoAula=sc5.nextInt();
							System.out.println("Piso donde se encuentra el aula ");
							nivel=sc7.nextLine();
						
							
							//Selecci�n de edificio
							System.out.println("Seleccione el c�digo del edificio:");
							gestionEdificio.ImprimirTodos();
							numeroEdificio=sc.nextInt();
							Edificio edificioSeleccionado=null;
							int posicionEdificioSeleccionado=gestionEdificio.BuscarEdificio(numeroEdificio);
							
							if(posicionEdificioSeleccionado==-1) {
								System.out.println("Edificio incorrecto");
							}else {
								edificioSeleccionado=gestionEdificio.getElementoPorPosicion(posicionEdificioSeleccionado);
							}
							//Paso 2
							Aula listaAula=new Aula(); 
							listaAula.set_NoAula(NoAula);
							listaAula.set_Nivel(nivel);
							listaAula.set_Edificio(edificioSeleccionado); 
							
							//Paso 3
							
							if(gestionAula.Agregar(listaAula)) {
								System.out.println("Aula agreada con �xito");
							}else {
								System.out.println("Error al agregar Aula");
							}
							
							break;
						case 2://Buscar Aula
							System.out.println("Buscar Aula");
							System.out.println("Ingrese el n�mero de Aula ");
							int numeroAulaBuscar=sc2.nextInt();
							int posicionBuscar=gestionAula.BuscarPorCodigo(numeroAulaBuscar);
							if(posicionBuscar==-1) {
								System.out.println("El aula no existe");
							}else {
								Aula aulaEncontrada=gestionAula.getElementoPorPosicion(posicionBuscar);
								System.out.println(aulaEncontrada);
							}
							break;
						case 3: //eliminar Asignatura
							//Paso 1:
							int posicionAulaEliminar;
							int numeroAulaElimnar;
							System.out.println("Eliminar Aula");
							System.out.println("Ingrese el n�mero de Aula a eliminar:");
							numeroAulaElimnar=sc2.nextInt();
							
							//Paso 2
							posicionAulaEliminar=gestionAula.BuscarPorCodigo(numeroAulaElimnar);
							
							
							//Paso 3
							if(posicionAulaEliminar==-1) {//No lo encontr�
								System.out.println("No puede eliminar el AULA: El Aula no existe");
							}else {
								
								if(gestionAula.Eliminar(posicionAulaEliminar)) {
									System.out.println("Aula eliminada con �xito");
								}else {
									System.out.println("Error al eliminar Aula");
								}
								
							}
							break;
						case 4: //modificar Aula
							//Paso 1
							System.out.println("Modificar Aula");
							System.out.println("Ingrese el numero de  Aula a modificar: ");
							int numeroAulaModificar=sc2.nextInt();
							int posicionModificar=gestionAula.BuscarPorCodigo(numeroAulaModificar);
							if(posicionModificar==-1) {
								System.out.println("El aula no existe");
							}else {
								Aula aulaEncontrada=gestionAula.getElementoPorPosicion(posicionModificar);
								System.out.println(aulaEncontrada);
								
								//Paso 2
								System.out.print("c�digo del aula");
								NoAula=sc2.nextInt();
								System.out.print("Piso donde se encuentra el aula ");
								nivel=sc2.nextLine();
								
					
								//Selecci�n del edificio
								System.out.println("Seleccione el numero de edificio:");
								gestionEdificio.ImprimirTodos();
								numeroEdificio=sc.nextInt();
								Edificio edificioSeleccionadoModificado=null;
								int posicionEdificioSelecModificado=gestionEdificio.BuscarEdificio(numeroEdificio);
								
								if(posicionEdificioSelecModificado==-1) {
									System.out.println("Edificio incorrecto");
								}else {
									edificioSeleccionadoModificado=gestionEdificio.getElementoPorPosicion(posicionEdificioSelecModificado);
								}
								
								//Paso 3
								Aula listaAulaModificada=new Aula(); 
								listaAulaModificada.set_NoAula(NoAula);
								listaAulaModificada.set_Nivel(nivel);
								listaAulaModificada.set_Edificio(edificioSeleccionadoModificado);
								
								
								//Paso 4
								if(gestionAula.Modificar(posicionModificar,listaAulaModificada)) {
									System.out.println("AULA modificada satisfactormente");
								}else {
									System.out.println("Error al modificar AULA");
								}
								
							}
							
							
							break;
						case 5: //Imprimir
							gestionAula.ImprimirTodos();
	 						break;
						case 6: //Salir
							cicloAula=false;
							break;
						
						}
					}
					break;
					
				case 9: //Gesti�n de Horario
					centinelaHorario=true;
					while(centinelaHorario) {
						System.out.println("Gesti�n de Horario");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionHorario=sc.nextInt();
						
						switch(opcionHorario) {
						case 1:  //Agregar
							/*Pasos
							1. Solicitar los valores al usuario almacenandolos en variables
							2. Crear la instancia del nuevo objeto (Horario)
							3. Agregar esta instancia a la gesti�n
							*/
							//Paso 1:
							System.out.println("Agregar Horario");
							System.out.println("Ingrese el c�digo de Horario:");
							codigoHorario=sc.nextInt();
							System.out.println("Ingrese la hora de inicio:");
							horaInicio=sc9.nextLine();
							System.out.println("Ingrese la hora final:");
							horaFin=sc9.nextLine();
							
							
							//Paso 2:
							
							Horario nuevoHorario = new Horario(codigoHorario, horaInicio, horaFin);
							
							
							//Paso 3:
							if(gestionHorario.Agregar(nuevoHorario)) {
								System.out.println("Horario registrado correctamente");
							}else {
								System.out.println("Error al registrar Horario");
							}
							
							
							
							break;
						case 2: //Modificar
							/*Pasos
							1. Buscar el Horario a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (Horario)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							int noHorarioModificar, posicionHorario;
							System.out.println("Modificar Horario");
							System.out.println("Ingrese el c�digo del Horario a modificar:");
							noHorarioModificar=sc.nextInt();
							
							posicionHorario=gestionHorario.BuscarPorCodigo(noHorarioModificar);
							
							if(posicionHorario==-1) {
								System.out.println("El Horario no existe");
							}else {
								Horario HorarioEncontrado= gestionHorario.getElementoPorPosicion(posicionHorario);
								System.out.println(HorarioEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el codigo de Horario:");
								codigoHorario=sc.nextInt();
								System.out.println("Ingrese la hora de inicio:");
								horaInicio=sc9.nextLine();
								System.out.println("Ingrese la hora final:");
								horaFin=sc9.nextLine();
								
								//Paso 3:
								Horario HorarioModificado = new Horario(codigoHorario, horaInicio,horaFin);
								
								
								//Paso 4
								if(gestionHorario.Modificar(posicionHorario, HorarioModificado)) {
									System.out.println("Horario modificado correctamente");
								}else {
									System.out.println("Error al modificar Periodo");
								}
							}
							
							break;
						case 3: //Eliminar
							/*Pasos
							 * 1. Solicitar el codigo del Horario a eliminar 
							 * 2. Buscar el codigo de Horario a eliminar
							 * 3. Si lo encuentra, eliminar Horario en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int noHorarioEliminar, posicionHorarioEliminar;
							System.out.println("Eliminar Horario");
							System.out.println("Ingrese el c�digo del Horario a eliminar:");
							noHorarioEliminar=sc.nextInt();
							
							//Paso 2
							posicionHorarioEliminar=gestionHorario.BuscarPorCodigo(noHorarioEliminar);
							
							
							//Paso 3
							if(posicionHorarioEliminar==-1) {
								System.out.println("No puede eliminar el Horario : el Horario existe");
							}else {
								
								if(gestionHorario.Eliminar(posicionHorarioEliminar)) {
									System.out.println("Horario eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Horario");
								}
								
							}
							break;
						case 4:  //Buscar
							//Paso 1:
							int noHorarioBuscar, posicionHorarioBuscar;
							System.out.println("Buscar Horario");
							System.out.println("Ingrese el c�digo del Horario a buscar:");
							noHorarioBuscar=sc.nextInt();
							
							posicionHorarioBuscar=gestionHorario.BuscarPorCodigo(noHorarioBuscar);
							
							if(posicionHorarioBuscar==-1) {
								System.out.println("El Horario no existe");
							}else {
								Horario HorarioEncontrado= gestionHorario.getElementoPorPosicion(posicionHorarioBuscar);
								System.out.println(HorarioEncontrado);
							}
							break;
						case 5: //Imprimir todos
							gestionHorario.ImprimirTodos();
							break;
						case 6: //Salir gesti�n Horario
							centinelaHorario=false;
							break;
						}
					}
					
					break;
				case 10: //Gesti�n de Seccion
					centinelaSeccion=true;
					while(centinelaSeccion) {
						System.out.println("Gesti�n de Seccion Clase");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos ");
						System.out.println("6- Salir");
						opcionSeccion=sc5.nextInt();
						switch(opcionSeccion) {
						case 1: //Agregar Seccion
							/*Pasos
							1. Solicitar los valores al usuario y almacenarlos en variables
							2. Crear la instancia del nuevo objeto (Seccion)
							3. Agregar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							System.out.println("C�digo de secci�n: ");
							codigoSeccion=sc5.nextInt();
							System.out.println("D�as:");
							dias=sc7.nextLine();
							
							
							//Selecci�n de Asignatura
							System.out.println("Seleccione el c�digo de asignatura:");
							gestionAsignatura.ImprimirTodos();
							codigoAsignatura=sc6.nextLine();
							Asignatura AsignaturaSeleccionada=null;
							int posicionAsignaturaSeleccionada=gestionAsignatura.BuscarAsignatura(codigoAsignatura);
							if(posicionAsignaturaSeleccionada==-1) {
								System.out.println("Asignatura incorrecta");
							}else {
								AsignaturaSeleccionada=gestionAsignatura.getElementoPorPosicion(posicionAsignaturaSeleccionada);
							}
							
							//Selecci�n de Profesor
							System.out.println("Seleccione el n�mero de empleado(profesor):");
							gestionProfesor.ImprimirTodos();
							noProfesor=sc6.nextInt();
							Profesor ProfesorSeleccionado=null;
							int posicionProfesorSeleccionado=gestionProfesor.BuscarPorCodigo(noProfesor);
							if(posicionProfesorSeleccionado==-1) {
								System.out.println("Profesor incorrecto");
							}else {
								ProfesorSeleccionado=gestionProfesor.getElementoPorPosicion(posicionProfesorSeleccionado);
							}
							
							
							//seleccion de aula
							System.out.println("Seleccione el n�mero de Aula:");
							gestionAula.ImprimirTodos();
							NoAula=sc6.nextInt();
							Aula AulaSeleccionada=null;
							int posicionAulaSeleccionada=gestionAula.BuscarPorCodigo(NoAula);
							if(posicionAulaSeleccionada==-1) {
								System.out.println("Aula incorrecta");
							}else {
								AulaSeleccionada=gestionAula.getElementoPorPosicion(posicionAulaSeleccionada);
							}
				
				
						    //Selecci�n de Horario
							System.out.println("Seleccione el c�digo de Horario:");
							gestionHorario.ImprimirTodos();
							codigoHorario=sc6.nextInt();
							Horario HorarioSeleccionado=null;
							int posicionHorarioSeleccionado=gestionHorario.BuscarPorCodigo(codigoHorario);
							if(posicionHorarioSeleccionado==-1) {
								System.out.println("Horario incorrecto");
							}else {
								HorarioSeleccionado=gestionHorario.getElementoPorPosicion(posicionHorarioSeleccionado);
							}
							
						
							
							SeccionClase Seccion1=new SeccionClase(); 
							Seccion1.set_Codigo(codigoSeccion);
							Seccion1.set_Asignatura(AsignaturaSeleccionada);
							Seccion1.set_Profesor(ProfesorSeleccionado);
							Seccion1.set_Aula(AulaSeleccionada);
							Seccion1.set_Dias(dias);
							Seccion1.set_Horario(HorarioSeleccionado);
							
							System.out.println(" ");
							//Paso 3
							
							if(gestionSeccion.Agregar(Seccion1)) {
								System.out.println("Seccion-Clase agregada correctamente");
							}else {
								System.out.println("Error al agregar Seccion");
							}
							
							break;
						case 2:  //Modificando 	Seccion
							/*Pasos
							1. Buscar la seccion a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (seccion)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//ojo aqui en el int numeroseccion antes era string
							System.out.println("Modificar Secci�n-Clase");
							System.out.println("Ingrese el c�digo de Secci�n a modificar: ");
							int numeroSeccionModificar=sc2.nextInt();
							int posicionModificar=gestionSeccion.BuscarPorCodigo(numeroSeccionModificar);
							if(posicionModificar==-1) {
								System.out.println("La secci�n no existe");
							}else {
								SeccionClase SeccionEncontrada=gestionSeccion.getElementoPorPosicion(posicionModificar);
								System.out.println(SeccionEncontrada);
								
								
							
								
								
								
								
								System.out.println("C�digo de secci�n: ");
								codigoSeccion=sc5.nextInt();
								System.out.println("D�as:");
								dias=sc5.nextLine();
								
								
								//Selecci�n de Asignatura
								System.out.println("Seleccione el c�digo de asignatura:");
								gestionAsignatura.ImprimirTodos();
								codigoAsignatura=sc.nextLine();
								Asignatura AsignaturaSeleccionadaModificar=null;
								int posicionAsignaturaSeleccionadaModificar=gestionAsignatura.BuscarAsignatura(codigoAsignatura);
								if(posicionAsignaturaSeleccionadaModificar==-1) {
									System.out.println("Asignatura incorrecta");
								}else {
									AsignaturaSeleccionadaModificar=gestionAsignatura.getElementoPorPosicion(posicionAsignaturaSeleccionadaModificar);
								}
								
								//Selecci�n de Profesor
								System.out.println("Seleccione el n�mero de empleado(Profesor):");
								gestionProfesor.ImprimirTodos();
								noProfesor=sc5.nextInt();
								Profesor ProfesorSeleccionadoModificar=null;
								int posicionProfesorSeleccionadoModificar=gestionProfesor.BuscarPorCodigo(noProfesor);
								if(posicionProfesorSeleccionadoModificar==-1) {
									System.out.println("Profesor incorrecto");
								}else {
									ProfesorSeleccionadoModificar=gestionProfesor.getElementoPorPosicion(posicionProfesorSeleccionadoModificar);
								}
								
								//Selecci�n de Aula
								System.out.println("Seleccione el n�mero de Aula:");
								gestionAula.ImprimirTodos();
								NoAula=sc5.nextInt();
								Aula AulaSeleccionadaModificar=null;
								int posicionAulaSeleccionadaModificar=gestionAula.BuscarPorCodigo(NoAula);
								if(posicionAulaSeleccionadaModificar==-1) {
									System.out.println("Aula incorrecta");
								}else {
									AulaSeleccionadaModificar=gestionAula.getElementoPorPosicion(posicionAulaSeleccionadaModificar);
								}
					
								
								//Selecci�n de Horario
								System.out.println("Seleccione el C�digo de Horario:");
								gestionHorario.ImprimirTodos();
								codigoHorario=sc.nextInt();
								Horario HorarioSeleccionadoModificar=null;
								int posicionHorarioSeleccionadoModificar=gestionHorario.BuscarPorCodigo(codigoHorario);
								if(posicionHorarioSeleccionadoModificar==-1) {
									System.out.println("Horario incorrecto");
								}else {
									HorarioSeleccionadoModificar=gestionHorario.getElementoPorPosicion(posicionHorarioSeleccionadoModificar);
								}
								
								//Paso 3
								SeccionClase Seccion1Modificado=new SeccionClase(); 
								Seccion1Modificado.set_Codigo(codigoSeccion);
								Seccion1Modificado.set_Asignatura(AsignaturaSeleccionadaModificar);
								Seccion1Modificado.set_Profesor(ProfesorSeleccionadoModificar);
								Seccion1Modificado.set_Aula(AulaSeleccionadaModificar);
								Seccion1Modificado.set_Dias(dias);
								Seccion1Modificado.set_Horario(HorarioSeleccionadoModificar);
								System.out.println(" ");
								
								
								//Paso 4
								
							if(gestionSeccion.Modificar(posicionModificar,Seccion1Modificado )) {
								System.out.println("Secci�n modificada satisfactormente");
							}else {
								System.out.println("Error al modificar Secci�n");
							}
							
						}
							
							
							
							
							break;
						case 3:  //Eliminar Secci�n
							/*Pasos
							 * 1. Solicitar el codigo de secci�n a eliminar 
							 * 2. Buscar el c�digo del secci�n a eliminar
							 * 3. Si lo encuentra, eliminar la secci�n en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int posicionSeccionEliminar;
							int numeroSeccionEliminar;
							System.out.println("Eliminar Seccion");
							System.out.println("Ingrese el c�digo de Seccion a eliminar:");
							numeroSeccionEliminar=sc5.nextInt();
							
							//Paso 2
							posicionSeccionEliminar=gestionSeccion.BuscarPorCodigo(numeroSeccionEliminar);
							
							
							//Paso 3
							if(posicionSeccionEliminar==-1) {
								System.out.println("No puede eliminar la Seccion: la Seccion no existe");
							}else {
								
								if(gestionSeccion.Eliminar(posicionSeccionEliminar)) {
									System.out.println("Seccion eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Seccion");
								}
								
							}
							break;
						case 4: //Buscar Seccion
							
							/*Pasos
							1. Buscar el Seccion (b�squeda por c�digo)
							2. Obtener el objeto y mostrar
							*/
							
							System.out.println("Buscar Seccion");
							System.out.println("Ingrese el c�digo de la Seccion: ");
							int numeroSeccionBuscar=sc5.nextInt();
							int posicionBuscar=gestionSeccion.BuscarPorCodigo(numeroSeccionBuscar);
							if(posicionBuscar==-1) {
								System.out.println("La Secci�n no existe");
							}else {
								SeccionClase SeccionEncontrada=gestionSeccion.getElementoPorPosicion(posicionBuscar);
								System.out.println(SeccionEncontrada);
							}
							break;
						case 5: //Imprimir todos
							gestionSeccion.ImprimirTodos();
	 						break;
						case 6: //Salir
							centinelaSeccion=false;
							break;
						default:
							System.out.println("Opci�n incorrecta");
							break;
						}
					}
					
					break;
					
				case 11: //Gesti�n de laboratorio
					centinelaLaboratorio=true;
					while(centinelaLaboratorio) {
						System.out.println("Gesti�n de Laboratorio");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionLaboratorio=sc.nextInt();
						
						switch(opcionLaboratorio) {
						case 1:  //Agregar
							/*Pasos
							1. Solicitar los valores al usuario almacenandolos en variables
							2. Crear la instancia del nuevo objeto (Laboratorio)
							3. Agregar esta instancia a la gesti�n
							*/
							//Paso 1:
							System.out.println("Agregar Laboratorio");
							System.out.println("Ingrese el c�digo de Laboratorio:");
							codigoLaboratorio=sc6.nextInt();
							System.out.println("Ingrese el nombre del Laboratorio:");
							nombreLab=sc7.nextLine();
							
							
							//Paso 2:
							
							Laboratorio nuevoLaboratorio = new Laboratorio(codigoLaboratorio,nombreLab);
							
							
							//Paso 3:
							if(gestionLaboratorio.Agregar(nuevoLaboratorio)) {
								System.out.println("Laboratorio registrado correctamente");
							}else {
								System.out.println("Error al registrar Laboratorio");
							}
							
							
							
							break;
						case 2: //Modificar
							/*Pasos
							1. Buscar el Laboratorio a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (Laboratorio)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							int noLaboratorioModificar, posicionLaboratorio;
							System.out.println("Modificar Laboratorio");
							System.out.println("Ingrese el c�digo del Laboratorio a modificar:");
							noLaboratorioModificar=sc.nextInt();
							
							posicionLaboratorio=gestionLaboratorio.BuscarPorCodigo(noLaboratorioModificar);
							
							if(posicionLaboratorio==-1) {
								System.out.println("El Laboratorio no existe");
							}else {
								Laboratorio LaboratorioEncontrado= gestionLaboratorio.getElementoPorPosicion(posicionLaboratorio);
								System.out.println(LaboratorioEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el c�digo del Laboratorio:");
								codigoLaboratorio=sc.nextInt();
								System.out.println("Ingrese el nombre del Laboratorio:");
								nombreLab=sc2.nextLine();
								
								
								//Paso 3:
								Laboratorio LaboratorioModificado = new Laboratorio(codigoLaboratorio, nombreLab);
								
								
								//Paso 4
								if(gestionLaboratorio.Modificar(posicionLaboratorio, LaboratorioModificado)) {
									System.out.println("Laboratorio modificado correctamente");
								}else {
									System.out.println("Error al modificar Laboratorio");
								}
							}
							
							break;
						case 3: //Eliminar
							/*Pasos
							 * 1. Solicitar el c�digo del Laboratorio a eliminar 
							 * 2. Buscar el c�digo del Laboratorio a eliminar
							 * 3. Si lo encuentra, eliminar Laboratorio en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int noLaboratorioEliminar, posicionLaboratorioEliminar;
							System.out.println("Eliminar Laboratorio");
							System.out.println("Ingrese el c�digo del Laboratorio a eliminar:");
							noLaboratorioEliminar=sc6.nextInt();
							
							//Paso 2
							posicionLaboratorioEliminar=gestionLaboratorio.BuscarPorCodigo(noLaboratorioEliminar);
							
							
							//Paso 3
							if(posicionLaboratorioEliminar==-1) {
								System.out.println("No puede eliminar el Laboratorio : el Laboratorio no existe");
							}else {
								
								if(gestionLaboratorio.Eliminar(posicionLaboratorioEliminar)) {
									System.out.println("Laboratorio eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Laboratorio");
								}
								
							}
							break;
						case 4:  //Buscar
							//Paso 1:
							int noLaboratorioBuscar, posicionLaboratorioBuscar;
							System.out.println("Buscar Laboratorio");
							System.out.println("Ingrese el c�digo del Laboratorio a buscar:");
							noLaboratorioBuscar=sc6.nextInt();
							
							posicionLaboratorioBuscar=gestionLaboratorio.BuscarPorCodigo(noLaboratorioBuscar);
							
							if(posicionLaboratorioBuscar==-1) {
								System.out.println("El Laboratorio no existe");
							}else {
								Laboratorio LaboratorioEncontrado= gestionLaboratorio.getElementoPorPosicion(posicionLaboratorioBuscar);
								System.out.println(LaboratorioEncontrado);
							}
							break;
						case 5: //Imprimir todos
							gestionLaboratorio.ImprimirTodos();
							break;
						case 6: //Salir gesti�n Laboratorio
							centinelaLaboratorio=false;
							break;
						}
					}
					
					break;
					
				case 12: //Gesti�n de Seccion Laboratorio
					centinelaSeccionLaboratorio=true;
					while(centinelaSeccionLaboratorio) {
						System.out.println("Gesti�n de Seccion Laboratorio");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos los empleados");
						System.out.println("6- Salir");
						opcionSeccionLaboratorio=sc6.nextInt();
						switch(opcionSeccionLaboratorio) {
						case 1: //Agregar SeccionLaboratorio
							/*Pasos
							1. Solicitar los valores al usuario y almacenarlos en variables
							2. Crear la instancia del nuevo objeto (SeccionLaboratorio)
							3. Agregar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							System.out.println("C�digo de secci�n Laboratorio: ");
							codigoSeccionLaboratorio=sc6.nextInt();
							System.out.println("D�as:");
							diasLab=sc7.nextLine();
							
							
							//Selecci�n de Laboratorio
							System.out.println("Seleccione el c�digo de Laboratorio:");
							gestionLaboratorio.ImprimirTodos();
							codigoLaboratorio=sc6.nextInt();
							Laboratorio LaboratorioSeleccionado=null;
							int posicionLaboratorioSeleccionado=gestionLaboratorio.BuscarPorCodigo(codigoLaboratorio);
							if(posicionLaboratorioSeleccionado==-1) {
								System.out.println("Laboratorio incorrecta");
							}else {
								LaboratorioSeleccionado=gestionLaboratorio.getElementoPorPosicion(posicionLaboratorioSeleccionado);
							}
						
							//Selecci�n de Profesor
							System.out.println("Seleccione el n�mero de empleado(Profesor):");
							gestionProfesor.ImprimirTodos();
							noProfesor=sc6.nextInt();
							Profesor ProfesorSeleccionado=null;
							int posicionProfesorSeleccionado=gestionProfesor.BuscarPorCodigo(noProfesor);
							if(posicionProfesorSeleccionado==-1) {
								System.out.println("Profesor incorrecto");
							}else {
								ProfesorSeleccionado=gestionProfesor.getElementoPorPosicion(posicionProfesorSeleccionado);
							}
							
							
							//seleccion de aula
							System.out.println("Seleccione el n�mero de Aula:");
							gestionAula.ImprimirTodos();
							NoAula=sc6.nextInt();
							Aula AulaSeleccionada=null;
							int posicionAulaSeleccionada=gestionAula.BuscarPorCodigo(NoAula);
							if(posicionAulaSeleccionada==-1) {
								System.out.println("Aula incorrecta");
							}else {
								AulaSeleccionada=gestionAula.getElementoPorPosicion(posicionAulaSeleccionada);
							}
				
				
						    //Selecci�n de Horario
							System.out.println("Seleccione el c�digo de Horario:");
							gestionHorario.ImprimirTodos();
							codigoHorario=sc6.nextInt();
							Horario HorarioSeleccionado=null;
							int posicionHorarioSeleccionado=gestionHorario.BuscarPorCodigo(codigoHorario);
							if(posicionHorarioSeleccionado==-1) {
								System.out.println("Horario incorrecto");
							}else {
								HorarioSeleccionado=gestionHorario.getElementoPorPosicion(posicionHorarioSeleccionado);
							}
							
						
							
							SeccionLaboratorio SeccionLaboratorio1=new SeccionLaboratorio(); 
							SeccionLaboratorio1.set_Codigo(codigoSeccionLaboratorio);
							SeccionLaboratorio1.set_Laboratorio(LaboratorioSeleccionado);
							SeccionLaboratorio1.set_Profesor(ProfesorSeleccionado);
							SeccionLaboratorio1.set_Aula(AulaSeleccionada);
							SeccionLaboratorio1.set_Dias(diasLab);
							SeccionLaboratorio1.set_Horario(HorarioSeleccionado);
							
							//Paso 3
							
							if(gestionSeccionLaboratorio.Agregar(SeccionLaboratorio1)) {
								System.out.println("SeccionLaboratorio agregada correctamente");
							}else {
								System.out.println("Error al agregar SeccionLaboratorio");
							}
							
							break;
						case 2:  //Modificando 	seccionLaboratorio
							/*Pasos
							1. Buscar la seccionLaboratorio a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (seccionLaboratorio)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							
							System.out.println("Modificar Secci�nLaboratorio");
							System.out.println("Ingrese el c�digo de Secci�nLaboratorio a modificar: ");
							int numeroSeccionLaboratorioModificar=sc6.nextInt();
							int posicionModificar=gestionSeccionLaboratorio.BuscarPorCodigo(numeroSeccionLaboratorioModificar);
							if(posicionModificar==-1) {
								System.out.println("La secci�nLaboratorio no existe");
							}else {
								SeccionLaboratorio SeccionLaboratorioEncontrada=gestionSeccionLaboratorio.getElementoPorPosicion(posicionModificar);
								System.out.println(SeccionLaboratorioEncontrada);
								
								
							
								System.out.println("C�digo de secci�n-Laboratorio: ");
								codigoSeccionLaboratorio=sc6.nextInt();
								System.out.println("D�as:");
								diasLab=sc7.nextLine();
								
								
								//Selecci�n de AsignaturaLaboratorio
								System.out.println("Seleccioneel el c�digo de Laboratorio:");
								gestionLaboratorio.ImprimirTodos();
								codigoSeccionLaboratorio=sc.nextInt();
								Laboratorio LaboratorioSeleccionadoModificar=null;
								int posicionLaboratorioSeleccionadoModificar=gestionLaboratorio.BuscarPorCodigo(codigoSeccionLaboratorio);
								if(posicionLaboratorioSeleccionadoModificar==-1) {
									System.out.println("Laboratorio incorrecto");
								}else {
									LaboratorioSeleccionadoModificar=gestionLaboratorio.getElementoPorPosicion(posicionLaboratorioSeleccionadoModificar);
								}
								
								//Selecci�n de Profesor
								System.out.println("Seleccione el n�mero de empleado(Profesor):");
								gestionProfesor.ImprimirTodos();
								noProfesor=sc5.nextInt();
								Profesor ProfesorSeleccionadoModificar=null;
								int posicionProfesorSeleccionadoModificar=gestionProfesor.BuscarPorCodigo(noProfesor);
								if(posicionProfesorSeleccionadoModificar==-1) {
									System.out.println("Profesor incorrecto");
								}else {
									ProfesorSeleccionadoModificar=gestionProfesor.getElementoPorPosicion(posicionProfesorSeleccionadoModificar);
								}
								
								//Selecci�n de Aula
								System.out.println("Seleccione el n�mero de Aula:");
								gestionAula.ImprimirTodos();
								NoAula=sc5.nextInt();
								Aula AulaSeleccionadaModificar=null;
								int posicionAulaSeleccionadaModificar=gestionAula.BuscarPorCodigo(NoAula);
								if(posicionAulaSeleccionadaModificar==-1) {
									System.out.println("Aula incorrecta");
								}else {
									AulaSeleccionadaModificar=gestionAula.getElementoPorPosicion(posicionAulaSeleccionadaModificar);
								}
					
					
								
								
								//Selecci�n de Horario
								System.out.println("Seleccione el c�digo de Horario:");
								gestionHorario.ImprimirTodos();
								codigoHorario=sc.nextInt();
								Horario HorarioSeleccionadoModificar=null;
								int posicionHorarioSeleccionadoModificar=gestionHorario.BuscarPorCodigo(codigoHorario);
								if(posicionHorarioSeleccionadoModificar==-1) {
									System.out.println("Horario incorrecto");
								}else {
									HorarioSeleccionadoModificar=gestionHorario.getElementoPorPosicion(posicionHorarioSeleccionadoModificar);
								}
								
								//Paso 3
								SeccionLaboratorio SeccionLaboratorio1Modificado=new SeccionLaboratorio(); 
								SeccionLaboratorio1Modificado.set_Codigo(codigoSeccionLaboratorio);
								SeccionLaboratorio1Modificado.set_Laboratorio(LaboratorioSeleccionadoModificar);
								SeccionLaboratorio1Modificado.set_Profesor(ProfesorSeleccionadoModificar);
								SeccionLaboratorio1Modificado.set_Aula(AulaSeleccionadaModificar);
								SeccionLaboratorio1Modificado.set_Dias(diasLab);
								SeccionLaboratorio1Modificado.set_Horario(HorarioSeleccionadoModificar);
								
								
								//Paso 4
								
							if(gestionSeccionLaboratorio.Modificar(posicionModificar,SeccionLaboratorio1Modificado )) {
								System.out.println("Secci�n-Laboratorio modificada satisfactormente");
							}else {
								System.out.println("Error al modificar Secci�n-Laboratorio");
							}
							
						}
							
							
							
							
							break;
						case 3:  //Eliminar Secci�nLaboratorio
							/*Pasos
							 * 1. Solicitar el codigo de secci�nLaboratorio a eliminar 
							 * 2. Buscar el c�digo del secci�nLaboratorio a eliminar
							 * 3. Si lo encuentra, eliminar la secci�n en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int posicionSeccionLaboratorioEliminar;
							int numeroSeccionLaboratorioEliminar;
							System.out.println("Eliminar Seccion-Laboratorio");
							System.out.println("Ingrese el c�digo de Seccion-Laboratorio a eliminar:");
							numeroSeccionLaboratorioEliminar=sc5.nextInt();
							
							//Paso 2
							posicionSeccionLaboratorioEliminar=gestionSeccionLaboratorio.BuscarPorCodigo(numeroSeccionLaboratorioEliminar);
							
							
							//Paso 3
							if(posicionSeccionLaboratorioEliminar==-1) {
								System.out.println("No puede eliminar la Seccion-Laboratorio: la Seccion no existe");
							}else {
								
								if(gestionSeccion.Eliminar(posicionSeccionLaboratorioEliminar)) {
									System.out.println("Seccion-Laboratorio eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Seccion-Laboratorio");
								}
								
							}
							break;
						case 4: //Buscar SeccionLaboratorio
							
							/*Pasos
							1. Buscar el SeccionLaboratorio (b�squeda por c�digo)
							2. Obtener el objeto y mostrar
							*/
							
							System.out.println("Buscar Seccion-Laboratorio");
							System.out.println("Ingrese el c�digo de la Seccion-Laboratorio: ");
							int numeroSeccionLaboratorioBuscar=sc6.nextInt();
							int posicionBuscar=gestionSeccionLaboratorio.BuscarPorCodigo(numeroSeccionLaboratorioBuscar);
							if(posicionBuscar==-1) {
								System.out.println("La Secci�n-Laboratorio no existe");
							}else {
								SeccionLaboratorio SeccionLaboratorioEncontrada=gestionSeccionLaboratorio.getElementoPorPosicion(posicionBuscar);
								System.out.println(SeccionLaboratorioEncontrada);
							}
							break;
						case 5: //Imprimir todos
							gestionSeccionLaboratorio.imprimirTodos();
	 						break;
						case 6: //Salir
							centinelaSeccionLaboratorio=false;
							break;
						default:
							System.out.println("Opci�n incorrecta");
							break;
						}
					}
					
					break;
				case 13: //Gesti�n de Tipo de Matricula
					centinelaTipoMatricula=true;
					while(centinelaTipoMatricula) {
						System.out.println("Gesti�n de Tipo-Matricula");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionTipoMatricula=sc.nextInt();
						
						switch(opcionTipoMatricula) {
						case 1:  //Agregar
							/*Pasos
							1. Solicitar los valores al usuario almacenandolos en variables
							2. Crear la instancia del nuevo objeto (TipoMatricula)
							3. Agregar esta instancia a la gesti�n
							*/
							//Paso 1:
							System.out.println("Agregar TipoMatricula");
							System.out.println("Ingrese el c�digo del Tipo-Matricula:");
							codigoTipoMatricula=sc6.nextInt();
							System.out.println("Ingrese la descripci�n del Tipo-Matricula:");
							descripcionTipoMatricula=sc7.nextLine();
						
							
							//Paso 2:
							
							TipoMatricula nuevoTipoMatricula = new TipoMatricula(codigoTipoMatricula,descripcionTipoMatricula);
							
							
							//Paso 3:
							if(gestionTipoMatricula.Agregar(nuevoTipoMatricula)) {
								System.out.println("Tipo-Matricula registrado correctamente");
							}else {
								System.out.println("Error al registrar Tipo-Matricula");
							}
							
							
							
							break;
						case 2: //Modificar
							/*Pasos
							1. Buscar el periodo a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (TipoMatricula)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							int noTipoMatriculaModificar, posicionTipoMatricula;
							System.out.println("Modificar TipoMatricula");
							System.out.println("Ingrese el c�digo del Tipo-Matricula a modificar:");
							noTipoMatriculaModificar=sc6.nextInt();
							
							posicionTipoMatricula=gestionTipoMatricula.BuscarPorCodigo(noTipoMatriculaModificar);
							
							if(posicionTipoMatricula==-1) {
								System.out.println("El Tipo-Matricula no existe");
							}else {
								TipoMatricula TipoMatriculaEncontrado= gestionTipoMatricula.getElementoPorPosicion(posicionTipoMatricula);
								System.out.println(TipoMatriculaEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el c�digo de Tipo-Matricula:");
								codigoTipoMatricula=sc6.nextInt();
								System.out.println("Ingrese la descripci�n del Tipo-Matricula:");
								descripcionTipoMatricula=sc7.nextLine();
								
								
								//Paso 3:
								TipoMatricula TipoMatriculaModificado = new TipoMatricula(codigoTipoMatricula, descripcionTipoMatricula);
								
								
								//Paso 4
								if(gestionTipoMatricula.Modificar(posicionTipoMatricula, TipoMatriculaModificado)) {
									System.out.println("Tipo-Matricula modificado correctamente");
								}else {
									System.out.println("Error al modificar TipoMatricula");
								}
							}
							
							break;
						case 3: //Eliminar
							/*Pasos
							 * 1. Solicitar el numero del TipoMatricula a eliminar 
							 * 2. Buscar el c�digo del TipoMatricula a eliminar
							 * 3. Si lo encuentra, eliminar TipoMatricula en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int noTipoMatriculaEliminar, posicionTipoMatriculaEliminar;
							System.out.println("Eliminar Tipo-Matricula");
							System.out.println("Ingrese el c�digo del Tipo-Matricula a eliminar:");
							noTipoMatriculaEliminar=sc6.nextInt();
							
							//Paso 2
							posicionTipoMatriculaEliminar=gestionTipoMatricula.BuscarPorCodigo(noTipoMatriculaEliminar);
							
							
							//Paso 3
							if(posicionTipoMatriculaEliminar==-1) {
								System.out.println("No puede eliminar el Tipo-Matricula : el Tipo-Matricula no existe");
							}else {
								
								if(gestionTipoMatricula.Eliminar(posicionTipoMatriculaEliminar)) {
									System.out.println("Tipo-Matricula eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Tipo-Matricula");
								}
								
							}
							break;
						case 4:  //Buscar
							//Paso 1:
							int noTipoMatriculaBuscar, posicionTipoMatriculaBuscar;
							System.out.println("Buscar Tipo-Matricula");
							System.out.println("Ingrese el c�digo del Tipo-Matricula a buscar:");
							noTipoMatriculaBuscar=sc6.nextInt();
							
							posicionTipoMatriculaBuscar=gestionTipoMatricula.BuscarPorCodigo(noTipoMatriculaBuscar);
							
							if(posicionTipoMatriculaBuscar==-1) {
								System.out.println("El Tipo-Matricula no existe");
							}else {
								TipoMatricula TipoMatriculaEncontrado= gestionTipoMatricula.getElementoPorPosicion(posicionTipoMatriculaBuscar);
								System.out.println(TipoMatriculaEncontrado);
							}
							break;
						case 5: //Imprimir todos
							gestionTipoMatricula.ImprimirTodos();
							break;
						case 6: //Salir gesti�n TipoMatricula
							centinelaTipoMatricula=false;
							break;
						}
					}
					
					break;
					
				case 14: //Gesti�n de Pago
					centinelaPago=true;
					while(centinelaPago) {
						System.out.println("Gesti�n de Pago");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todos");
						System.out.println("6- Salir");
						opcionPago=sc6.nextInt();
						
						switch(opcionPago) {
						case 1:  //Agregar
							/*Pasos
							1. Solicitar los valores al usuario almacenandolos en variables
							2. Crear la instancia del nuevo objeto (Pago)
							3. Agregar esta instancia a la gesti�n
							*/
							//Paso 1:
							System.out.println("Agregar Pago");
							System.out.println("Ingrese el c�digo de Pago:");
							codigoPago=sc6.nextInt();
							System.out.println("Ingrese el n�mero de clases matriculadas:");
							NoClases=sc7.nextInt();
							System.out.println("Ingrese el n�mero de Laboratorios Matriculados:");
							NoLabs=sc8.nextInt();
							System.out.println("-----------------------------------------------");
							
							
							Pago nuevoPago1 = new Pago(codigoPago,NoClases,NoLabs,Total);
							Total=nuevoPago1.MontoTotal();
							//Paso 2:
							Pago nuevoPago = new Pago(codigoPago,NoClases,NoLabs,Total);
							
							//Usando m�todos creados para dar a conocer el pago a efectuar
							System.out.println("Total Clases:"+ nuevoPago.MontoPorClases()+ " Lps.");
							System.out.println("Total Laboratorios:"+ nuevoPago.MontoPorLabs()+ " Lps.");
							System.out.println("TOTAL A PAGAR (incluida matr�cula):"+ Total+ " Lps.");
							System.out.println("-----------------------------------------------");
							System.out.println(" ");
							
							
							
							//Paso 3:
							if(gestionPago.Agregar(nuevoPago)) {
								System.out.println("Pago registrado correctamente");
							}else {
								System.out.println("Error al registrar Pago");
							}
							
							
							
							break;
						case 2: //Modificar
							/*Pasos
							1. Buscar el Pago a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (Pago)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							int noPagoModificar, posicionPago;
							System.out.println("Modificar Pago");
							System.out.println("Ingrese el c�digo del Pago a modificar:");
							noPagoModificar=sc6.nextInt();
							
							posicionPago=gestionPago.BuscarPorCodigo(noPagoModificar);
							
							if(posicionPago==-1) {
								System.out.println("El Pago no existe");
							}else {
								Pago PagoEncontrado= gestionPago.getElementoPorPosicion(posicionPago);
								System.out.println(PagoEncontrado);
								
								//Paso 2:
								System.out.println("Ingrese el c�digo de Pago:");
								codigoPago=sc6.nextInt();
								System.out.println("Ingrese el n�mero de clases matriculadas:");
								NoClases=sc7.nextInt();
								System.out.println("Ingrese el n�mero de Laboratorios Matriculados:");
								NoLabs=sc8.nextInt();
								System.out.println("-----------------------------------------------");
								
								Pago nuevoPago2 = new Pago(codigoPago,NoClases,NoLabs,Total);
								Total=nuevoPago2.MontoTotal();
								//Paso 3:
								Pago PagoModificado = new Pago(codigoPago,NoClases,NoLabs,Total);
								
								//Usando m�todos creados para dar a conocer el pago a efectuar
								System.out.println("Total Clases:"+ PagoModificado.MontoPorClases()+ " Lps.");
								System.out.println("Total Laboratorios:"+ PagoModificado.MontoPorLabs()+ " Lps.");
								System.out.println("TOTAL A PAGAR (incluida matr�cula):"+ Total+ " Lps.");
								System.out.println("-----------------------------------------------");
								System.out.println(" ");
								
				
								
								
								//Paso 4
								if(gestionPago.Modificar(posicionPago, PagoModificado)) {
									System.out.println("Pago modificado correctamente");
								}else {
									System.out.println("Error al modificar Pago");
								}
							}
							
							break;
						case 3: //Eliminar
							/*Pasos
							 * 1. Solicitar el numero del Pago a eliminar 
							 * 2. Buscar el c�digo del Pago a eliminar
							 * 3. Si lo encuentra, eliminar Pago en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int noPagoEliminar, posicionPagoEliminar;
							System.out.println("Eliminar Pago");
							System.out.println("Ingrese el c�digo del Pago a eliminar:");
							noPagoEliminar=sc6.nextInt();
							
							//Paso 2
							posicionPagoEliminar=gestionPago.BuscarPorCodigo(noPagoEliminar);
							
							
							//Paso 3
							if(posicionPagoEliminar==-1) {
								System.out.println("No puede eliminar el Pago : el Pago no existe");
							}else {
								
								if(gestionPago.Eliminar(posicionPagoEliminar)) {
									System.out.println("Pago eliminado correctamente");
								}else {
									System.out.println("Error al eliminar Pago");
								}
								
							}
							break;
						case 4:  //Buscar
							//Paso 1:
							int noPagoBuscar, posicionPagoBuscar;
							System.out.println("Buscar Pago");
							System.out.println("Ingrese el c�digo del Pago a buscar:");
							noPagoBuscar=sc6.nextInt();
							
							posicionPagoBuscar=gestionPago.BuscarPorCodigo(noPagoBuscar);
							
							if(posicionPagoBuscar==-1) {
								System.out.println("El Pago no existe");
							}else {
								Pago PagoEncontrado= gestionPago.getElementoPorPosicion(posicionPagoBuscar);
								System.out.println(PagoEncontrado);
							}
							break;
						case 5: //Imprimir todos
							gestionPago.ImprimirTodos();
							break;
						case 6: //Salir gesti�n Pago
							centinelaPago=false;
							break;
						}
					}
					
					break;
					
				case 15: //Gesti�n de Matricula
					centinelaMatricula=true;
					while(centinelaMatricula) {
						System.out.println("Gesti�n de Matricula");
						System.out.println("1- Agregar");
						System.out.println("2- Modificar");
						System.out.println("3- Eliminar");
						System.out.println("4- Buscar");
						System.out.println("5- Imprimir todas las matriculas");
						System.out.println("6- Salir");
						opcionMatricula=sc6.nextInt();
						switch(opcionMatricula) {
						case 1: //Agregar Matricula
							/*Pasos
							1. Solicitar los valores al usuario y almacenarlos en variables
							2. Crear la instancia del nuevo objeto (Matricula)
							3. Agregar esta instancia a la gesti�n
							*/
							
							//Paso 1:
							System.out.println("Agregar Matricula:");
							System.out.println("Ingrese el c�digo de matricula:");
							codigoMatricula=sc6.nextInt();
							System.out.println("Ingrese la fecha(dd-mm-yyyy): ");
							fechaMatricula=sc6.nextLine();
							
							
							
							//Selecci�n de Tipo de Matricula
							System.out.println("Seleccione el c�digo de tipo de Matricula:");
							gestionTipoMatricula.ImprimirTodos();
							codigoTipoMatricula=sc7.nextInt();
							TipoMatricula TipoMatriculaSeleccionada=null;
							int posicionTipoMatriculaSeleccionada=gestionTipoMatricula.BuscarPorCodigo(codigoTipoMatricula);
							if(posicionTipoMatriculaSeleccionada==-1) {
								System.out.println("Tipo de Matricula incorrecta");
							}else {
								TipoMatriculaSeleccionada=gestionTipoMatricula.getElementoPorPosicion(posicionTipoMatriculaSeleccionada);
							}
							
							//seleccion de Periodo
							System.out.println("Seleccione el n�mero de Periodo:");
							gestionPeriodo.ImprimirTodos();
							noPeriodo=sc6.nextInt();
							Periodo PeriodoSeleccionada=null;
							int posicionPeriodoSeleccionada=gestionPeriodo.BuscarPeriodo(noPeriodo);
							if(posicionPeriodoSeleccionada==-1) {
								System.out.println("Periodo incorrecta");
							}else {
								PeriodoSeleccionada=gestionPeriodo.getElementoPorPosicion(posicionPeriodoSeleccionada);
							}
							
							//Selecci�n de Estudiante
							System.out.println("Seleccione el n�mero de cuenta del Estudiante:");
							gestionEstudiante.imprimirTodos();
							numeroCuenta=sc10.nextLine();
							Estudiante EstudianteSeleccionado=null;
							int posicionEstudianteSeleccionado=gestionEstudiante.BuscarPorNumero(numeroCuenta);
							if(posicionEstudianteSeleccionado==-1) {
								System.out.println("Estudiante incorrecto");
							}else {
								EstudianteSeleccionado=gestionEstudiante.getElementoPorPosicion(posicionEstudianteSeleccionado);
							}
							
							
						    //Selecci�n de Seccion
							System.out.println("Seleccione el c�digo de Seccion-Asignatura:");
							gestionSeccion.ImprimirTodos();
							codigoSeccion=sc6.nextInt();
							SeccionClase SeccionSeleccionado=null;
							int posicionSeccionSeleccionado=gestionSeccion.BuscarPorCodigo(codigoSeccion);
							if(posicionSeccionSeleccionado==-1) {
								System.out.println("Seccion incorrecto");
							}else {
								SeccionSeleccionado=gestionSeccion.getElementoPorPosicion(posicionSeccionSeleccionado);
							}
							
							 //Selecci�n de Seccion-Laboratorio
							System.out.println("Seleccione el c�digo de Seccion-Laboratorio:");
							gestionSeccionLaboratorio.imprimirTodos();
							codigoSeccionLaboratorio=sc6.nextInt();
							SeccionLaboratorio SeccionLaboratorioSeleccionado=null;
							int posicionSeccionLaboratorioSeleccionado=gestionSeccionLaboratorio.BuscarPorCodigo(codigoSeccionLaboratorio);
							if(posicionSeccionLaboratorioSeleccionado==-1) {
								System.out.println("Seccion-Laboratorio incorrecto");
							}else {
								SeccionLaboratorioSeleccionado=gestionSeccionLaboratorio.getElementoPorPosicion(posicionSeccionLaboratorioSeleccionado);
							}
							
							//Selecci�n de Pago
							System.out.println("Seleccione el c�digo del pago:");
							gestionPago.ImprimirTodos();
							codigoPago=sc6.nextInt();
							Pago PagoSeleccionado=null;
							int posicionPagoSeleccionado=gestionPago.BuscarPorCodigo(codigoPago);
							if(posicionPagoSeleccionado==-1) {
								System.out.println("Pago incorrecto");
							}else {
								PagoSeleccionado=gestionPago.getElementoPorPosicion(posicionPagoSeleccionado);
							}
							
						
							
							Matricula Matricula1=new Matricula(); 
							Matricula1.set_Fecha(fechaMatricula);
							Matricula1.set_TipoMatricula(TipoMatriculaSeleccionada);
							Matricula1.set_Codigo(codigoMatricula);
							Matricula1.set_Estudiante(EstudianteSeleccionado);
							Matricula1.set_Periodo(PeriodoSeleccionada);
							Matricula1.set_Seccion(SeccionSeleccionado);
							Matricula1.set_SeccionLaboratorio(SeccionLaboratorioSeleccionado);
							Matricula1.set_Pago(PagoSeleccionado);
							//Paso 3
							
							if(gestionMatricula.Agregar(Matricula1)) {
								System.out.println("Matricula agregada correctamente");
							}else {
								System.out.println("Error al agregar Matricula");
							}
							
							break;
						case 2:  //Modificando Matricula
							/*Pasos
							1. Buscar la Matricula a modificar (b�squeda por c�digo)
							2. Solicitar los nuevos valores al usuario y almacenarlos en variables
							3. Crear la instancia del nuevo objeto (Matricula)
							4. Reemplazar esta instancia a la gesti�n
							*/
							
							
							System.out.println("Modificar Matricula");
							System.out.println("Ingrese el c�digo de Matricula a modificar: ");
							int numeroMatriculaModificar=sc6.nextInt();
							int posicionModificar=gestionMatricula.BuscarPorCodigo(numeroMatriculaModificar);
							if(posicionModificar==-1) {
								System.out.println("La Matricula no existe");
							}else {
								Matricula MatriculaEncontrada=gestionMatricula.getElementoPorPosicion(posicionModificar);
								System.out.println(MatriculaEncontrada);
								
								
						
								System.out.println("C�digo de Matricula: ");
								codigoMatricula=sc6.nextInt();
								System.out.println("Fecha de matricula:");
								fechaMatricula=sc7.nextLine();
								
								
								
								//Selecci�n de TipoMatricula
								System.out.println("Seleccione el c�digo de TipoMatricula:");
								gestionTipoMatricula.ImprimirTodos();
								codigoTipoMatricula=sc.nextInt();
								TipoMatricula TipoMatriculaSeleccionadaModificar=null;
								int posicionTipoMatriculaSeleccionadaModificar=gestionTipoMatricula.BuscarPorCodigo(codigoTipoMatricula);
								if(posicionTipoMatriculaSeleccionadaModificar==-1) {
									System.out.println("TipoMatricula incorrecta");
								}else {
									TipoMatriculaSeleccionadaModificar=gestionTipoMatricula.getElementoPorPosicion(posicionTipoMatriculaSeleccionadaModificar);
								}
								
								//Selecci�n de Periodo
								System.out.println("Seleccione el n�mero de Periodo:");
								gestionPeriodo.ImprimirTodos();
								noPeriodo=sc6.nextInt();
								Periodo PeriodoSeleccionadoModificar=null;
								int posicionPeriodoSeleccionadoModificar=gestionPeriodo.BuscarPeriodo(noPeriodo);
								if(posicionPeriodoSeleccionadoModificar==-1) {
									System.out.println("Periodo incorrecto");
								}else {
									PeriodoSeleccionadoModificar=gestionPeriodo.getElementoPorPosicion(posicionPeriodoSeleccionadoModificar);
								}
								
								//Selecci�n de Estudiante
								System.out.println("Seleccione el n�mero de cuenta del Estudiante:");
								gestionEstudiante.imprimirTodos();
								numeroCuenta=sc6.nextLine();
								Estudiante EstudianteSeleccionadaModificar=null;
								int posicionEstudianteSeleccionadaModificar=gestionEstudiante.BuscarPorNumero(numeroCuenta);
								if(posicionEstudianteSeleccionadaModificar==-1) {
									System.out.println("Estudiante incorrecto");
								}else {
									EstudianteSeleccionadaModificar=gestionEstudiante.getElementoPorPosicion(posicionEstudianteSeleccionadaModificar);
								}
					
					
							
								//Selecci�n de Seccion
								System.out.println("Seleccione el c�digo de Secci�n-Asignatura:");
								gestionSeccion.ImprimirTodos();
								codigoSeccion=sc.nextInt();
								SeccionClase SeccionSeleccionadoModificar=null;
								int posicionSeccionSeleccionadoModificar=gestionSeccion.BuscarPorCodigo(codigoSeccion);
								if(posicionSeccionSeleccionadoModificar==-1) {
									System.out.println("Seccion incorrecta");
								}else {
									SeccionSeleccionadoModificar=gestionSeccion.getElementoPorPosicion(posicionSeccionSeleccionadoModificar);
								}
								
								//Selecci�n de SeccionLaboratorio
								System.out.println("Seleccione el c�digo de Secci�n-Laboratorio:");
								gestionSeccionLaboratorio.imprimirTodos();
								codigoSeccionLaboratorio=sc.nextInt();
								SeccionLaboratorio SeccionLaboratorioSeleccionadoModificar=null;
								int posicionSeccionLaboratorioSeleccionadoModificar=gestionSeccionLaboratorio.BuscarPorCodigo(codigoSeccionLaboratorio);
								if(posicionSeccionLaboratorioSeleccionadoModificar==-1) {
									System.out.println("Secci�n-Laboratorio incorrecta");
								}else {
									SeccionLaboratorioSeleccionadoModificar=gestionSeccionLaboratorio.getElementoPorPosicion(posicionSeccionLaboratorioSeleccionadoModificar);
								}
								
								//Selecci�n de Pago
								System.out.println("Seleccione el c�digo de Pago:");
								gestionPago.ImprimirTodos();
								codigoPago=sc6.nextInt();
								Pago PagoSeleccionadoModificar=null;
								int posicionPagoSeleccionadoModificar=gestionPago.BuscarPorCodigo(codigoPago);
								if(posicionPagoSeleccionadoModificar==-1) {
									System.out.println("Pago incorrecto");
								}else {
									PagoSeleccionadoModificar=gestionPago.getElementoPorPosicion(posicionPagoSeleccionadoModificar);
								}
								
								//Paso 3
								Matricula Matricula1Modificado=new Matricula(); 
								Matricula1Modificado.set_Codigo(codigoMatricula);
								Matricula1Modificado.set_Fecha(fechaMatricula);
								Matricula1Modificado.set_TipoMatricula(TipoMatriculaSeleccionadaModificar);
								Matricula1Modificado.set_Periodo(PeriodoSeleccionadoModificar);
								Matricula1Modificado.set_Estudiante(EstudianteSeleccionadaModificar);
								Matricula1Modificado.set_Seccion(SeccionSeleccionadoModificar);
								Matricula1Modificado.set_SeccionLaboratorio(SeccionLaboratorioSeleccionadoModificar);
								Matricula1Modificado.set_Pago(PagoSeleccionadoModificar);
								
								//Paso 4
								
							if(gestionMatricula.Modificar(posicionModificar,Matricula1Modificado )) {
								System.out.println("Matricula modificada satisfactormente");
							}else {
								System.out.println("Error al modificar Matricula");
							}
							
						}
							
							
							
							
							break;
						case 3:  //Eliminar Matricula
							/*Pasos
							 * 1. Solicitar el codigo de Matricula a eliminar 
							 * 2. Buscar el c�digo de Matricula a eliminar
							 * 3. Si lo encuentra, eliminar la Matricula en la gesti�n
							 * 
							 */
							
							//Paso 1:
							int posicionMatriculaEliminar;
							int numeroMatriculaEliminar;
							System.out.println("Eliminar Matricula");
							System.out.println("Ingrese el c�digo de Matricula a eliminar:");
							numeroMatriculaEliminar=sc6.nextInt();
							
							//Paso 2
							posicionMatriculaEliminar=gestionMatricula.BuscarPorCodigo(numeroMatriculaEliminar);
							
							
							//Paso 3
							if(posicionMatriculaEliminar==-1) {
								System.out.println("No puede eliminar la Matricula: la Matricula no existe");
							}else {
								
								if(gestionMatricula.Eliminar(posicionMatriculaEliminar)) {
									System.out.println("Matricula eliminada correctamente");
								}else {
									System.out.println("Error al eliminar Matricula");
								}
								
							}
							break;
						case 4: //Buscar Matricula
							
							/*Pasos
							1. Buscar la Matricula (b�squeda por c�digo)
							2. Obtener el objeto y mostrar
							*/
							
							System.out.println("Buscar Matricula");
							System.out.println("Ingrese el c�digo de la Matricula: ");
							int numeroMatriculaBuscar=sc6.nextInt();
							int posicionBuscar=gestionMatricula.BuscarPorCodigo(numeroMatriculaBuscar);
							if(posicionBuscar==-1) {
								System.out.println("La Matricula no existe");
							}else {
								Matricula MatriculaEncontrada=gestionMatricula.getElementoPorPosicion(posicionBuscar);
								System.out.println(MatriculaEncontrada);
							}
							break;
						case 5: //Imprimir todos
							gestionMatricula.ImprimirTodos();
	 						break;
						case 6: //Salir
							centinelaMatricula=false;
							break;
						default:
							System.out.println("Opci�n incorrecta");
							break;
						}
					}
					
					break;
				
	}
      }
			
		}
	}
	
	
	
	
					
					
					
				
			
			
			
		
	
		
	

	
