
public class JobApplicationFormDTO {
	
	private String name;
	private String email;
	private Long phoneNo;
	private Long altPhoneNo;
	private String gender;
	private String qualification;
	private Integer yop;
	private String University;
	private String address;
	private String skills;
	private Double salary;
	private Integer exp;
	private String idProof;
	private String idProofNo;
	
	public JobApplicationFormDTO() {
		System.out.println("Default constructor");
	}
	
	public JobApplicationFormDTO(String name, String email, Long phoneNo, Long altPhoneNo, String gender, String qualification,
			Integer yop, String university, String address, String skills, Double salary, Integer exp, String idProof,
			String idProofNo) {
		
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.altPhoneNo = altPhoneNo;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		this.University = university;
		this.address = address;
		this.skills = skills;
		this.salary = salary;
		this.exp = exp;
		this.idProof = idProof;
		this.idProofNo = idProofNo;
	}





	@Override
	public String toString() {
		return "JobApplicationDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", altPhoneNo="
				+ altPhoneNo + ", gender=" + gender + ", qualification=" + qualification + ", yop=" + yop
				+ ", University=" + University + ", address=" + address + ", skills=" + skills + ", salary=" + salary
				+ ", exp=" + exp + ", idProof=" + idProof + ", idProofNo=" + idProofNo + "]";
	}





	
	
	
	

}


