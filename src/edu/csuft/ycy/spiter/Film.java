package edu.csuft.ycy.spiter;

public class Film {
	/**
	 * 影片名称
	 * @author Administrator
	 */
	String title;
	/**
	 * 相关信息
	 */
	String info;
	/**
	 * 评分
	 */
	double rating;
	/**
	 * 评分人数
	 */
	int num;
	/**
	 * 排名
	 */
    int id;
    /**
     * 海报
     */
    String poster;
	public String quote;
    /**
     * 短评
     */
	@Override
	public String toString() {
		return "Film [title=" + title + ", info=" + info + ", rating=" + rating + ", num=" + num + ", id=" + id
				+ ", poster=" + poster + "]";
	}
    
 
}
