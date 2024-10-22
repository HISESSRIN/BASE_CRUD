package Tablota;

public class EMP {

	int customerid;
	String companyName, contactTitle, contactName, address, city, region, postalCode, country, phone, fax;

	Data dc = new Data();

	public boolean insertarEMP() {
		return dc.insertarEMP(this);

	}

	public boolean eliminarEMP() {
		return dc.eliminarEMP(this.getCustomerid());

	}
	public boolean cargarEMP() {
		return dc.cargarEMP(this);

	}
	public boolean editarEMP() {
		return dc.editarEMP(this);

	}

	
	public EMP() {

	}

	public EMP(int customerid, String companyName, String contactTitle, String contactName, String address, String city,
			String region, String postalCode, String country, String phone, String fax) {

		this.customerid = customerid;
		this.companyName = companyName;
		this.contactTitle = contactTitle;
		this.contactName = contactName;
		this.address = address;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}
