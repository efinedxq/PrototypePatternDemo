package edu.qtech.prototype;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkExperience workExperience = new WorkExperience();
        CV cv = new CV();
        workExperience.setCompany("����");
        workExperience.setStartDate("20160601");
        workExperience.setEndDate("20170301");
        cv.setName("����");
        cv.setAge(22);
        cv.setSex('��');
        cv.setwExperience(workExperience);
        
        CV cloneCv = cv.clone();
        cloneCv.setName("����");
        cloneCv.getwExperience().setCompany("ɽ��");
        
        System.out.println(cloneCv.toString());
        System.out.println(cv.toString());
	}

}
