package edu.csuft.ycy.spiter;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * ץȡҳ����ӰƬ��Ϣ
 * @author Administrator
 *
 */
public class Spider implements Runnable{
	/**
	 * ҳ��·����URL��
	 */
	String url="";
	/**
	 * �洢ץȡ������
	 */
	ArrayList<Film> list;
	
   /**
    * ��������
    * @param url ҳ��·��
    * @param list �洢���ݵ��б�
    */
	public Spider(String url, ArrayList<Film> list) {
		super();
		this.url = url;
		this.list = list;
	}


	@Override
	public void run() {
		//���ִ��������̵߳�����
		String name=Thread.currentThread().getName();
		System.out.println(name+"�̣߳���ʼ��"+url);
		
		
		try {
			Document doc=Jsoup.connect(url).get();
			//���ĵ��������в��ҽڵ�
			Elements es =doc.select(".grid_view .item");
			//����Ԫ���б�
			for(Element e :es) {
				Film f =new Film();
				//ÿһ��ӰƬ
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
				System.out.println(name+":"+f);
			}
			
			System.out.println(name+"�̣߳���ɣ�"+url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
