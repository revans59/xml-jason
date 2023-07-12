package xmljasonbasic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

class Person {
	private String firstName;
	private String lastName;
	private List<String> phoneNumbers = new ArrayList<String>();
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Address> address = new ArrayList<Address>();

	// standard setters and getters
}

public class BasicXmlJason3 {

	public static void main(String[] args) {

		String nestedXml = "<Person>\r\n" + "    <firstName>Rohan</firstName>\r\n" + "    <lastName>Daye</lastName>\r\n"
				+ "    <phoneNumbers>\r\n" + "        <phoneNumbers>9911034731</phoneNumbers>\r\n"
				+ "        <phoneNumbers>9911033478</phoneNumbers>\r\n" + "    </phoneNumbers>\r\n"
				+ "    <address>\r\n" + "        <streetName>Name1</streetName>\r\n" + "        <city>City1</city>\r\n"
				+ "    </address>\r\n" + "    <address>\r\n" + "        <streetName>Name2</streetName>\r\n"
				+ "        <city>City2</city>\r\n" + "    </address>\r\n" + "</Person>";

		try {

			XmlMapper xmlMapper = new XmlMapper();
			Person person = testPerson();

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			xmlMapper.writeValue(byteArrayOutputStream, person);
			System.out.println(byteArrayOutputStream.toString());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
