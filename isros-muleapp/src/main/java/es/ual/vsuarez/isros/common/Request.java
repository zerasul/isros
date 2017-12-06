package es.ual.vsuarez.isros.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Request {
	private String backend;
	private Integer Operation;
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
	public Integer getOperation() {
		return Operation;
	}
	public void setOperation(Integer operation) {
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
