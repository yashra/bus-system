package com.capg.bank.bean;

public class Wbank {

	private String name;
	private String nom_name;
	private String dob;
	private String pan_no;
	private long ad_no;
	private String address;
	private String mob_no;
	private int pincode;
	private final String ifsc_code="WBAN0000143";
	private String email;
	private double balance;
	private String acc_type;
	public Wbank() {}
	public Wbank(String name, String nom_name, String dob, String pan_no, long ad_no, String address, String mob_no,
			int l,String email,double balance,String acc_type) {
		super();
		this.name = name;
		this.nom_name = nom_name;
		this.dob = dob;
		this.pan_no = pan_no;
		this.ad_no = ad_no;
		this.address = address;
		this.mob_no = mob_no;
		this.pincode = l;
		this.email=email;
		this.balance = balance;
		this.acc_type=acc_type;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNom_name() {
		return nom_name;
	}
	public void setNom_name(String nom_name) {
		this.nom_name = nom_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public long getAd_no() {
		return ad_no;
	}
	public void setAd_no(long ad_no) {
		this.ad_no = ad_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Wbank [name=" + name + ", nom_name=" + nom_name + ", dob=" + dob + ", pan_no=" + pan_no + ", ad_no="
				+ ad_no + ", address=" + address + ", mob_no=" + mob_no + ", pincode=" + pincode + ", ifsc_code="
				+ ifsc_code + ", email=" + email + ", acc_num=" + ", balance=" + balance + ", acc_type="
				+ acc_type + "]";
	}
	
		
}
