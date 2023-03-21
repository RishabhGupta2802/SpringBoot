package com.rg.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MenuItemPrice {
    @Value("${menu.dosarate}")
	private Float dosaPrice;
    @Value("${menu.idlyrate}")
    private Float idlyPrice;
    @Value("${menu.poharate}")
    private Float pohaPrice;
    @Value("${menu.vprate}")
    private Float vadaPavPrice;
	public Float getDosaPrice() {
		return dosaPrice;
	}
	public void setDosaPrice(Float dosaPrice) {
		this.dosaPrice = dosaPrice;
	}
	public Float getIdlyPrice() {
		return idlyPrice;
	}
	public void setIdlyPrice(Float idlyPrice) {
		this.idlyPrice = idlyPrice;
	}
	public Float getPohaPrice() {
		return pohaPrice;
	}
	public void setPohaPrice(Float pohaPrice) {
		this.pohaPrice = pohaPrice;
	}
	public Float getVadaPavPrice() {
		return vadaPavPrice;
	}
	public void setVadaPavPrice(Float vadaPavPrice) {
		this.vadaPavPrice = vadaPavPrice;
	}
    
}
