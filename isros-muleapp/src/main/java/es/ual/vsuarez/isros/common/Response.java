package es.ual.vsuarez.isros.common;
/**
 * Clase Response: Almacena la informacion de una respuesta del ESB.
 * @author victor suarez
 * @version 1.0.0
 */
public class Response {
	
	private Request request;
	private String result;
	private String Response;
	
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
	@Override
	public String toString() {
		String str="[ Request: "+request.toString()+", result:"+result+", response: "+Response+"]";
		return str;
	}
	

}
