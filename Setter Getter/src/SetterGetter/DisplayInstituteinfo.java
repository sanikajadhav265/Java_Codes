package SetterGetter;

public class DisplayInstituteinfo {
	public static void main(String[] args) {
		System.out.println("------------------Display Institite Information----------------");
		Institute i=new Institute();
		
		i.setInstituteid(1);
		i.setInstitutename("Adarsh Institute");
		i.setLocation("Near by Pune Station");
		i.setCourseoffered("Java Course");
		short s=50;
		i.setTotalStudent(s);
		i.setContactno(7798674532l);
		i.setEmailid("adarshinstitute23@gmail.com");
		i.setRating(4.5f);
		i.setIsNearHome(true);
		i.setFees(50000);
		
		System.out.println("Institute ID:"+i.getInstituteid());
		System.out.println("Institute Name:"+i.getInstitutename());
		System.out.println("Institute Location:"+i.getLocation());
		System.out.println("Course:"+i.getCourseoffered());
		System.out.println("Total Student:"+i.getTotalStudent());
		System.out.println("Contact Number:"+i.getContactno());
		System.out.println("Institute EmailId:"+i.getEmailid());
		System.out.println("Rating:"+i.getRating());
		System.out.println("Is Near By Home:"+i.getIsNearHome());
		System.out.println("Fees:"+i.getFees());
	}

}
