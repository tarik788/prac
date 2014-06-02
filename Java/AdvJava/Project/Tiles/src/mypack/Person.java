package mypack;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "person", catalog = "etour")
public class Person implements java.io.Serializable {

	private Integer bookTransId;
	private String passengerName;
	private int age;
	private String gender;
	

	public Person() 
	{
	}

	public Person(String passengerName, Integer age, String gender) 
	{
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
		
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Book_Trans_ID", unique = true, nullable = false)
	public Integer getBookTransId() {
		return this.bookTransId;
	}

	public void setBookTransId(Integer bookTransId) {
		this.bookTransId = bookTransId;
	}

	

	@Column(name = "Passenger_Name", length = 30)
	public String getPassengerName() {
		return this.passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	@Column(name = "Age")
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "Gender", length = 8)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
