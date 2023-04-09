package com.nhatnvq.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="DichVu")
public class DichVu {
	@Id
	@Pattern(regexp = "DV*[0-9]{4}$", message="Bat dau bang DV va them 4 so o sau")
	@Column(name="ma_DichVu")
	private String maDichVu;
	
	private String tenDichVu;
	private String donViTinh;
	private double donGia;
	
	@OneToMany(mappedBy = "dichvu")
	private List<SuDungDichVu> sddv;

	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DichVu(@Pattern(regexp = "DV*[0-9]{4}$", message = "Bat dau bang DV va them 4 so o sau") String maDichVu,
			String tenDichVu, String donViTinh, double donGia, List<SuDungDichVu> sddv) {
		super();
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
		this.sddv = sddv;
	}

	public String getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public List<SuDungDichVu> getSddv() {
		return sddv;
	}

	public void setSddv(List<SuDungDichVu> sddv) {
		this.sddv = sddv;
	}
	
}
