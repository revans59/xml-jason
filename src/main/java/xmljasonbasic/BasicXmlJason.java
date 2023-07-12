package xmljasonbasic;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class BasicXmlJason {

	private String firstame = "Revansiddappa";

	private String lastName = "Revani";

	private String empId = "11420";

	private String dob = "21-03-1994";

	public String getFirstame() {
		return firstame;
	}

	public void setFirstame(String firstame) {
		this.firstame = firstame;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public static void main(String[] args) {

		try {
			XmlMapper xmlMapper = new XmlMapper();
			String writeValueAsString = xmlMapper.writeValueAsString(new BasicXmlJason());
			System.out.println(writeValueAsString);// print xml structure as string
			xmlMapper.writeValue(new File("employee.xml"), new BasicXmlJason());// generates xml file

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
