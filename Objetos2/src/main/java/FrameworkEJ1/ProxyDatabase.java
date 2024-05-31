package FrameworkEJ1;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class ProxyDatabase implements DatabaseAccess {
	
	private boolean logueado;
	private DatabaseAccess bs;
	
	public ProxyDatabase(DatabaseAccess bs) {
		super();
		this.bs = bs;
		this.logueado = false;
	}
	
	public void logIn() {
		this.logueado=true;
	}
	
	public void closeSession() {
		this.logueado=false;
	}
	public void chequearLog() {
		if(!this.logueado){
			Logger.getLogger("bd").log(Level.SEVERE,"access denied");
			throw new RuntimeException("access denied");
		}
		
	}
	
	public Collection<String> getSearchResults(String queryString){
		this.chequearLog();
		Logger.getLogger("db").log(Level.INFO,"search db");
		return this.bs.getSearchResults(queryString);
	}
	
	public int insertNewRow(List<String> rowData) {
		this.chequearLog();
		Logger.getLogger("db").log(Level.WARNING, "insert db");
		return this.bs.insertNewRow(rowData);
	}
}
