package xmlBinding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import core.people.People;
import core.people.Person;

public class MarshalDemo {

	public static void main(String[] args) {

		People people = new People();
		List<Person> list = people.getPerson();

		Person p = new Person();
		p.setId(1);
		p.setName("aaa");
		p.setAge(45);
		list.add(p);
		p = new Person();
		p.setId(3);
		p.setName("ccc");
		p.setAge(66);
		list.add(p);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("core.people");
			Marshaller marshaller = jaxbContext.createMarshaller();

			// optional - marshal with validation
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = sf.newSchema(new File("files/people.xsd"));
			marshaller.setSchema(schema);

			// optional - marshal formatted
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// optional - marshal bind xml to schema
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.example.org/people people.xsd");

			marshaller.marshal(people, new FileOutputStream("files/people.xml"));

		} catch (JAXBException | SAXException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("done");
	}
}
