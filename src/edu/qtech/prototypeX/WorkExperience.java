package edu.qtech.prototypeX;

import java.io.Serializable;

public class WorkExperience implements Serializable{
        private String company;
        private String startDate;
        private String endDate;
        
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
        public String toString(){
        	return "[company:"+company+" date:"+startDate+"-"+endDate+"]";
        }
}
