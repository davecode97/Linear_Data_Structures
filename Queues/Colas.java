package Queues;

import java.io.*;
import static java.lang.System.out;
import java.io.IOException;
import java.util.Scanner;
public class Colas {

	/*
	 *	David 
	 *	
	 */
//------------------------------------------------------------------------------------------------------------------------------------------------
       
    //Objeto para leer el teclado
    public static BufferedReader leer_Teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static MENU Aux;
    public static MENU P;
	public static MENU U;
    public static void main(String[] args) throws java.io.IOException{
    	Scanner LeerDatos = new Scanner(System.in);
//------------------------------------------------------------------------------------------------------------------------------------------------
		while(true){

	    	out.println("    _______________________________");
	    	out.println("   |                               |");
	    	out.println("   |             QUEUE             |");
	    	out.println("   |_______________________________|");
	    	out.println("   |                               |");
	    	out.println("   |    1) FINAL INSERTION         |");
	    	out.println("   |                               |");
	    	out.println("   |    2) REMOVE AT START         |");
	      	out.println("   |                               |");
	    	out.println("   |    3) NORMAL CONSULT          |");
	    	out.println("   |                               |");
	       	out.println("   |    4) LEAVE                   |");
	    	out.println("   |_______________________________|");
	    	out.println("   |                               |");
	    	out.println("   |                               |");
	    	out.println("   |_______________________________|");
	    	
	    	int Opcion = LeerDatos.nextInt();
	    	switch(Opcion){
	    		
	    		case 1:
	    			Insercion_Simp();
	       			Volver_Menu();
	    			break;
	    		case 2:
	    			EliminacionD();
	    			Volver_Menu();
	    			break;
	    	  				    			
	     		case 3:
	    			ConsultaD();
	    			Volver_Menu();
	    			break;
	    	
	    		case 4:
	    			System.exit(0);
	    			break;
	    		default:
	
	    			out.println("	|                               |");
	    			out.println("	|    !! OPCION INEXISTENTE !!   |");
	    			out.println("	|_______________________________|");	
	    			break;				
	    	}
		}
    }

