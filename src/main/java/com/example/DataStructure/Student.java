package com.example.DataStructure;

public class Student implements Comparable<Student>{
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equlas(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public int compareTo(Student o) {
		if(sno<o.sno) return -1;
		else if(sno==o.sno) return 0;
		else return 1;
	}
}
