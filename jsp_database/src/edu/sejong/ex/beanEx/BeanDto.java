package edu.sejong.ex.beanEx;

public class BeanDto {
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	public BeanDto() {

	}

	public BeanDto(String empno, String ename, String job, String mgr, String hiredate, String sal, String comm,
			String deptno) {
		this.ename = ename;
		this.empno=empno;
		this.job=job;
		this.mgr=mgr;
		this.hiredate=hiredate;
		this.sal=sal;
		this.comm=comm;
		this.deptno=deptno;

	}


	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "부서번호 :  " +this.getDeptno()+ 
				" || 사원 이름 : " +this.getEname()+ 
				" || 직업 : " +this.getJob()+ 
				" || 커미션 : " +this.getComm()+ 
				" || 매니저 : " +this.getMgr()+ 
				" || 사원번호 : " +this.getEmpno()+ "<br>";
	}

}
