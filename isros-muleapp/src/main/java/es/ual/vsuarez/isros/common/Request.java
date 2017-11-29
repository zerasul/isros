package es.ual.vsuarez.isros.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Request {
	private Integer backend;
	private Integer Operation;
	private Map<String, Serializable> parameters;
	
	public Request() {
		parameters = new HashMap<String, Serializable>();
	}
	public Integer getBackend() {
		return backend;
	}
	public void setBackend(Integer backend) {
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
	
	

}
