package com.set;

public class Student {
	
	private int sid;
	private String sname;
	private float marks;
	
	public Student(int sid, String sname, float marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(marks);
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Float.floatToIntBits(marks) != Float.floatToIntBits(other.marks))
			return false;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n Student:- \n sid=" + sid + "\n sname=" + sname + "\n marks=" + marks + "";
	}
	
	
	

}
