package in.ashokit.beans;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


import in.ashokit.beans.Address.Address;

public class UnMarshalling 
{
	public static void main(String[] args) throws Exception
	{
		Address ad = new Address("Bang","Ind",2);
	
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentMarks(999);
		s1.setStudentName("Ashok");
		s1.setStudentRank(5);
		s1.setAddress(ad);
		JAXBContext context = JAXBContext.newInstance(Student.class);
		//Marshaller marshaller = context.createMarshaller();
		//marshaller.marshal(s1, System.out);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Student s2 = (Student) unmarshaller.unmarshal(new File("Student.xml"));
		System.out.println(s2);
		
		
	}

}
