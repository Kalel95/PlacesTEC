/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete.Logica;

import Datos.Constructor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class PruebaBD4O {
	
	static ObjectContainer BDusuario;
	
	public PruebaBD4O() {
		this.BDusuario=Db4o.openFile("Usuarios.yap");
	}
	
	public ObjectSet Consultar() {
		ObjectSet result=BDusuario.queryByExample(null);
		return result;
	}
	
	public ObjectSet Consultar(Object obj) {
		ObjectSet result=BDusuario.queryByExample(obj);
		return result;
	}
	
	public void Insertar(Object obj) {
		BDusuario.store(obj);
	}
        
	
	public void Borrar(Object obj) {
		ObjectSet result=Consultar(obj);
		while(result.hasNext()) {
			BDusuario.delete(result.next());
		}
               
	}
        
	
	public void Modificar(Object obj,String Usuario,int Latitud, int Longitud, String Lugar, String medio, String dia, String mes, String año) {
		
		ObjectSet result=Consultar(obj);
		while(result.hasNext()) {
			Constructor p1=(Constructor) result.next();
			p1.modificarPersona( Usuario,Latitud,  Longitud,  Lugar,  medio,  dia,  mes,  año);
			BDusuario.store(p1);
		}
	}
	public static void main(String[] args) {
                
		
		
		
	}

}

