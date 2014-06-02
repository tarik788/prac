package people.management.entities;

// Generated 2 Jun, 2014 4:48:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlEmployeeAttendance generated by hbm2java
 */
@Entity
@Table(name = "PL_Employee_Attendance", schema = "dbo", catalog = "PeopleManagement")
public class PlEmployeeAttendance implements java.io.Serializable {

	private int empId;
	private String empName;
	private Date todayDate;
	private String month;
	private String day;
	private String year;
	private Date inTime;
	private Date outTime;
	private String remark;

	public PlEmployeeAttendance() {
	}

	public PlEmployeeAttendance(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public PlEmployeeAttendance(int empId, String empName, Date todayDate,
			String month, String day, String year, Date inTime, Date outTime,
			String remark) {
		this.empId = empId;
		this.empName = empName;
		this.todayDate = todayDate;
		this.month = month;
		this.day = day;
		this.year = year;
		this.inTime = inTime;
		this.outTime = outTime;
		this.remark = remark;
	}

	@Id
	@Column(name = "EmpId", unique = true, nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "EmpName", nullable = false, length = 20)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TodayDate", length = 10)
	public Date getTodayDate() {
		return this.todayDate;
	}

	public void setTodayDate(Date todayDate) {
		this.todayDate = todayDate;
	}

	@Column(name = "Month", length = 50)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Column(name = "Day", length = 10)
	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Column(name = "Year", length = 50)
	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "InTime", length = 10)
	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OutTime", length = 10)
	public Date getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}