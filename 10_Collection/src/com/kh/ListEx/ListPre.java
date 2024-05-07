package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
       ┌vector  : java1 버전 대에서 제일 먼저 등장해서 사용된 것
List   │ArrayList	: 검색에 좋음 데이터 삽입과 삭제가 빈번한 경우 부적합
	   └LinkdedList : 검색엔 부적합 데이터 삽입과 삭제에는 좋음

 */
public class ListPre {
// 생성자
	public ListPre() {
		
	}
// vector
	public void VectorEx() {
		//List<String> 백터 = new Vector<>();이렇게 사용해도 되지만 되도록 아래 사용 권장
		Vector<String> 백터 = new Vector<>();
		백터.add("자바");
		백터.add("파이썬");
		백터.add("c");
		System.out.println(백터);
	}
	public void LinkedEx() {
		LinkedList<String> 링크드리스트 = new LinkedList<>();
		링크드리스트.add("말");
		링크드리스트.add("호랑이");
		링크드리스트.add("송아지");
		System.out.println(링크드리스트);
	}
	public void ArrayEx() {
		ArrayList<String> 어레이리스트 = new ArrayList<>();
		어레이리스트.add("사과");
		어레이리스트.add("바나나");
		어레이리스트.add("포도");
		System.out.println(어레이리스트);
	}
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}

}
