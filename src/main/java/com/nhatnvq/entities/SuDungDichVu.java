package com.nhatnvq.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SuDungDichVu")
public class SuDungDichVu {
	
	private Date ngaySuDungDichVu;
	private Date gioSuDungDichVu;
	@Id
	private String soLuong;
	@ManyToOne
	@JoinColumn(name = "ma_KH", nullable = true)
	private KhachHang khachHang;
	@ManyToOne
	@JoinColumn(name = "ma_DichVu", nullable = true)
	private DichVu dichvu;

	public SuDungDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuDungDichVu(Date ngaySuDungDichVu, Date gioSuDungDichVu, String soLuong, KhachHang khachHang, DichVu dichvu) {
		super();
		this.ngaySuDungDichVu = ngaySuDungDichVu;
		this.gioSuDungDichVu = gioSuDungDichVu;
		this.soLuong = soLuong;
		this.khachHang = khachHang;
		this.dichvu = dichvu;
	}

	public Date getNgaySuDungDichVu() {
		return ngaySuDungDichVu;
	}

	public void setNgaySuDungDichVu(Date ngaySuDungDichVu) {
		this.ngaySuDungDichVu = ngaySuDungDichVu;
	}

	public Date getGioSuDungDichVu() {
		return gioSuDungDichVu;
	}

	public void setGioSuDungDichVu(Date gioSuDungDichVu) {
		this.gioSuDungDichVu = gioSuDungDichVu;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public DichVu getDichvu() {
		return dichvu;
	}

	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}
	
	
}
