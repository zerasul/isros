package es.ual.vsuarez.isros.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import es.ual.vsuarez.isros.common.Request;
import es.ual.vsuarez.isros.common.Response;

public class IsroServiceImpl implements IsroService {

	
	@Override
	public Response listClients() {
		Request request = new Request();
		request.setBackend(Request.BACKENDCLIENTS);
		request.setOperation(Request.OPERATIONLIST);
		Response resp = new Response();
		resp.setRequest(request);
		return resp;
	}

	@Override
	public Response createClient(String ref, String nif, String name, String lasnames, String email, String address,
			String phone) {
		Request request = new Request();
		request.setBackend(Request.BACKENDCLIENTS);
		request.setOperation(Request.OPERATIONCREATE);
		Map<String,Serializable> parameters = new HashMap<String,Serializable>();
		parameters.put("ref", ref);
		parameters.put("nif", nif);
		parameters.put("name", name);
		parameters.put("lastname", lasnames);
		parameters.put("email", email);
		parameters.put("address", address);
		parameters.put("phone", phone);
		Response resp= new Response();
		resp.setRequest(request);
		
		return resp;
	}

	@Override
	public Response deleteClient(String ref){
		Request request = new Request();
		request.setBackend(Request.BACKENDCLIENTS);
		request.setOperation(Request.OPERATIONDELETE);
		Map<String,Serializable> parameters = new HashMap<String,Serializable>();
		parameters.put("ref", ref);
		Response response = new Response();
		response.setRequest(request);
		
		return response;
	}
	
	//Products
	
	@Override
	public Response listProducts(){
		Request request = new Request();
		request.setBackend(Request.BACKENDPRODUCTS);
		request.setOperation(Request.OPERATIONLIST);
		Response response = new Response();
		response.setRequest(request);
		return response;
	}
	
	@Override
	public Response createProduct(String ref, String name,String prize, String description){
		Request request = new Request();
		request.setBackend(Request.BACKENDPRODUCTS);
		request.setOperation(Request.OPERATIONCREATE);
		Map<String,Serializable> parameters = new HashMap<String, Serializable>();
		parameters.put("ref", ref);
		parameters.put("name", name);
		parameters.put("prize", prize);
		parameters.put("description", description);
		Response response = new Response();
		response.setRequest(request);
		return response;
	}
	
	@Override
	@WebMethod
	public Response deleteProduct(@WebParam(name="ref")String ref){
		Request request = new Request();
		request.setBackend(Request.BACKENDPRODUCTS);
		request.setOperation(Request.OPERATIONDELETE);
		Map<String,Serializable> parameters = new HashMap<String,Serializable>();
		parameters.put("ref", ref);
		Response response = new Response();
		response.setRequest(request);
		
		return response;
	}
}
