package com.nhatnvq.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="May")
public class May {
	
	@Id
	@Pattern(regexp = "MAY*[0-9]{4}$", message="Bat dau bang MAY va them 4 so o sau")
	@Column(name="ma_May")
	private String maMay;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String viTri;
	
	private String trangThai;
	
	@OneToMany(mappedBy = "may")
	private List<SuDungMay> sdm;

	

	public List<SuDungMay> getSdm() {
		return sdm;
	}

	public void setSdm(List<SuDungMay> sdm) {
		this.sdm = sdm;
	}

	public May() {
		super();
		// TODO Auto-generated constructor stub
	}

	public May(String maMay, String viTri, String trangThai) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
	
}
