package com.maveric.ecommerce.LogicLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.ecommerce.modelclass.Gettersetter;
@Service
public class LogicClass {
	public String comparison(Gettersetter obj) {
		if((obj.getPassword()).equalsIgnoreCase(obj.getConfirmpassword())) {
		if((obj.getName().length()>=4)&&(obj.getEmail().length()>=5)){
		System.out.println("Entered in to the logic layer");
			
		}else {
			System.out.println("Vales are not entered in to the fileds");
		}
			
			
			
			
		}else {
			System.out.println("**Entered Password is incorrect**");
		}
		return null;
		}
	}


