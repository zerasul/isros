package es.ual.vsuarez.isros.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import es.ual.vsuarez.isros.common.Response;
/**
 * Interfaz del servicio web SOAP que estará de frontal del ESB.
 * @author victor suarez
 *
 * @version 1.0.0
 */
@WebService
public interface IsroService {
	/**
	 * Devuelve la lista de clientes
	 * @return respuesta con los clientes.
	 */
	@WebMethod
	public Response listClients();
	
	/**
	 * Crea un nuevo cliente
	 * @param ref referencia del cliente
	 * @param nif nif del cliente
	 * @param name nombre del cliente
	 * @param lasnames apellidos del cliente
	 * @param email email del cliente
	 * @param address direccion del cliente
	 * @param phone telefono del cliente
	 * @return Respuesta con la informacion de la creacion del cliente.
	 */
	@WebMethod
	public Response createClient(@WebParam(name="ref")String ref,
								@WebParam(name="nif") String nif,
								@WebParam(name="name")String name,
								@WebParam(name="lastname")String lasnames,
								@WebParam(name="email")String email,
								@WebParam(name="address")String address,
								@WebParam(name="phone")String phone);

	/**
	 * Borra un cliente existente
	 * @param ref referencia del cliente
	 * @return Respuesta con el borrado del cliente
	 */
	@WebMethod
	public Response deleteClient(@WebParam(name="ref")String ref);
	
	/**
	 * Listado de productos
	 * @return Respuesta con el listado de productos
	 */
	@WebMethod
	public Response listProducts();
	
	/**
	 * Crea un nuevo producto
	 * @param ref referencia del producto
	 * @param name nombre del producto
	 * @param prize precio del producto
	 * @param description descripcion del producto
	 * @return respuesta con la creacion del producto
	 */
	@WebMethod
	public Response createProduct(@WebParam(name="ref")String ref,
								@WebParam(name="name") String name,
								@WebParam(name="prize")String prize,
								@WebParam(name="description")String description);
	
	/**
	 * Borra un nuevo producto
	 * @param ref referencia del producto
	 * @return respuesta con el borrado del producto.
	 */
	@WebMethod
	public Response deleteProduct(@WebParam(name="ref")String ref);
}
