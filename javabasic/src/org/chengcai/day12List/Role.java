package org.chengcai.day12List;
/** ��ɫ��  ְҵ  �س�  
 *  ³��     ����  �ȶ�
 *  ���     �̿�  ��
 *  ������  ��ʦ  Ư��
 */
public class Role {
	private String  roleName; //��ɫ�� 
	private String  job; //ְҵ
	private String  Speciality;//�س�
	

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
