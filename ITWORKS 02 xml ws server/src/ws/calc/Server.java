package ws.calc;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/calc", new Calculator());
		System.out.println("web service up");
	}
}
