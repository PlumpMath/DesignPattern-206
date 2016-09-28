package org.jzl.structure.composite;


public class CompanyTest {
	@org.junit.Test
	public void test(){
		Company company = new Company("小风");
		company.addBranch(new Branch("a"));
		company.addBranch(new Branch("b"));
		
		System.out.println(company.getView());
	}
}
