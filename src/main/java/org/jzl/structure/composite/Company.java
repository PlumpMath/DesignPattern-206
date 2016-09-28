package org.jzl.structure.composite;

import java.util.HashSet;
import java.util.Set;

public class Company {
	
	String name;
	private Set<Branch> branchs = new HashSet<Branch>();
	public Company(String name){
		this.name = name;
	}
	
	
	public void addBranch(Branch branch){
		branchs.add(branch);
	}
	
	public String getView(){
		StringBuffer buffer = new StringBuffer();
		buffer.append( "公司：" + name + "\r\n");
		buffer.append("\t部门：\r\n");
		for (Branch branch : branchs) {
			buffer.append("\t" + branch.getName() + "\r\n");
		}
		return buffer.substring(0);
	}
	
}
