package com.marta.LectorNoticias.reader;

import com.marta.LectorNoticias.service.ILogic;
import com.marta.LectorNoticias.service.LogicBBDD;
import com.marta.LectorNoticias.service.LogicRSS;

public class CreatorFactory {

	private static CreatorFactory instancia;
	
	private CreatorFactory() {
		// TODO Auto-generated constructor stub
	}
	public static CreatorFactory getInstancia() {
		if(instancia == null) {
			instancia = new CreatorFactory();

		}
		return instancia;
		
}
		 
	public ILogic getSource(String tipo) {
		 
		 if (tipo.equals("RSS")) { 
//			
			 return new LogicRSS();
		 }
		 else {
		
			 return new LogicBBDD();
		 }
		 
	 }
}
