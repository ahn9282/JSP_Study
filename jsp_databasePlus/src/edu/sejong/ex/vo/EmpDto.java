package edu.sejong.ex.vo;

/*
  이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2) 
*/
public class EmpDto {
	
	private int empno;
	private String ename;
	private  String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int deptno;
	private String comm;
	private String manager;
	private String dname;
	
	public EmpDto() {}

	public EmpDto(int empno, String ename, String job, int mgr, String hiredate, int sal, String comm,int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.comm=comm;
	}
	public EmpDto(int empno, String ename, String job, int mgr, String hiredate, int sal ,int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
	}
	public EmpDto(int empno, String ename, String job, 
			String manager, String hiredate, String comm,
			int sal ,String dname) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.manager = manager;
		this.hiredate = hiredate;
		this.sal = sal;
		this.dname = dname;
		this.comm=comm;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
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

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		return "부서번호"+getEmpno()+
				" 이름:"+getEname()+
				" 직종:"+getJob()+
				" 사번:"+getMgr()+
				" 입사날짜:"+getHiredate()+
				" 월급:"+getSal()+
				" 부서번호:"+getDeptno()+
				" 커미션 :"+getComm();
		
	}
}
