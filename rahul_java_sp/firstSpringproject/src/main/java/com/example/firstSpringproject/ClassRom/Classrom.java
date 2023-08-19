package com.example.firstSpringproject.ClassRom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classrom {
	
	private int Roomno;
	private String Subject;
	@Autowired
	private Teachar teacher;
	public Classrom(int roomno, String subject, Teachar teacher) {
		super();
		Roomno = roomno;
		Subject = subject;
		this.teacher = teacher;
	}
	public Classrom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomno() {
		return Roomno;
	}
	public void setRoomno(int roomno) {
		Roomno = roomno;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public Teachar getTeacher() {
		return teacher;
	}
	public void setTeacher(Teachar teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Classrom [Roomno=" + Roomno + ", Subject=" + Subject + ", teacher=" + teacher + "]";
	}
	

}
