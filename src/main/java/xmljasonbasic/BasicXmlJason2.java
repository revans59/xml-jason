package xmljasonbasic;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.Data;

@Data
class Employees {

	private String firstame = "Revansiddappa";

	// @JsonProperty
	private String lastName = "Revani";

	// @JsonProperty
	// private String empId = "11420";

//	@JsonProperty
	private String dob = "21-03-1994";
}

public class BasicXmlJason2 {

	public static void main(String[] args) {

		
		XmlMapper xmlMapper = new XmlMapper();
		String writeValueAsString;
		try {

			writeValueAsString = xmlMapper.writeValueAsString(new Employees());
			System.out.println("writeValueAsString" + writeValueAsString);
			xmlMapper.writeValue(new File("employee.xml"), new Employees());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
