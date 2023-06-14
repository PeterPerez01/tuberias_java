import java.util.*;
import java.lang.*;

class tuberia{
public static synchronized void main(String[]abc){
	
	//declaracion general
	int[] productor = new int[11]; // declaracion del productor en vector
	int[] consumidor = new int[5]; // declaracion del consumidor en 5 formato de vector
	
	//Declaración de semaforo simple
	boolean wait=false, signal=false; //Declaracion de los semaforos en false para comenzar con la realizacion
		
		signal=true;
		
	if(signal=true){
	System.out.println("Iniciando Proceso Productor");
	for(int x=1; x<=10; x++){
		productor[x] = x;
	System.out.println("Productor: (" + x + ")");
}//cierre de for
wait=true;
 		}//cierre de semaforo
 		if(wait=true){
 			System.out.println("Iniciando Proceso Consumidor");
 		for(int a=1; a<5; a++){
		consumidor[a] = productor[a];
	System.out.println("Consumidor: (" + productor[a] + ")");
}//cierre de for
}//cierre del wait
	
	
		}
				}