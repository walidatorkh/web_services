package ws.calc;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Calculator {

	public int sum(int x, int y) {
		return x + y;
	}
	
	public String greet(Person p){
		return "Hello " + p.getName();
	}
}
