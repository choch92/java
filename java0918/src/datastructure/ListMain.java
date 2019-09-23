package datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain {

	public static void main(String[] args) {
		// 문자열을 저장하는 Stack을 생성
		Stack<String> stack = new Stack<>();
		// 데이터 삽입은 push
		stack.push("색상 보정");
		stack.push("레이어 추가");

		// 데이터를 삭제하면서 가져오기는 pop
		String new_data = stack.pop();
		System.out.printf("%s\n", new_data);
		// pop 대신에 peek를 사용하면 2개의 결과가 동일
		new_data = stack.peek();
		System.out.printf("%s\n", new_data);
		
		// 써져있는 순서대로 데이터를 저장하는 List
		LinkedList<String> li = new LinkedList<>();
		li.add("170");
		li.add("98");
		li.add("105");
		// LinkedList는 순서대로 출력
		for (String temp : li) {
			System.out.printf("%s\t", temp);
		}
		System.out.printf("\n===================\n");
		
		// 우선 순위를 가지고 데이터를 저장하는 큐
		PriorityQueue<String> pr = new PriorityQueue<>();
		pr.add("170");
		pr.add("98");
		pr.add("105");
		// PriorityQueue는 크기 순서대로 출력
		System.out.printf("%s\n", pr.poll());
		System.out.printf("%s\n", pr.poll());
		System.out.printf("%s\n", pr.poll());
		/*
		 * for(String temp : pr) { System.out.printf("%s\t", temp); }
		 */
	}
}
