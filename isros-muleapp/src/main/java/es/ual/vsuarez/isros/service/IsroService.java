package es.ual.vsuarez.isros.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import es.ual.vsuarez.isros.common.Response;

@WebService
public interface IsroService {
	@WebMethod
	public Response listClients();

}
