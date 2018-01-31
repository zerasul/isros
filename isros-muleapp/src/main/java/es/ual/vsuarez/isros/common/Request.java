package es.ual.vsuarez.isros.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 * Clase Request; guarda la informacion de una peticion al ESB.
 * @author victor Suarez Garcia
 * @version 1.0.0
 */
public class Request {
	/**
	 * Back End de Clientes
	 */
	public static final String BACKENDCLIENTS="1";
	/**
	 * Back End de Products
	 */
	public static final String BACKENDPRODUCTS="2";
	/**
	 * Back End de Pedidos
	 */
	public static final String BACKENDSALES="3";
	
	/**
	 * Operacion de listado
	 */
	public static final String OPERATIONLIST="1";
	/**
	 * Operacion de creacion
	 */
	public static final String OPERATIONCREATE="2";
	/**
	 * Operacion de actualizacion
	 */
	public static final String OPERATIONUPDATE="3";
	/**
	 * Operacion de Borrado.
	 */
	public static final String OPERATIONDELETE="4";
	/**
	 * Backend seleccionado
	 */
	private String backend;
	/**
	 * Operacion seleccionada
	 */
	private String Operation;
	/**
	 * Mapa clave valor con el nombre del atributo y del objecto(debe ser serializable).
	 */
	private Map<String, Serializable> parameters;
	
	public Request() {
		parameters = new HashMap<String, Serializable>();
	}
	public String getBackend() {
		return backend;
	}
	public void setBackend(String backend) {
		this.backend = backend;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public Map<String, Serializable> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, Serializable> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		String str;
		str="[ backend: "+ getBackend()+", operation: "+getOperation()+", paramters: [";
		for (String str2 : parameters.keySet()) {
		  str+= str2+": "+parameters.get(str2).toString()+",";
		}
		str+="]]";
		return str;
	}

}
