/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete.Logica;

import Paquete.Estructuras.Constructor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class PruebaBD4O {
	
	static ObjectContainer BDusuario;
	
	public PruebaBD4O() {
		this.BDusuario=Db4o.openFile("Usuarios.yap");
	}
	
	public ObjectSet ConsultarLugares() {
		ObjectSet result=BDusuario.queryByExample(null);
		return result;
	}
	
	public ObjectSet ConsultarLugar(Object obj) {
		ObjectSet result=BDusuario.queryByExample(obj);
		return result;
	}
	
	public void Insertar(Object obj) {
		BDusuario.store(obj);
	}
        
	
	public void Borrar(Object obj) {
		ObjectSet result=ConsultarLugar(obj);
		while(result.hasNext()) {
			BDusuario.delete(result.next());
		}
               
	}
        
        
	
	public void Modificar(Object obj,int Codigo,int Latitud, int Longitud, String Lugar, String medio, String dia, String mes, String año) {
		
		ObjectSet result=ConsultarLugar(obj);
		while(result.hasNext()) {
			Constructor p1=(Constructor) result.next();
			p1.modificarLugar( Codigo,Latitud,  Longitud,  Lugar,  medio,  dia,  mes,  año);
			BDusuario.store(p1);
		}
	}
	public static void main(String[] args) {
                
		
		
		
	}

}

