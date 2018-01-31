package es.ual.vsuarez.isros.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import es.ual.vsuarez.isros.common.Response;

@WebService
public interface IsroService {
	@WebMethod
	public Response listClients();
	
	@WebMethod
	public Response createClient(@WebParam(name="ref")String ref,
								@WebParam(name="nif") String nif,
								@WebParam(name="name")String name,
								@WebParam(name="lastname")String lasnames,
								@WebParam(name="email")String email,
								@WebParam(name="address")String address,
								@WebParam(name="phone")String phone);

	@WebMethod
	public Response deleteClient(@WebParam(name="ref")String ref);
	
	@WebMethod
	public Response listProducts();
	
	@WebMethod
	public Response createProduct(@WebParam(name="ref")String ref,
								@WebParam(name="name") String name,
								@WebParam(name="prize")String prize,
								@WebParam(name="description")String description);
	
	@WebMethod
	public Response deleteProduct(@WebParam(name="ref")String ref);
}
