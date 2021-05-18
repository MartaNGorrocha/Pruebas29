package com.marta.LectorNoticias;





import java.sql.Date;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.NewDTO;
import com.marta.LectorNoticias.reader.CreatorFactory;
import com.marta.LectorNoticias.service.ILogic;


/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args ){
    	
	Logger LOG =LoggerFactory.getLogger(App.class);
		
    
   	ILogic logic = CreatorFactory.getInstancia().getSource("RSS");
	Date date =new Date(2020-10-05);
   	logic.showAll();
	

   	logic.showByDate(date);
   	logic.showByString("Noticia1");
   	
   
   	
   	
   	
   	
	
	}
   
    	
    	
    	
    	
			
		
	}
    	
    	
    	
    	

