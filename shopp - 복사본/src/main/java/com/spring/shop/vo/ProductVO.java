package com.spring.shop.vo;

public class ProductVO {
	private int pdnum;
	private int catecode;
	private String pdname;
	private String pdcontent;
	private int pdprice;
	private int pdcnt;
	private String pdimg1;
	
	
	public int getPdnum() {
		return pdnum;
	}
	public void setPdnum(int pdnum) {
		this.pdnum = pdnum;
	}
	public int getCatecode() {
		return catecode;
	}
	public void setCatecode(int catecode) {
		this.catecode = catecode;
	}
	public String getPdname() {
		return pdname;
	}
	public void setPdname(String pdname) {
		this.pdname = pdname;
	}
	public String getPdcontent() {
		return pdcontent;
	}
	public void setPdcontent(String pdcontent) {
		this.pdcontent = pdcontent;
	}
	public int getPdprice() {
		return pdprice;
	}
	public void setPdprice(int pdprice) {
		this.pdprice = pdprice;
	}
	public int getPdcnt() {
		return pdcnt;
	}
	public void setPdcnt(int pdcnt) {
		this.pdcnt = pdcnt;
	}
	public String getPdimg1() {
		return pdimg1;
	}
	public void setPdimg1(String pdimg1) {
		this.pdimg1 = pdimg1;
	}
	@Override
	public String toString() {
		return "ProductVO [pdnum=" + pdnum + ", catecode=" + catecode + ", pdname=" + pdname + ", pdcontent="
				+ pdcontent + ", pdprice=" + pdprice + ", pdcnt=" + pdcnt + ", pdimg1=" + pdimg1 + "]";
	}
	
	
	

}
