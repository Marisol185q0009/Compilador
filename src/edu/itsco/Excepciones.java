package edu.itsco;

public class Excepciones extends Exception {
	
   

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Tipo{
		Variables_no_Declaradas,
		Variables_Duplicadas,
		Variables_no_Inicializadas,
		Tipos_no_Coinciden		
	}
 
 public Excepciones() {
	 super();
 }
 
 public Excepciones(Variable variable, Tipo tipo) {
	 super(obtenerMensaje(variable,tipo));
 }
 
 private static String obtenerMensaje(Variable variable, Tipo tipo) {
	 String mensaje=null;
	 switch(tipo) {
	 case Variables_Duplicadas:
		 mensaje = "La variable "+variable.getId()
		 +" ya ha sido declarada";
		 break;
	 case Variables_no_Declaradas:
		 mensaje = "La variable "+variable.getId()
		 +" no se ha definido";
		 break;
	 case Variables_no_Inicializadas:
		 mensaje = "La variable "+variable.getId()
		 +" no se ha inicializado";
		 break;
	 case Tipos_no_Coinciden:
		 mensaje = "Los tipos de datos no coinciden con la variable"
	     +variable.getId();
		 break; 
	 }
	 return mensaje;
	 
 }
}

