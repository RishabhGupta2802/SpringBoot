package com.rg.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pinfo")

public class PatientInfo {
   @Value("10001")
   private Integer pid;
   

@Value("${pi.name}")
   private String pname;
   @Value("${pi.mobileNo}")
   private Long mobileNo;
   @Value("${pi.addrs}")
   private String paddrs;
   @Value ("#{dcc.xrayPrice+dcc.ctscanPrice+dcc.ecgPrice}")//SPEL expression
   private Double billAmount;
   
   @Value("#{dcc.ecgPrice<=0}")
   private Boolean ecgFree;
   
   @Value("${os.name}")
   private String osName;
   
   @Value("${Path}")
   private String pathData;
   
   public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPaddrs() {
		return paddrs;
	}

	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public Boolean getEcgFree() {
		return ecgFree;
	}

	public void setEcgFree(Boolean ecgFree) {
		this.ecgFree = ecgFree;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getPathData() {
		return pathData;
	}

	public void setPathData(String pathData) {
		this.pathData = pathData;
	}

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", paddrs=" + paddrs
				+ ", billAmount=" + billAmount + ", ecgFree=" + ecgFree + ", osName=" + osName + ", pathData="
				+ pathData + "]";
	}
   
   
}
