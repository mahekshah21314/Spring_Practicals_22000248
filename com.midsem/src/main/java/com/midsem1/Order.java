package com.midsem1;

public class Order {
	private int oid;
	private String oname;
	private String qty;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", qty=" + qty + "]";
	}
	
	

}
