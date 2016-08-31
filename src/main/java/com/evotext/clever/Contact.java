package com.evotext.clever;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "district", "email", "name", "phone", "student", "type", "id" })
public class Contact {

	@JsonProperty("district")
	private String district;
	@JsonProperty("email")
	private String email;
	@JsonProperty("name")
	private String name;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("student")
	private String student;
	@JsonProperty("type")
	private String type;
	@JsonProperty("id")
	private String id;

	/**
	 * 
	 * @return The district
	 */
	@JsonProperty("district")
	public String getDistrict() {
		return district;
	}

	/**
	 * 
	 * @param district
	 *            The district
	 */
	@JsonProperty("district")
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * 
	 * @return The email
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 *            The email
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The phone
	 */
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone
	 *            The phone
	 */
	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	 * @return The student
	 */
	@JsonProperty("student")
	public String getStudent() {
		return student;
	}

	/**
	 * 
	 * @param student
	 *            The student
	 */
	@JsonProperty("student")
	public void setStudent(String student) {
		this.student = student;
	}

	/**
	 * 
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contact [district=" + district + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", student=" + student + ", type=" + type + ", id=" + id + "]";
	}

	
}