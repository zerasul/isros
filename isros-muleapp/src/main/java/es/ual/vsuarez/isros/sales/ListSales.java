package es.ual.vsuarez.isros.sales;

import java.util.List;

import com.google.gson.Gson;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.isros.pshop.Sale;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;

/**
 * Tarea asociada a listar pedidos
 * @author victor suarez
 * @version 1.0.0
 */
public class ListSales implements IsrosTask {

	PrestashopConnector prestashopconnector;
	public ListSales() {
		prestashopconnector = new PrestashopConnector();
	}
	@Override
	public Response doTask(Response response) {
		Gson gson= new Gson();
		response.setResult("OK");
		List<Sale> sales=prestashopconnector.listSales();
		response.setResponse(gson.toJson(sales));
		return response;
	}

}
