package HospitalCon;

public class HospitalData {
             private int     doctorID;
             private String  doctorName;
             private String  doctorCategory;
             private double    doctorcontactNO;

            public int getdoctorId()
            {
         		return doctorID;
         	}
            public void setdoctorId(int doctorId) 
            {
         		this.doctorID = doctorId;
         	}
         	public String getdoctorName()
         	{
         		return doctorName;
         	}
         	public void setdoctorName(String doctorName)
         	{
         	   this.doctorName = doctorName;
         	}
         	public String  getdoctorCategory()
         	{
         		return doctorCategory;
         	}
         	public void setdoctorCategory(String doctorCategory)
         	{
         		this.doctorCategory = doctorCategory;
         	}
         	public double getdoctorcontactNO() 
         	{
         		return doctorcontactNO;
         	}
         	public void setdoctorcontactNO(double l) 
         	{
         		this.doctorcontactNO = l;
         	}
}
