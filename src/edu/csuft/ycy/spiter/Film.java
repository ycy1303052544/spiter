package edu.csuft.ycy.spiter;

public class Film {
	/**
	 * ӰƬ����
	 * @author Administrator
	 */
	String title;
	/**
	 * �����Ϣ
	 */
	String info;
	/**
	 * ����
	 */
	double rating;
	/**
	 * ��������
	 */
	int num;
	/**
	 * ����
	 */
    int id;
    /**
     * ����
     */
    String poster;
	public String quote;
    /**
     * ����
     */
	@Override
	public String toString() {
		return "Film [title=" + title + ", info=" + info + ", rating=" + rating + ", num=" + num + ", id=" + id
				+ ", poster=" + poster + "]";
	}
    
 
}
