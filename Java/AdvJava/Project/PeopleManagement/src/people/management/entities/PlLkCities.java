package people.management.entities;

// Generated 2 Jun, 2014 4:48:02 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PlLkCities generated by hbm2java
 */
@Entity
@Table(name = "PL_LK_Cities", schema = "dbo", catalog = "PeopleManagement")
public class PlLkCities implements java.io.Serializable {

	private Serializable zipCode;
	private PlLkStates plLkStates;
	private int cityId;
	private Set<PlAddress> plAddresses = new HashSet<PlAddress>(0);

	public PlLkCities() {
	}

	public PlLkCities(Serializable zipCode, PlLkStates plLkStates, int cityId) {
		this.zipCode = zipCode;
		this.plLkStates = plLkStates;
		this.cityId = cityId;
	}

	public PlLkCities(Serializable zipCode, PlLkStates plLkStates, int cityId,
			Set<PlAddress> plAddresses) {
		this.zipCode = zipCode;
		this.plLkStates = plLkStates;
		this.cityId = cityId;
		this.plAddresses = plAddresses;
	}

	@Id
	@Column(name = "ZipCode", unique = true, nullable = false)
	public Serializable getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Serializable zipCode) {
		this.zipCode = zipCode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "City", nullable = false)
	public PlLkStates getPlLkStates() {
		return this.plLkStates;
	}

	public void setPlLkStates(PlLkStates plLkStates) {
		this.plLkStates = plLkStates;
	}

	@Column(name = "CityId", nullable = false)
	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plLkCities")
	public Set<PlAddress> getPlAddresses() {
		return this.plAddresses;
	}

	public void setPlAddresses(Set<PlAddress> plAddresses) {
		this.plAddresses = plAddresses;
	}

}
