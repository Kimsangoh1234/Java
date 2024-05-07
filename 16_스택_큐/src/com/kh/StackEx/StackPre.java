package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	//main 메인메서드에서 작성
	public static void main(String[] args) {
		//stack을 활용해서 10 30 50 40 20 을 넣고 push 사용
		Stack <Integer> 스택 = new Stack();
		//맨 위 값을 지우고 반환해서 확인
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		System.out.println(스택);
		
		int 탑 = 스택.pop();
		System.out.println(탑);
		
		//현재 맨 위 값 확인
		int 맨위값 = 스택.peek();
		System.out.println(맨위값);
		
		//비어있는지 확인
		boolean 값유무 = 스택.isEmpty();
		System.out.println(값유무);
		
		//크기는 몇인지 확인
		int 사이즈 = 스택.size();
		System.out.println(사이즈);
		
		
	}
	
}
