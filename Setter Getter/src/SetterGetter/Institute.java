package SetterGetter;

public class Institute {
	private int instituteid;
	private String institutename;
	private String location;
	private String courseoffered;
    private short totalStudent;
    private long contactno;
    private String emailid;
    private float rating;
    private boolean isnearHome;
    private double fees;
  
    public void setInstituteid(int id) {
           instituteid=id;
    }
    public int getInstituteid() {
    	return instituteid;
    }
    public void setInstitutename(String name) {
    	institutename=name;
    }
    public String getInstitutename() {
    	return institutename;
    }
    public void setLocation(String l) {
    	location=l;
    }
    public String getLocation() {
    	return location;
    }
    public void setCourseoffered(String c) {
    	courseoffered=c;
    }
    public String getCourseoffered() {
    	return courseoffered;
    }
    public void setTotalStudent(short t) {
    	totalStudent=t;
    }
    public short getTotalStudent() {
    	return totalStudent;
    }
    public void setContactno(long no) {
    	contactno=no;
    }
    public long getContactno() {
    	return contactno;
    }
    public void setEmailid(String id) {
    	emailid=id;
    }
    public String getEmailid() {
    	return emailid;	
    }
    public void setRating(float f) {
    	rating=f;
    }
    public float getRating() {
    	return rating;
    }
    public void setIsNearHome(boolean b) {
    	isnearHome=b;
    }
    public boolean getIsNearHome() {
    	return isnearHome;
    }
    public void setFees(double d) {
    	fees=d;
    }
    public double getFees() {
    	return fees;
    }
}
