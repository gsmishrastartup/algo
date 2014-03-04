package com.example;

public class ProperlyParenthesized {

	public static void main(String[] args) {
		ProperlyParenthesized pp = new ProperlyParenthesized();
		
		String str = "abc(()sjjs)ssjj";
		
		char[] chars = str.toCharArray();
		Stack st = new Stack();
		boolean ok = true;
		for (int i=0; i < chars.length; i++) {
			char thisChar = chars[i];
			if (thisChar == '(') {
				st.push(1);
			} else if (thisChar == ')') {
				try {
					st.pop();
				} catch (Exception e) {
					ok = false;
					//e.printStackTrace();
				}
			}
		}
		if (ok && st.isEmpty()) {
			System.out.println("OK");
		} else {
			System.out.println("Not OK");
		}
	}
}
