package edu.csuft.ycy.spiter;

import java.io.IOException;
import java.util.ArrayList;

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
			
			ArrayList<Film> list=new ArrayList<>();
			
			for(Element e :es) {
				Film f =new Film();
				//每一部影片
				f.id=Integer.parseInt(e.select(".pic em") .first().text());
				f.poster=e.select("img").first().attr("src");
				f.info=e.select(".bd p").first().text();
				f.title=e.select(".title").first().text();
				f.rating=Double.parseDouble(e.select(".rating_num").first().text());
				String num =e.select(".star span").last().text();
				f.num=Integer.parseInt(num.substring(0,num.length()-3));
				f.quote=e.select(".inq").first().text();
//				Element t=e.select(".title").first();
//				String num =e.select(".star span").last().text();
//				System.out.println(t.text()+","+num);
				
//				f.id
//				f.title
				list.add(f);
				System.out.println(f);
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
