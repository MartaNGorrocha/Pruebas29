package com.marta.LectorNoticias.facade;

import com.marta.LectorNoticias.service.ILogic;
import com.marta.LectorNoticias.service.LogicRSS;

public class Facade  {
	 
	private ILogic RSS ;
	
	public Facade() {
		RSS = new LogicRSS();
	}

	

}
