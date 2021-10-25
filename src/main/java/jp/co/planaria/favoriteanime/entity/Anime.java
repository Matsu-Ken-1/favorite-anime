package jp.co.planaria.favoriteanime.entity;

public class Anime {
	
	// アニメタイトルNo
	private int titleNo;
	// アニメタイトル
	private String title;
	// メモ
	private String memo;
	
	public Anime(int titleNo, String title, String memo) {
		this.titleNo = titleNo;
		this.title = title;
		this.memo = memo;
	}
	
	public int getTitleNo() {
		return titleNo;
	}
	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	

}
