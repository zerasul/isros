package es.ual.vsuarez.isros.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Request {
	public static final String BACKENDCLIENTS="1";
	public static final String BACKENDPRODUCTS="2";
	public static final String BACKENDSALES="3";
	
	public static final String OPERATIONLIST="1";
	public static final String OPERATIONCREATE="2";
	public static final String OPERATIONUPDATE="3";
	public static final String OPERATIONDELETE="4";
	private String backend;
	private String Operation;
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
