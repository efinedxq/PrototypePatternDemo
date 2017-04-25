package edu.qtech.prototype;

public class CV implements Cloneable {
	private String name;
	private char sex;
	private int age;
	private WorkExperience wExperience;

	@Override
	public CV clone() {
		CV cv = null;
		try {
			// «≥∏¥÷∆
			cv = (CV) super.clone();
			// …Ó∏¥÷∆
			wExperience = this.wExperience.clone();
		} catch (CloneNotSupportedException e) {
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
