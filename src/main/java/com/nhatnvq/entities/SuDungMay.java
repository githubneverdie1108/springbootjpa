package com.nhatnvq.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SuDungMay")
public class SuDungMay {
	
	private Date ngayBatDauSuDung;
	
	private Date gioBatDauSuDung;
	
	@Id
	private String thoiGianSuDung;
	
	@ManyToOne
	@JoinColumn(name = "ma_KH", nullable = true)
	private KhachHang khachHang;
	
	@ManyToOne
	@JoinColumn(name = "ma_May", nullable = true)
	private May may;
	
	
	public SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getNgayBatDauSuDung() {
		return ngayBatDauSuDung;
	}

	public void setNgayBatDauSuDung(Date ngayBatDauSuDung) {
		this.ngayBatDauSuDung = ngayBatDauSuDung;
	}

	public Date getGioBatDauSuDung() {
		return gioBatDauSuDung;
	}

	public void setGioBatDauSuDung(Date gioBatDauSuDung) {
		this.gioBatDauSuDung = gioBatDauSuDung;
	}

	public String getThoiGianSuDung() {
		return thoiGianSuDung;
	}

	public void setThoiGianSuDung(String thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public SuDungMay(Date ngayBatDauSuDung, Date gioBatDauSuDung, String thoiGianSuDung, KhachHang khachHang, May may) {
		super();
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.gioBatDauSuDung = gioBatDauSuDung;
		this.thoiGianSuDung = thoiGianSuDung;
		this.khachHang = khachHang;
		this.may = may;
	}

	
	
	
}
