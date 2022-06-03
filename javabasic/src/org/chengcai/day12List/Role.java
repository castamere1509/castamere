package org.chengcai.day12List;
/** 角色名  职业  特长  
 *  鲁班     射手  腿短
 *  李白     刺客  秀
 *  安琪拉  法师  漂亮
 */
public class Role {
	private String  roleName; //角色名 
	private String  job; //职业
	private String  Speciality;//特长
	

	public Role(){
		
	}
	
	public Role(String roleName, String job, String speciality) {
		this.roleName = roleName;
		this.job = job;
		this.Speciality = speciality;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	@Override
	public String toString() {
		return "[roleName=" + roleName + ", job=" + job + ", Speciality=" + Speciality + "]";
	}
	
}
