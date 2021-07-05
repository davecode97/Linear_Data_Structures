package SimpleList;

import java.io.*;
import static java.lang.System.out;
import java.io.IOException;
import java.util.Scanner;
public class Listas_Simples {

	/*
	 *	David 
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
	    	out.println("	 _______________________________");
	    	out.println("	|                               |");
	    	out.println("	|           SIMPLE LIST         |");
	    	out.println("	|_______________________________|");
	    	out.println("	|                               |");
	    	out.println("	|    1) INSERTION               |");
	    	out.println("	|                               |");
	    	out.println("	|    2) REMOVE                  |");
	    	out.println("	|                               |");
	    	out.println("	|    3) CONSULT                 |");
	    	out.println("	|                               |");
	    	out.println("	|    4) LEAVE                   |");
	    	out.println("	|_______________________________|");
	    	out.println("	|                               |");
	    	out.println("	|                               |");
	    	out.println("	|_______________________________|");
	    	out.print("	| >");
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
	    			out.println("	|                               |");
	    			out.println("	|   	 PROGRAMA TERMINADO     |");
	    			out.println("	|_______________________________|");
	    			System.exit(0);
	    			break;
	    		default:
	
	    			out.println("	|                               |");
	    			out.println("	|    !! OPCION INEXISTENTE !!   |");
	    			out.println("	|_______________________________|");
	    			Volver_Menu();	
	    			break;				
	    	}
		}
    }
//------------------------------------------------------------------------------------------------------------------------------------------------      
    public static void Insercion_Simp() throws java.io.IOException{
  	
  		
    	Scanner LeerDatos = new Scanner(System.in);
    	
    	//lista vacia
    	if(P == null){
    		P = new MENU();
    		
    		//numero de producto
    		out.println("	|_______________________________|");
	    	out.println("	|                               |");
	    	out.println("	|   INGRESA CLAVE DEL PRODUCTO  |");
			out.print("	| >");
			
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
	    	out.print("	| >");

    		int tipop= LeerDatos.nextInt();
    		P.tipo = tipop;
    		
   			//nombre
	    	out.println("	|  INGRESA NOMBRE DEL PRODUCTO  |");
	    	out.print("	| >");
    		String Nombre = leer_Teclado.readLine();
    		P.NombreProducto = Nombre;
    		
    		//precio
	    	out.println("	|  INGRESA PRECIO DEL PRODUCTO  |");
	    	out.print("	| >");
    		double  preciop = LeerDatos.nextDouble();
    		P.Precio = preciop;
    		
    		//cantidad
    		out.println("	|                               |");
	    	out.println("	|      CANDITAD DE PRODUCTO     |");
	    	out.print("	| >");
    		int  cantidadp = LeerDatos.nextInt();
    		P.Cantidad = cantidadp;
    		
	  		P.link = null;
	  		U=P;
	  		
	  		out.println("	|    DESEA INSERTAR DE NUEVO?   |");
   			out.println("	|    -> TECLEE 1 PARA ASEPTAR   |");
   			out.println("	|    -> CUALQUIER OTRO NUMERO   |");
   			out.println("	|       PARA VOLVER AL MENU     |");
   			out.print("	| >");
	  		int Repetir = LeerDatos.nextInt();
	  		if(Repetir==1){
	  			Insercion_Simp();
	  		}
	 
    		}
    		//_________________________________________________________
    		//lista llena
    		else{
            
            
    			Aux = new MENU();
    			//numero de producto
	    		out.println("	|_______________________________|");
		    	out.println("	|                               |");
		    	out.println("	|   INGRESA CLAVE DEL PRODUCTO  |");
		    	out.print("	| >");
	
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
		    	out.print("	| >");
	
	    		int tipop= LeerDatos.nextInt();
	    		Aux.tipo = tipop;
	    		
	   			//nombre
		    	out.println("	|  INGRESA NOMBRE DEL PRODUCTO  |");
		    	out.print("	| >");
	    		String Nombre = leer_Teclado.readLine();
	    		Aux.NombreProducto = Nombre;
	    		
	    		//precio
		    	out.println("	|  INGRESA PRECIO DEL PRODUCTO  |");
		    	out.print("	| >");
	    		double  preciop = LeerDatos.nextDouble();
	    		Aux.Precio = preciop;
	    		
	    		//cantidad
	    		out.println("	|                               |");
		    	out.println("	|      CANDITAD DE PRODUCTO     |");
		    	out.print("	| >");
	    		int  cantidadp = LeerDatos.nextInt();
	    		Aux.Cantidad = cantidadp;
	    		
	    		Aux.link = null;
		  		U.link = Aux;
		  		U=Aux;
		  		out.println("	|    DESEA INSERTAR DE NUEVO?   |");
   				out.println("	|    -> TECLEE 1 PARA ASEPTAR   |");
   				out.println("	|    -> CUALQUIER OTRO NUMERO   |");
   				out.println("	|       PARA VOLVER AL MENU     |");
   				out.print("	| >");
		  		int Repetir = LeerDatos.nextInt();
		  		if(Repetir==1){
		  			Insercion_Simp();
		  		}

    		}	  	
    	}
//------------------------------------------------------------------------------------------------------------------------------------------------ 
	//Eliminacion     	
    public static void EliminacionD(){
    	Scanner LeerDatos = new Scanner(System.in);
    	if(P == null){
    		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  		out.println("   !!              ERROR          !!");
	  		out.println("   !!	        LISTA VACIA        !!");
	  		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
    	}
    	else{ 
   			out.println("	|     ENSERIO DESEA ELIMINAR?   |");
   			out.println("	|    -> TECLEE 1 PARA CANCELAR  |");
   			out.println("	|    -> CUALQUIER OTRO NUMERO   |");
   			out.println("	|       PARA SEGUIR             |");
    		int Eliminar = LeerDatos.nextInt();
    		if(Eliminar<=1){
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
    public static void ConsultaD(){
    	if(P == null){
			out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  		out.println("   !!              ERROR          !!");
	  		out.println("   !!	        LISTA VACIA        !!");
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
//------------------------------------------------------------------------------------------------------------------------------------------------
 	//	Volver al menu
	public static void Volver_Menu(){
		System.out.println("    ");   
    	System.out.println("   ENTER(volver)> ");
    	try {
            System.in.read();
    	} catch (IOException e) {
        	e.printStackTrace();
        }
	}
}
