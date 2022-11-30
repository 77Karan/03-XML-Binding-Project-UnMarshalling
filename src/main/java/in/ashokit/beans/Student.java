package in.ashokit.beans;
import javax.xml.bind.annotation.XmlRootElement;

import in.ashokit.beans.Address.Address;
@XmlRootElement
public class Student 
{
	private int studentId;
	private String studentName;
	private int studentRank;
	private int studentMarks;
	private Address address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRank=" + studentRank
				+ ", studentMarks=" + studentMarks + ", address=" + address + "]";
	}
	
	

}
