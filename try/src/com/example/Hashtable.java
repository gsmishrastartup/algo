package com.example;


public class Hashtable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("123", "hello");
		ht.put("234", "helloaaa");
		ht.put("345", "helloaaa11");
		System.out.println(ht);
		System.out.println(ht.get("123"));
	}
	private Object[] table = new Object[20];
	
	public int hash(String key) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result%20;
	}

	public void put(String key, String value) {
		int hash = hash(key);
		if (table[hash] == null) {
			table[hash] = new NodeWithKey<String>(key, value);
		} else {
			NodeWithKey<String> node = (NodeWithKey<String>)table[hash];
			node.appendAtEnd(key, value);
		}
	}
	public String get(String key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		}
		NodeWithKey<String> node = (NodeWithKey<String>)table[hash];
		while (node != null) {
			if (node.key.equals(key)) {
				return node.data;
			} else {
				node = node.next;
			}
		}
		return null;
	}
}
