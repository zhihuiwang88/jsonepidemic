package com.json.web.entity;

import java.io.Serializable;

public class EpidemicPersonCar implements Serializable {

	/**
	 * 人员和车辆
	 */
	private static final long serialVersionUID = 2001019877301468880L;

	private String con;
	private String qdm;
	private String qmc;
	private String qr;
	private String rfhm;
	private String dylx;
	private String dnhm;
	private String caxy;
	private String xbkm;
	private String fxhm;
	private String wgx;
	// pc
	private String kyamc;
	private String hip;
	private String szh;
	// 移动
	private String jhm;
	private String dmuz;
	private String wezc;

	@Override
	public String toString() {
		return "EpidemicPersonCar [con=" + con + ", qdm=" + qdm + ", qmc=" + qmc + ", qr=" + qr + ", rfhm=" + rfhm
				+ ", dylx=" + dylx + ", dnhm=" + dnhm + ", caxy=" + caxy + ", xbkm=" + xbkm + ", fxhm=" + fxhm
				+ ", wgx=" + wgx + ", kyamc=" + kyamc + ", hip=" + hip + ", szh=" + szh + ", jhm=" + jhm + ", dmuz="
				+ dmuz + ", wezc=" + wezc + "]";
	}

	public String getKyamc() {
		return kyamc;
	}

	public void setKyamc(String kyamc) {
		this.kyamc = kyamc;
	}

	public String getHip() {
		return hip;
	}

	public void setHip(String hip) {
		this.hip = hip;
	}

	public String getSzh() {
		return szh;
	}

	public void setSzh(String szh) {
		this.szh = szh;
	}

	public String getJhm() {
		return jhm;
	}

	public void setJhm(String jhm) {
		this.jhm = jhm;
	}

	public String getDmuz() {
		return dmuz;
	}

	public void setDmuz(String dmuz) {
		this.dmuz = dmuz;
	}

	public String getWezc() {
		return wezc;
	}

	public void setWezc(String wezc) {
		this.wezc = wezc;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public String getQdm() {
		return qdm;
	}

	public void setQdm(String qdm) {
		this.qdm = qdm;
	}

	public String getQmc() {
		return qmc;
	}

	public void setQmc(String qmc) {
		this.qmc = qmc;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public String getRfhm() {
		return rfhm;
	}

	public void setRfhm(String rfhm) {
		this.rfhm = rfhm;
	}

	public String getDylx() {
		return dylx;
	}

	public void setDylx(String dylx) {
		this.dylx = dylx;
	}

	public String getDnhm() {
		return dnhm;
	}

	public void setDnhm(String dnhm) {
		this.dnhm = dnhm;
	}

	public String getCaxy() {
		return caxy;
	}

	public void setCaxy(String caxy) {
		this.caxy = caxy;
	}

	public String getXbkm() {
		return xbkm;
	}

	public void setXbkm(String xbkm) {
		this.xbkm = xbkm;
	}

	public String getFxhm() {
		return fxhm;
	}

	public void setFxhm(String fxhm) {
		this.fxhm = fxhm;
	}

	public String getWgx() {
		return wgx;
	}

	public void setWgx(String wgx) {
		this.wgx = wgx;
	}

}
