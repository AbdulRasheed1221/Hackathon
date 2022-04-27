package com.online.trading.app.payload;

import java.sql.Date;

import lombok.Data;

@Data
public class SignUpDto {
	private long id;
    private String user_name;
    private String id_document_name;
    private String id_document_number;
    private String email_id;
    private String phone_number;
    private String pan_number;
    private String password;
    private Date create_date;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
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
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
    
    
}
