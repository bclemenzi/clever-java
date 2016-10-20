package com.evotext.clever.model;

public class Contact {

	private String district;
	private String email;
	private String name;
	private String phone;
	private String student;
	private String type;
	private String id;

	/**
	 * 
	 * @return The district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * 
	 * @param district
	 *            The district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * 
	 * @return The email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 *            The email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone
	 *            The phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	 * @return The student
	 */
	public String getStudent() {
		return student;
	}

	/**
	 * 
	 * @param student
	 *            The student
	 */
	public void setStudent(String student) {
		this.student = student;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contact [district=" + district + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", student=" + student + ", type=" + type + ", id=" + id + "]";
	}

	
}