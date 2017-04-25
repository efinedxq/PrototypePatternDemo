package edu.qtech.prototype;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkExperience workExperience = new WorkExperience();
        CV cv = new CV();
        workExperience.setCompany("青理工");
        workExperience.setStartDate("20160601");
        workExperience.setEndDate("20170301");
        cv.setName("张三");
        cv.setAge(22);
        cv.setSex('男');
        cv.setwExperience(workExperience);
        
        CV cloneCv = cv.clone();
        cloneCv.setName("李四");
        cloneCv.getwExperience().setCompany("山科");
        
        System.out.println(cloneCv.toString());
        System.out.println(cv.toString());
	}

}
