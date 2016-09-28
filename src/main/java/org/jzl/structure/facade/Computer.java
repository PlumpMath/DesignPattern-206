package org.jzl.structure.facade;

public class Computer {
	CPU cpu;
	Disk disk;
	Memory memory;
	public Computer(){
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}
	
	
	public void startup(){
		System.out.println("startup Computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished");
	}
	
	public void shutdown(){
		System.out.println("begin to close the computer!");
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
		System.out.println("computer closed");
	}
}
