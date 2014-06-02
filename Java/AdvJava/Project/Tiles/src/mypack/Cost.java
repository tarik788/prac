package mypack;



import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cost", catalog = "etour")
public class Cost implements java.io.Serializable {

	private Integer costId;
	private String subCategoryId;
	private BigDecimal baseCost;
	private BigDecimal extraAdult;
	private BigDecimal childWithBed;
	private BigDecimal childWithoutBed;
	private BigDecimal singlePerson;

	public Cost() {
	}

	public Cost(String subCategoryId, BigDecimal baseCost, BigDecimal extraAdult,
			BigDecimal childWithBed, BigDecimal childWithoutBed,
			BigDecimal singlePerson) {
		this.subCategoryId = subCategoryId;
		this.baseCost = baseCost;
		this.extraAdult = extraAdult;
		this.childWithBed = childWithBed;
		this.childWithoutBed = childWithoutBed;
		this.singlePerson = singlePerson;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Cost_ID", unique = true, nullable = false)
	public Integer getCostId() {
		return this.costId;
	}

	public void setCostId(Integer costId) {
		this.costId = costId;
	}


	@Column(name = "SubCategoryId")
	public String getSubCategoryId() {
		return subCategoryId;
	}

	@Override
	public String toString() {
		return "Cost [baseCost=" + baseCost + ", extraAdult=" + extraAdult
				+ ", childWithBed=" + childWithBed + ", childWithoutBed="
				+ childWithoutBed + ", singlePerson=" + singlePerson + "]";
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Column(name = "BaseCost", precision = 8)
	public BigDecimal getBaseCost() {
		return this.baseCost;
	}

	public void setBaseCost(BigDecimal baseCost) {
		this.baseCost = baseCost;
	}

	@Column(name = "ExtraAdult", precision = 8)
	public BigDecimal getExtraAdult() {
		return this.extraAdult;
	}

	public void setExtraAdult(BigDecimal extraAdult) {
		this.extraAdult = extraAdult;
	}

	@Column(name = "ChildWithBed", precision = 8)
	public BigDecimal getChildWithBed() {
		return this.childWithBed;
	}

	public void setChildWithBed(BigDecimal childWithBed) {
		this.childWithBed = childWithBed;
	}

	@Column(name = "ChildWithoutBed", precision = 8)
	public BigDecimal getChildWithoutBed() {
		return this.childWithoutBed;
	}

	public void setChildWithoutBed(BigDecimal childWithoutBed) {
		this.childWithoutBed = childWithoutBed;
	}

	@Column(name = "SinglePerson", precision = 8)
	public BigDecimal getSinglePerson() {
		return this.singlePerson;
	}

	public void setSinglePerson(BigDecimal singlePerson) {
		this.singlePerson = singlePerson;
	}

}
