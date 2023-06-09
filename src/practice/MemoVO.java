package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO {
	
//	멤버 변수의 종류는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있는데 인스턴스 멤버 변수는 현재 클래스로 생성되는 모든 객체에서
//	독립된 기억 공간을 가지지만 정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.
	public static int count;
	private int no;				// 객체가 생성될 때 마다 자동으로 1씩 증가
	private String name;		
	private boolean gender;
	private String memo;
	private Date writeDate;		// 객체가 생성되는 순간의 날짜와 시간
	

	public MemoVO() {
		this("무명씨", false, "없음");			
	}

	public MemoVO(String name, boolean gender, String memo) {
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	
//	private 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할 수 없다.
//	이 규칙이 너무 엄격히 적용되므로 이 규칙에 대한 예외 지정을 getter & setter 메소드를 사용해서 한다.
//	getter는 private 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다.
//	setter는 private 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}	

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		return no + "." + name + "(" + (gender ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "에 남긴말 " + memo;
	}

	
}
