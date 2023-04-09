package com.nhatnvq.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name ="KhachHang")
public class KhachHang {
	@Id
	@Pattern(regexp = "KH*[0-9]{4}$", message = "Bắt đầu bằng KH và thêm 4 số")
	@Column(name="ma_KH")
	private String maKhachHang;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String tenKhachHang;
	
	@Column(columnDefinition = "nvarchar(100)", nullable = true)
	private String diaChi;
	
	@Pattern(regexp = "^[0-9]{10}", message ="Số điện thoại di động gồm 10 số")
	private String soDienThoai;
	
	private String diaChiEmail;
	
	@OneToMany(mappedBy = "khachHang")
	private List<SuDungMay> sdm;
	@OneToMany(mappedBy = "khachHang")
	private List<SuDungDichVu> sddv;
	
	
	
	
	public List<SuDungDichVu> getSddv() {
		return sddv;
	}

	public void setSddv(List<SuDungDichVu> sddv) {
		this.sddv = sddv;
	}

	public List<SuDungMay> getSdm() {
		return sdm;
	}

	public void setSdm(List<SuDungMay> sdm) {
		this.sdm = sdm;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChiEmail() {
		return diaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
	}

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(@Pattern(regexp = "KH*[0-9]{4}$") String maKhachHang, String tenKhachHang, String diaChi,
			@Pattern(regexp = "^[0-9]{10}", message = "Số điện thoại di động gồm 10 số") String soDienThoai,
			@Email(message = "Địa chỉ Email không chính xác") String diaChiEmail) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diaChiEmail = diaChiEmail;
	}
	
	
}
