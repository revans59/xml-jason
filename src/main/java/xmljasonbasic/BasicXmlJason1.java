package xmljasonbasic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.Data;

//Deserialise xml back to java object
@Data
class Employee {
	private String firstame = "Revansiddappa";

	private String lastName = "Revani";

	private String empId = "11420";

	private String dob = "21-03-1994";
}

public class BasicXmlJason1 {

	public static void main(String[] args) {

		try {
			XmlMapper xmlMapper = new XmlMapper();

			Employee readValue = xmlMapper.readValue(
					"<Revan><firstame>Revansiddappa</firstame><lastName>Revani</lastName>"
					+ "<empId>11420</empId><dob>21-03-1994</dob></Revan>",
					Employee.class);
			System.out.println(readValue);// printing java object

		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
