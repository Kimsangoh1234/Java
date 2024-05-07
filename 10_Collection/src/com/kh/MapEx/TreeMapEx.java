package com.kh.MapEx;

import java.util.TreeMap;

/*
TreeMap 이진검색트리 : 데이터 검색 삽입 삭제 연산을 빠르게 가능
키-값(key-value) 저장하는 자료구조
키를 기준으로 정렬해서 저장(정렬: 0~9,ㄱ~ㅎ,A~Z,a~z)

메서드
put(key, value)
get(key)		: 저장된 키에 있는 벨류 값을 전달
containskey(key): 키가 포함되있는지 확인
containsVale(Value):키가 포함되있는지 확인
remove(key)     : 저장된 키와 값을 삭제
size(			: 키-값 쌍의 개수 반환(저장되어있는)
isEmpty 			
 */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap();
		
		Integer[] keys = {1,2,3};
		String[] valuse= {"One,Two,Three"};
		System.out.println(tm);
		
		for(int i = 0; i<keys.length; i++) {
			tm.put(keys[i],valuse[i]);
		}
		System.out.println(tm);
		System.out.println(tm.get(2));
		tm.remove(3);
		System.out.println(tm);
		System.out.println(tm.containsKey(1));
		System.out.println(tm.size());
		System.out.println(tm.isEmpty());
		tm.clear();
		System.out.println(tm);
		
	}
}
