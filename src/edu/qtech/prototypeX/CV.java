package edu.qtech.prototypeX;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CV implements Cloneable,Serializable{
	private String name;
	private char sex;
	private int age;
	private WorkExperience wExperience;

	@Override
	public CV clone() {
		CV cv = null;
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
        try {
           ObjectOutputStream oos = new ObjectOutputStream(baos);
		   oos.writeObject(this);
		   oos.close();
		   ByteArrayInputStream bais = new ByteArrayInputStream(
           baos.toByteArray());
           ObjectInputStream ois = new ObjectInputStream(bais);
           cv = (CV) ois.readObject();
           ois.close();
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return cv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public WorkExperience getwExperience() {
		return wExperience;
	}

	public void setwExperience(WorkExperience wExperience) {
		this.wExperience = wExperience;
	}

	public String toString() {
		return "name:" + name + " sex:" + sex + " age:" + age + " wExperience:"
				+ wExperience.toString();
	}
}
