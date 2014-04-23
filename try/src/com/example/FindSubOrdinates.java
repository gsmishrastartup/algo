package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindSubOrdinates {

  public static void main(String[] args) {
    List<Emp> list = new ArrayList<Emp>();
    Emp emp = new Emp("Mary", null);
    list.add(emp);
    emp = new Emp("John", "Mary");
    list.add(emp);
    emp = new Emp("Peter", "John");
    list.add(emp);
    emp = new Emp("David", "Mary");
    list.add(emp);
    emp = new Emp("Bill", "David");
    list.add(emp);
    emp = new Emp("Jane", "John");
    list.add(emp);
    emp = new Emp("Xavier", "Bill");
    list.add(emp);
    emp = new Emp("Nathan", "Jane");
    list.add(emp);

    FindSubOrdinates fs = new FindSubOrdinates();
    fs.addCollection(list);
    System.out.println("Bill -> " + fs.findSubOrdinates("Bill"));
    System.out.println("John -> " + fs.findSubOrdinates("John"));
  }

  private static class Emp {
    public Emp(String name, String reportTo) {
      this.name = name;
      this.reportTo = reportTo;
    }
    public String name;
    public String reportTo;

  }

  Map<String, List<String>> map = new ConcurrentHashMap<String, List<String>>();

  public void addCollection(Collection<Emp> coll) {
    for (Emp emp : coll) {
      if (emp.name == null || emp.reportTo == null) continue;
      List<String> list;
      if (map.get(emp.reportTo) == null) {
        list = new ArrayList<String>();
      } else {
        list = map.get(emp.reportTo);
      }
      if (!list.contains(emp.name)) list.add(emp.name);
      map.put(emp.reportTo, list);
    }
  }

  public List<String> findSubOrdinates(String reportTo) {
    List<String> list = findSubOrdinatesWithoutSelf(reportTo);
    list.add(reportTo);
    return list;
  }

  private List<String> findSubOrdinatesWithoutSelf(String reportTo) {
    List<String> subordinates = map.get(reportTo);
    if (subordinates == null) subordinates = new ArrayList<String>();
    List<String> subsubordinates = new ArrayList<String>();
    for (String name: subordinates) {
      subsubordinates.addAll(findSubOrdinatesWithoutSelf(name));
    }
    subordinates.addAll(subsubordinates);
    return subordinates;
  }
}