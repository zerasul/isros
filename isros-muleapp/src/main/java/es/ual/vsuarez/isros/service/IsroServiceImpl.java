package es.ual.vsuarez.isros.service;

import es.ual.vsuarez.isros.common.Request;
import es.ual.vsuarez.isros.common.Response;

public class IsroServiceImpl implements IsroService {

	
	@Override
	public Response listClients() {
		Request request = new Request();
		request.setBackend(1);
		request.setOperation(1);
		Response resp = new Response();
		resp.setRequest(request);
		return resp;
	}

}
