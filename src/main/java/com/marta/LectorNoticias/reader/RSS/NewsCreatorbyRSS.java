package com.marta.LectorNoticias.reader.RSS;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.INewsCreator;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class NewsCreatorbyRSS implements INewsCreator {

	Logger LOG =LoggerFactory.getLogger(NewsCreatorbyRSS.class);
	
	final String feedURL = "https://www.xunta.gal/novas_rss.htm";
	List<New> news = new ArrayList<New>();
	
	public NewsCreatorbyRSS() {
		// TODO Auto-generated constructor stub
	}
	

	public List<New> creatingNews() {
	try {
		URL feedSource = new URL(feedURL);
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = input.build(new XmlReader(feedSource));
		 @SuppressWarnings("unchecked")
		List<SyndEntry> entries = feed.getEntries();
		 Iterator<SyndEntry> itEntries = entries.iterator();
		 
		 New notice; 
		 while (itEntries.hasNext()) {
			notice = new New();
		    SyndEntry entry = (SyndEntry) itEntries.next();
		  //  System.out.println("Title: " + entry.getTitle());
		    
		    notice.setTitle(entry.getTitle());
		    
		    String value = entry.getDescription().getValue();
		    notice.setDescription(value);
		    notice.setLink(entry.getLink());
		    notice.setPublicationDate((Date) entry.getPublishedDate());
		    LOG.info(notice.toString());
		    news.add(notice);
		 }
		
		//System.out.println(entry.getTitle());
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FeedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return news;
	  
}
}
