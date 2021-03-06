package mypack;

// Generated Jan 25, 2014 8:53:42 AM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Itinerary generated by hbm2java
 */
@Entity
@Table(name = "itinerary")
public class Itinerary implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer iternayId;
	
	private Tourinfo tourinfo;
	private Integer day;
	private String itinerary;
	private String stay;
	private String subcategoryid;

	public Itinerary() {
	}

	public Itinerary(Tourinfo tourinfo, Integer day, String itinerary,
			String stay) {
		this.tourinfo = tourinfo;
		this.day = day;
		this.itinerary = itinerary;
		this.stay = stay;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Iternay_ID", unique = true, nullable = false)
	public Integer getIternayId() {
		return this.iternayId;
	}

	public void setIternayId(Integer iternayId) {
		this.iternayId = iternayId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SubCategory_ID")
	public Tourinfo getTourinfo() {
		return this.tourinfo;
	}

	public void setTourinfo(Tourinfo tourinfo) {
		this.tourinfo = tourinfo;
	}

	@Column(name = "Day")
	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	@Column(name = "Itinerary", length = 250)
	public String getItinerary() {
		return this.itinerary;
	}

	public void setItinerary(String itinerary) {
		this.itinerary = itinerary;
	}

	@Column(name = "Stay", length = 15)
	public String getStay() {
		return this.stay;
	}

	public void setStay(String stay) {
		this.stay = stay;
	}

	public String getSubcategoryid() {
		return subcategoryid;
	}

	public void setSubcategoryid(String subcategoryid) {
		this.subcategoryid = subcategoryid;
	}


	
}
