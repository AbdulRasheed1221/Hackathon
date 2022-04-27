package com.online.trading.app.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Size(min = 2, message = "User Name should have atleast 2 characters")
	@Column(name = "user_name")
	private String username;
	@Size(min = 2, message = "Document Name should have atleast 2 characters")
	private String id_document_name;
	private String id_document_number;
	@Column(name = "email_id")
	private String email;
	@Length(min = 10, max = 10)
	private String phone_number;
	private String pan_number;
	private String password;
	private LocalDate create_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_document_name() {
		return id_document_name;
	}

	public void setId_document_name(String id_document_name) {
		this.id_document_name = id_document_name;
	}

	public String getId_document_number() {
		return id_document_number;
	}

	public void setId_document_number(String id_document_number) {
		this.id_document_number = id_document_number;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getCreate_date() {
		return create_date;
	}

	public void setCreate_date(LocalDate localDate) {
		this.create_date = localDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
