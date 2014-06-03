package mypack;



import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "customer", catalog = "etour", uniqueConstraints = @UniqueConstraint(columnNames = "User_ID"))
public class Customer implements java.io.Serializable {

	private Integer customerId;
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String flatNumber;
	private String building;
	private String street;
	private String area;
	private String town;
	private String state;
	private Integer pin;
	private Integer contactNo;
	private String email;
	
	
	private Collection <Person> person;
	
	@OneToMany(cascade=CascadeType.ALL)
	public Collection<Person> getPerson() {
		return person;
	}



	public void setPerson(Collection<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", userId=" + userId
				+ ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", flatNumber=" + flatNumber
				+ ", building=" + building + ", street=" + street + ", area="
				+ area + ", town=" + town + ", state=" + state + ", pin=" + pin
				+ ", contactNo=" + contactNo + ", email=" + email + ", person="
				+ person + "]";
	}



	public Customer() {
	}

	public Customer(String firstName,String userId,
			String middleName, String lastName, String flatNumber,
			String building, String street, String area, String town,
			String state, Integer pin, Integer contactNo, String email) {
		this.userId=userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.flatNumber = flatNumber;
		this.building = building;
		this.street = street;
		this.area = area;
		this.town = town;
		this.state = state;
		this.pin = pin;
		this.contactNo = contactNo;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Customer_ID", unique = true, nullable = false)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	@Column(name = "User_ID", unique = true, length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "FirstName", length = 15)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MiddleName", length = 15)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "LastName", length = 15)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "FlatNumber", length = 10)
	public String getFlatNumber() {
		return this.flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Column(name = "Building", length = 15)
	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	@Column(name = "Street", length = 20)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "Area", length = 20)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "Town", length = 10)
	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Column(name = "State", length = 15)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Pin")
	public Integer getPin() {
		return this.pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	@Column(name = "ContactNo")
	public Integer getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	@Column(name = "Email", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

}
