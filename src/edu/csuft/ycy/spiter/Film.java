package edu.csuft.ycy.spiter;

public class Film  implements Comparable<Film> {
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
    /**
     * ����
     */
    String quote;
    String url;
    public String toCSV() {
    	return String.format("%d,%s,%d,%.1f\n",
    			id,
    			title,
    			num,
    			rating);
    }
   

	@Override
	public String toString() {
		return "Film [title=" + title + ", info=" + info + ", rating=" + rating + ", num=" + num + ", id=" + id
				+ ", poster=" + poster + ", quote=" + quote + ", url=" + url + "]";
	}


	@Override
	public int compareTo(Film o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
    
 
}
