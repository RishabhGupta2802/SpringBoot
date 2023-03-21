package com.rg.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dcc")
public class DiagnosticCenterCatalog {
    @Value("${dc.xrayRate}")
    private Double xrayPrice;
    @Value("${dc.ctscanRate}")
    private Double ctscanPrice;
    @Value("${dc.mriScanRate}")
    private Double mriScanPrice;
    @Value("${dc.ecgRate}")
    private Double ecgPrice;
    
    
  //Setter and Getter method for SPEL Operation
	public Double getXrayPrice() {
		return xrayPrice;
	}
	public void setXrayPrice(Double xrayPrice) {
		this.xrayPrice = xrayPrice;
	}
	public Double getCtscanPrice() {
		return ctscanPrice;
	}
	public void setCtscanPrice(Double ctscanPrice) {
		this.ctscanPrice = ctscanPrice;
	}
	public Double getMriScanPrice() {
		return mriScanPrice;
	}
	public void setMriScanPrice(Double mriScanPrice) {
		this.mriScanPrice = mriScanPrice;
	}
	public Double getEcgPrice() {
		return ecgPrice;
	}
	public void setEcgPrice(Double ecgPrice) {
		this.ecgPrice = ecgPrice;
	}
    
    
    
    
}
