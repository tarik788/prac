package mypack;

// Generated Jan 23, 2014 1:32:18 PM by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Search generated by hbm2java
 */
@Entity
@Table(name = "search", catalog = "etour")
public class Search implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer searchId;
	private String subCategoryId;
	private Date startDate;
	private Date endDate;
	private Integer duration;
	private BigDecimal cost;
	private String description;

	public Search() {
	}

	public Search(String subCategoryId, Date startDate, Date endDate,
			Integer duration, BigDecimal cost, String description) {
		this.subCategoryId = subCategoryId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.cost = cost;
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Search_ID", unique = true, nullable = false)
	public Integer getSearchId() {
		return this.searchId;
	}

	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}

	@Column(name = "SubCategory_ID", length = 10)
	public String getSubCategoryId() {
		return this.subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "StartDate", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EndDate", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "searchId=" + searchId + ", subCategoryId="
				+ subCategoryId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", duration=" + duration + ", cost=" + cost
				+ ", description=" + description+"";
	}

	@Column(name = "Duration")
	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Column(name = "Cost", precision = 10)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Column(name = "Description", length = 20)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
