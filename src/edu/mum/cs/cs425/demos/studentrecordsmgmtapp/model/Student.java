/**
 * 
 */
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.util.Date;

/**
 * @author Adeola Adeleke
 *
 */
public class Student implements Comparable<Student> {
	String studentId, name, dateOfAdmission;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @param studentId
	 * @param name
	 * @param dateOfAdmission
	 */
	public Student(String studentId, String name, String dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public boolean isPlatinumAlumni() {
		Date today = new Date();
		int todayYear = today.getYear();
		
		Date admDate = new Date(dateOfAdmission);
		int admYear = admDate.getYear();
		
		return (todayYear - admYear) >= 30 ? true : false;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateOfAdmission
	 */
	public String getDateOfAdmission() {
		return dateOfAdmission;
	}

	/**
	 * @param dateOfAdmission the dateOfAdmission to set
	 */
	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(o.getName()) ;
	}

	@Override
	public String toString() {
		return "Student [" + (studentId != null ? "studentId=" + studentId + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (dateOfAdmission != null ? "dateOfAdmission=" + dateOfAdmission : "") + "]";
	}
	
	
	
	
	
}
