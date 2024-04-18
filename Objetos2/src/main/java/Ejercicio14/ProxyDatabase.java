package Ejercicio14;

import java.util.Collection;
import java.util.List;

public class ProxyDatabase implements DatabaseAccess {
	
	private boolean logueado;
	private DatabaseAccess bs;
	
	public ProxyDatabase(DatabaseAccess bs) {
		super();
		this.bs = bs;
		this.logueado = false;
	}

	public void CambiarEstado() {
		
		this.logueado = !this.logueado;
		
	}
	
	public Collection<String> getSearchResults(String queryString){
		if(logueado) {
			return this.bs.getSearchResults(queryString);
		}else {
			throw new RuntimeException("Accion no disponible, usuario no autenticado");
		}
		
	}
	
	public int insertNewRow(List<String> rowData) {
		if(logueado) {
		return this.bs.insertNewRow(rowData);
		}else {
			throw new RuntimeException("Accion no disponible, usuario no autenticado");
		}
	}
}
