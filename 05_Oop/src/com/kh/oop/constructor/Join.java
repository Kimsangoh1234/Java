package com.kh.oop.constructor;
//1. 회원가입
public class Join {
	//필드 회원번호 아이디 연락처
	public int memberNo;
	public String memberId;//닉네임
	public String memberName;
	public String phoneNumber;
	
	//생성자 기본 필수
	public Join( ) {
		
	}
	public Join(int a, String b, String d, String c) {
		this.memberNo=a;
		this.memberId=b;
		this.memberName=d;
		this.phoneNumber=c;
	}
	//메서드 = 클래스 안에 존재하고, 특정 기닁을 할 수 있도록 묶어놓은 코드 모음
	//void메서드 : 결과를 전달하지 안흥ㅁ
	public void memberInfo() {
		System.out.println("멤버 번호 : " +memberNo);
		System.out.println("멤버 ID : "+memberId);
		System.out.println("멤버 이름 : "+memberName);
		System.out.println("멤버 폰번 : "+phoneNumber);
		
	}
	
	public static void main(String[] args) {
		System.out.println("===kh 쇼핑 회원 정보 확인===");
		
		//회원 1에 대한 정보 확인
		//회원가입 객체 생성
		Join member1 = new Join();
		
		//필수가 없음
		member1.memberId="직장인";
		member1.memberName="동그라미";
		member1.phoneNumber="010-1111-2222";
		member1.memberInfo();
		System.out.println("----------");
		Join member2 = new Join();
		
		member2.memberId ="학생휴먼";
		member2.memberName ="홍길동";
		member2.memberInfo();
		System.out.println("----------");
		Join member3 = new Join(3,"파워보이","박영희","010-1111-2222");
		member3.memberInfo();
		System.out.println("----------");
		
		//회원가입할 때 필수로 작성해야하는 필수 작성이 생김
		
		//member4 member5 회원가입 시킴
		//member4 기본 생성자 가지고 회원가입시키기
		//멤버번호 멤버 이름만 넣어서 memberinfo()member4
		// 4
		Join member4 = new Join();
		member4.memberNo=4;
		member4.memberId="블랙아담";
		member4.memberName="블랙아담";
		member4.memberInfo();
		System.out.println("----------");
		//member5필수 생성자 가지고 회원가입 시키기
		//member5 info()
		//5 "슈퍼맨" "딘 케인" "010-1938-1932"
		Join member5 = new Join(5, "슈퍼맨","딘 케인","010-1938-1932");
		member5.memberInfo();
	}

}
