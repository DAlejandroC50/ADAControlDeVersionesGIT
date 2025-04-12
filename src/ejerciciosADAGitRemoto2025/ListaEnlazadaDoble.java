package ejerciciosADAGitRemoto2025;

import adaLista.MascotaNodo;

public class ListaEnlazadaDoble {
	public ClaseObjeto primero;
	public ClaseObjeto ultimo;
	public ClaseObjeto actual;
	
	public void InsertarEnMedio (ClaseObjeto nuevo) {
		if (primero == null) {  
            primero = ultimo = nuevo;
        } else {
        	ClaseObjeto aux = primero;
			while ((aux.siguiente!=null) && (aux.getNumero()<nuevo.getNumero())) {
				aux=aux.siguiente;
			}
			aux.anterior.siguiente=nuevo;
			nuevo.siguiente=aux;
			nuevo.anterior=actual.anterior;
			aux.anterior=nuevo;
        }
	}
	
	public void eliminarDeEnmedio(int num){
		actual = primero;
		while (actual!=null && actual.getNumero()!= num) {
			actual = actual.siguiente;
		}
	    if (actual == null) { // Si no se encuentra el nodo del elemento
	        System.out.println("Mascota no encontrada.");
	        return;
	    }
	    if (actual.getNumero()==num) {
	    	ClaseObjeto eliminado = actual;
		 actual = eliminado.anterior;
		 actual.siguiente = eliminado.siguiente;
		 eliminado.siguiente.anterior = actual;
		 eliminado= null;
		}
	}
	
	public ClaseObjeto buscarMascota(int numero) { 
	    ClaseObjeto aux = primero;
	    while (aux != null) {
	        if (aux.getNumero() == numero) {
	            return aux; // Elemento encontrado
	        }
	        aux = aux.siguiente;
	    }
	    return null; // No se encuentra el objeto
	}

}
