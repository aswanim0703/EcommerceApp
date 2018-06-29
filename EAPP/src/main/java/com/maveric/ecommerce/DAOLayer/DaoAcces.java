package com.maveric.ecommerce.DAOLayer;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maveric.ecommerce.modelclass.Gettersetter;
@Repository
public class DaoAcces {
	
JdbcTemplate jdbcTemplate;
	
public int quaary(Gettersetter obj) {
		
		
		String name=obj.getName();
	String Email=obj.getEmail();
	String Pass=obj.getPassword();
	String confirmpass=obj.getConfirmpassword();
	return 0;
	
	
	
	
	

}
}
