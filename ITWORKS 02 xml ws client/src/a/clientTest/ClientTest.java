package a.clientTest;

import ws.calc.Calculator;
import ws.calc.CalculatorService;
import ws.calc.Person;

public class ClientTest {

	public static void main(String[] args) {
		CalculatorService service = new CalculatorService();
		Calculator calcStub = service.getCalculatorPort();
		
		System.out.println("call started...");
		
		int sum = calcStub.sum(15, 6);
		System.out.println("sum is: " + sum);
		Person p = new Person();
		p.setName("Eldar");
		System.out.println(calcStub.greet(p));
		
		System.out.println("call ended...");
	}
}
