package com.financial.spend.analyzer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "customer")
public class CustomerInformation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customer_id;
	@Size(min = 2, message = "First Name should have atleast 2 characters")
	private String first_name;
	@Size(min = 2, message = "Last Name should have atleast 2 characters")
	private String last_name;
	@Length(min = 10, max = 10)
	private String contact_number;
	@Email
	private String email_id;

	private long adhar_number;

	public CustomerInformation() {

	}

	public CustomerInformation(long customer_id,
			@Size(min = 2, message = "First Name should have atleast 2 characters") String first_name,
			@Size(min = 2, message = "Last Name should have atleast 2 characters") String last_name,
			@Length(min = 10, max = 10) String contact_number, @Email String email_id, long adhar_number) {
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.contact_number = contact_number;
		this.email_id = email_id;
		this.adhar_number = adhar_number;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getAdhar_number() {
		return adhar_number;
	}

	public void setAdhar_number(long adhar_number) {
		this.adhar_number = adhar_number;
	}

	@Override
	public String toString() {
		return "CustomerInformation [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", contact_number=" + contact_number + ", email_id=" + email_id + ", adhar_number="
				+ adhar_number + "]";
	}

}
