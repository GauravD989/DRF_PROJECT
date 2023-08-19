package com.example.firstSpringproject.ClassRom;

import org.springframework.stereotype.Component;

@Component
public class Teachar {
	private int tid;
	private String tname;
	public Teachar(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Teachar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Teachar [tid=" + tid + ", tname=" + tname + "]";
	}
	

}
