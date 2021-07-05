package LinkedList;

import java.io.*;
import static java.lang.System.out;
import java.io.IOException;
import java.util.Scanner;
public class Listas_Dobles {
	
	/*  
	 *	ESTRUCTURA DE DATOS
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
	    	out.println("    _______________________________");
	    	out.println("   |                               |");
	    	out.println("   |           LINKED LIST         |");
	    	out.println("   |_______________________________|");
	    	out.println("   |                               |");
	    	out.println("   |    1) START INSERTION         |");
	    	out.println("   |    2) FINAL INSERTION         |");
	    	out.println("   |                               |");
	    	out.println("   |    3) REMOVE AT START         |");
	     	out.println("   |    4) REMOVE AT FINAL         |");
	    	out.println("   |                               |");
	    	out.println("   |    5) NORMAL CONSULT          |");
	    	out.println("   |    6) INVERSE CONSULT         |");
	    	out.println("   |                               |");
	     	out.println("   |    7) LEAVE                   |");
	    	out.println("   |_______________________________|");
	    	out.println("   |                               |");
	    	out.println("   |                               |");
	    	out.println("   |_______________________________|");
	    	
	    	int Opcion = LeerDatos.nextInt();
	    	switch(Opcion){
	    		case 1:
	    			InsercionInicio();
	    			Volver_Menu();
	    			break;
	    		case 2:
	    			Insercion_Simp();
	    			Volver_Menu();
	    			break;
	    		case 3:
	    			EliminacionD();
	    			Volver_Menu();
	    			break;
	    		case 4:
				EliminarFinalLD();
	    			Volver_Menu();
	    			break;    				    			
	     		case 5:
	    			ConsultaD();
	    			Volver_Menu();
	    			break;
	    		case 6:
	    			CosultaInversa();
	    			Volver_Menu();
	    			break;
	    		case 7:
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
//Insercion al inversa

 	public static void InsercionInicio()throws java.io.IOException
 	{
 			Scanner LeerDatos = new Scanner(System.in);
 			String Texto="";
	    	Boolean Validacion = false;
	     	while(Validacion==false){
    		System.out.println("Desea insertar Nodo? S/N");
    		Texto=LeerDatos.nextLine();   			
    			
    		if(Texto.equals("S")||Texto.equals("s"))
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
	    	out.println("	|      1)-------CARNIVORA       |");
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
	    	out.println("	|      CANTIDAD DE PRODUCTO     |");
    		int  cantidadp = LeerDatos.nextInt();
    		P.Cantidad = cantidadp;
    		
	  		P.LinkIzq = null;
	  		P.link = null;
	  		U=P;	 
	  				out.println("");
	  			    out.println("	| PRESIONE ENTER PARA CONTINUAR |");
			  		System.in.read();
			  			InsercionInicio();
			  		
		  		}	
    	//____________________________________________________________
    	//lista llena
    		else{
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
	    	out.println("	|      1)-------CARNIVORA       |");
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
	    	out.println("	|      CANTIDAD DE PRODUCTO     |");
    		int  cantidadp = LeerDatos.nextInt();
    		Aux.Cantidad = cantidadp;
    		
    			Aux.link = P;
    			Aux.LinkIzq = null;
    			////Aqui es donde esta mal el puntero apuntaba a último, en lugar de p
    			P.LinkIzq = Aux;
    			P = Aux;  
    				
    			out.println("");
				out.println("	| PRESIONE ENTER PARA CONTINUAR |");
		   		
			  		 	System.in.read();
			   			InsercionInicio();
			  		
    			
    	}
 			}if(Texto.equals("N")||Texto.equals("n")){
	   			System.out.println("USTED SELECCIONO NO INSERTAR"+"\n");
	   				break;
	   		}
	   		else{
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
//Eliminacion al inversa
    	public  static void EliminarFinalLD(){
    	Scanner LeerDatos = new Scanner(System.in);
    		if(P == null){
            out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  		out.println("   !!          ERROR           !!");
	  		out.println("   !!	    LISTA VACIA         !!");
	  		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
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
		    		//cambio
		    		U = U.LinkIzq;
		    		U.link = null;
		    		out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		    		out.println("	|                               |");
		    		out.println("	|        BORRADO EXITOSO        |");
		    		out.println("	|_______________________________|");
		    	}
    		}
    		}
    	}    
//------------------------------------------------------------------------------------------------------------------------------------------------
//consulta normal
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
//Consulta Inversa
    	public static void CosultaInversa(){
	    	if(P == null){
				out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			  	out.println("   !!              ERROR          !!");
			  	out.println("   !!	        LISTA VACIA        !!");
			  	out.println("   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	    	}
	    	else{
		    	double Media=0;
		    	int conta=0;
		    	Aux = U;
		    	out.println("'------------------------------------------------------------------------'");
    			out.println("|No |Clave Producto  |   Tipo 	|		Nombre		|  Precio | cantidad  |");
    			out.println("'------------------------------------------------------------------------'");;
		        do{
		       			    		
			   		conta=conta+1;
			   		out.print("  "+conta + "	  ");
			   		out.print("  "+ Aux.NoProducto + "		");
			   		out.print(Aux.tipo + "	  ");
			  		out.print("     "+Aux.NombreProducto + "				");
			   		out.print(Aux.Precio + "		");
			   		Media=Media+Aux.Precio;
			    			
			    	out.print(Aux.Cantidad + "		");
			    	out.println();
			    	Aux = Aux.LinkIzq;
			    	Media=Media/conta;
			    			
		        }while(Aux != null);
		        
			    out.println("'----------------------------------------------------------------'");
			   	out.println("	MEDIA GENERAL DE PRECIOS:"+(Media)+"                           ");
			   	out.println("'----------------------------------------------------------------'");	
			   	
		        
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

  	
}
