package com.dhiyan.MySpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void drive() {
		System.out.println("polam po.."+tyreAW);
	}
	
	@Autowired
	private Tyre tyreAW;

	public Tyre getTyreAW() {
		return tyreAW;
	}

	public void setTyreAW(Tyre tyreAW) {
		this.tyreAW = tyreAW;
	}
    
	

}
