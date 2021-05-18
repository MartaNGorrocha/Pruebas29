package com.marta.LectorNoticias.service;

import java.sql.Date;
import java.util.List;

import com.marta.LectorNoticias.model.New;

public interface ILogic {
	

	
	
	List<New> showAll();
	
	List<New> showByDate(java.sql.Date date);
	
	List<New> showByString(String text);
	
	
	

}
