package com.app.onetomany;

public class Certificates {
	private int id;
	private String certificatName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCertificatName() {
		return certificatName;
	}

	public void setCertificatName(String certificatName) {
		this.certificatName = certificatName;
	}

	@Override
	public String toString() {
		return "Certificates [id=" + id + ", certificatName=" + certificatName + "]";
	}
	
}