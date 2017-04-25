package edu.qtech.prototype;

public class WorkExperience implements Cloneable{
        private String company;
        private String startDate;
        private String endDate;
        @Override
        public WorkExperience clone(){
        	WorkExperience wExperience = null;
        	try {
				wExperience = (WorkExperience) super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return wExperience;
        }
        
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
