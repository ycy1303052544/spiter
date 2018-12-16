package edu.csuft.ycy.spiter;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 
 * @author Administrator
 *
 */

public class App {
	
	//alt+/
	public static void main(String[] args) {
		
		//目标 URL
		String url="https://movie.douban.com/top250";
				//使用 JSOUP 抓取文档
		
		
	    try {
			Document doc=Jsoup.connect(url).get();
			
			Elements es =doc.select(".grid_view .item");
			System.out.println(es.size());
			
			for(Element e :es) {
				//每一部影片
				Element t=e.select(".title").first();
				String num =e.select(".star span").last().text();
				System.out.println(t.text()+","+num);
			}
			
			
//			  String title=doc.title();
//			  String data=doc.data();
//			    
//			  System.out.println(title);
//			  System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
