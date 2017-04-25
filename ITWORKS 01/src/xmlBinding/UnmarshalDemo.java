package xmlBinding;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import core.people.People;
import core.people.Person;

public class UnmarshalDemo {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance("core.people");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			People people = (People) unmarshaller.unmarshal(new File("files/people.xml"));
			List<Person> list = people.getPerson();
			for (Person person : list) {
				System.out.println(person);
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