	//insercion por normal  
  	public static void Insercion_Simp() throws java.io.IOException{
  	
  		
    	Scanner LeerDatos = new Scanner(System.in);
    	String Texto="";
    	Boolean Validacion = false;
    	while(Validacion==false){
    		System.out.println("Desea insertar Nodo? S/N");
    		Texto=LeerDatos.nextLine();
    		
    		if(Texto.equals("s")||Texto.equals("S"))
    		{
    			  			
	    	//lista vacia
	    	if(P == null){
	    		P = new MENU();
	    		
	    		//numero de producto
	    		out.println("	 _______________________________");
		    	out.println("	|                               |");
		    	out.println("	|   INGRESA CLAVE DEL PRODUCTO  |");
	
	    		String NoPro = LeerDatos.next();
	    		P.NoProducto = NoPro;
	    		
	    		//tipo
	    		out.println("	|                               |");
		    	out.println("	|   INGRESA TIPO DEL PRODUCTO   |");
		    	out.println("	|                               |");
		    	out.println("	|      1)-------CARNIBORA       |");
		    	out.println("	|      2)-----VEGETARIANA       |");
		    	out.println("	|      3)----------VEGANA       |");
		    	out.println("	|      4)----------BEBIDA       |");
		    	out.println("	|      5)----------POSTRE       |");
	
	    		int tipop= LeerDatos.nextInt();
	    		P.tipo = tipop;
	    		
	   			//nombre
		    	out.println("	|  INGRESA NOMBRE DEL PRODUCTO  |");
	    		String Nombre = leer_Teclado.readLine();
	    		P.NombreProducto = Nombre;
	    		
	    		//precio
		    	out.println("	|  INGRESA PRECIO DEL PRODUCTO  |");
	    		double  preciop = LeerDatos.nextDouble();
	    		P.Precio = preciop;
	    		
	    		//cantidad
	    		out.println("	|                               |");
		    	out.println("	|      CANDITAD DE PRODUCTO     |");
	    		int  cantidadp = LeerDatos.nextInt();
	    		P.Cantidad = cantidadp;
	    		
	    		P.LinkIzq = null;
		  		P.link = null;
		  		U=P;	
		  		
	  			
	  				out.println("");
		  			out.println("	| PRESIONE ENTER PARA CONTINUAR |");
		  			System.in.read();
		  			Insercion_Simp();
		  			 
	    	}
		    		
 	
		  		//_________________________________________________________
	    		//lista llena
	    		else
	    		{
	            
	    			Aux = new MENU();
	    			//numero de producto
	    		out.println("	 _______________________________");
		    	out.println("	|                               |");
		    	out.println("	|   INGRESA CLAVE DEL PRODUCTO  |");
	
	    		String NoPro = LeerDatos.next();
	    		Aux.NoProducto = NoPro;
	    		
	    		//tipo
	    		out.println("	|                               |");
		    	out.println("	|   INGRESA TIPO DEL PRODUCTO   |");
		    	out.println("	|                               |");
		    	out.println("	|      1)-------CARNIBORA       |");
		    	out.println("	|      2)-----VEGETARIANA       |");
		    	out.println("	|      3)----------VEGANA       |");
		    	out.println("	|      4)----------BEBIDA       |");
		    	out.println("	|      5)----------POSTRE       |");
	
	    		int tipop= LeerDatos.nextInt();
	    		Aux.tipo = tipop;
	    		
	   			//nombre
		    	out.println("	|  INGRESA NOMBRE DEL PRODUCTO  |");
	    		String Nombre = leer_Teclado.readLine();
	    		Aux.NombreProducto = Nombre;
	    		
	    		//precio
		    	out.println("	|  INGRESA PRECIO DEL PRODUCTO  |");
	    		double  preciop = LeerDatos.nextDouble();
	    		Aux.Precio = preciop;
	    		
	    		//cantidad
	    		out.println("	|                               |");
		    	out.println("	|      CANDITAD DE PRODUCTO     |");
	    		int  cantidadp = LeerDatos.nextInt();
	    		Aux.Cantidad = cantidadp;
	    		
	    		Aux.link = null;
	    		Aux.LinkIzq=U;
		  		U.link = Aux;
		  		U=Aux;
		  		
		  		out.println("");
		  		out.println("	| PRESIONE ENTER PARA CONTINUAR |");
		  		System.in.read();
	  			Insercion_Simp();
	  		
		  	
	    	}
    		}
    		if(Texto.equals("N")||Texto.equals("n"))
    		{
	   			System.out.println("USTED SELECCIONO NO INSERTAR"+"\n");
	   			break;
	   		}	  	
	   		else
	   		{
	   			break;
	   		}	
    	 }
     }
     
	 	
//------------------------------------------------------------------------------------------------------------------------------------------------ 
//Eliminacion normal     	
    public static void EliminacionD(){
    	Scanner LeerDatos = new Scanner(System.in);
    	if(P == null){
    		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  		out.println("   !!              ERROR          !!");
	  		out.println("   !!	        COLA VACIA        !!");
	  		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
    	}
    	else{
    		out.println("	|       ENSERIO DESEA ELIMINAR?   |");
   			out.println("	|    -> TECLEE N/n PARA CANCELAR  |");
   			out.println("	|    -> CUALQUIER OTRA TECLA      |");
   			out.println("	|       PARA SEGUIR               |");
    		String Eliminar = LeerDatos.next();
    		if(Eliminar.equals("N")||Eliminar.equals("n")){
    			out.println("	|      ELIMINACION CANCELADA    |");
    		}
    		else{
	    		if(P.link == null){
		    		P = null;
		    		U = null;
		    		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		    		out.println("	|                               |");
		    		out.println("	|        BORRADO EXITOSO        |");
		    		out.println("	|_______________________________|");
	    		}
	    		
		    	else{
		    		P = P.link;
		    		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		    		out.println("	|                               |");
		    		out.println("	|        BORRADO EXITOSO        |");
		    		out.println("	|_______________________________|");
		    	}
    		}
    	}
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
//Volver al menu
	public static void Volver_Menu(){
		System.out.println("    ");   
    	System.out.println("   ENTER(volver)> ");
    	try {
            System.in.read();
    	} catch (IOException e) {
        	e.printStackTrace();
        }
	}

    //------------------------------------------------------------------------------------------------------------------------------------------------
//consulta normal
    public static void ConsultaD(){
    	if(P == null){
			out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  		out.println("   !!              ERROR          !!");
	  		out.println("   !!	        COLA VACIA        !!");
	  		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	}else{
    		double Media=0;
    		int conta=0;
    		double total=0;
    		Aux = P;
    		out.println("'-------------------------------------------------------------------------'");
    		out.println("|No |Clave Producto |   Tipo 	|		Nombre		|  Precio | cantidad  |");
    		out.println("'-------------------------------------------------------------------------'");
    		do{
    			conta=conta+1;
    			out.print("  "+conta + "	  ");
    			out.print("  "+ Aux.NoProducto + "	");
    			out.print(Aux.tipo + "	  ");
    			out.print(Aux.NombreProducto + "				");
    			out.print(Aux.Precio + "		");
    			Media=Media+Aux.Precio;
    			
    			out.print(Aux.Cantidad + "		");
    			out.println();
    			Aux = Aux.link;
    			Media=Media/conta;
    			
    		}while(Aux != null);
    		
    		out.println("'------------------------------------------------------------------------'");
    		out.println("	MEDIA GENERAL DE PRECIOS:"+(Media)+"                                   ");
    		out.println("'------------------------------------------------------------------------'");	
    		
    		
       	} 
    }    

}
