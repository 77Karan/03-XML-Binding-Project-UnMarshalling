package in.ashokit.beans.Address;

public class Address 
{
	private String city;
	private String Country;
	private int pinCode;
	
	public Address()
	{
		
	}
	public Address(String city, String country, int pinCode) {
		this.city = city;
		Country = country;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + ", pinCode=" + pinCode + "]";
	}
	
	

}
