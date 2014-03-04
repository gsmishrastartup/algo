package com.example;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		String s = "abcd";
		
		Permutations p = new Permutations();
		List<String> perms = p.getPerms(s);
		System.out.println(perms);
		System.out.println(perms.size());
	}

	private List<String> getPerms(String s) {
		List<String> perms = new ArrayList<String>();
		if (s == null) return null;
		if (s.equals("")) {
			perms.add("");
			return perms;
		}
		String first = s.substring(0, 1);
		String remainder = s.substring(1);
		List<String>words = getPerms(remainder);
		for (String word: words) {
			for (int i=0;i<=word.length();i++) {
				String newperm = insertChar(first, word, i);
				perms.add(newperm);
			}
		}
		return perms;
	}

	private String insertChar(String first, String perm, int i) {
		String newperm1 = perm.substring(0, i);
		String newperm2 = perm.substring(i);
		String newperm = newperm1 + first + newperm2;
		return newperm;
	}
}
