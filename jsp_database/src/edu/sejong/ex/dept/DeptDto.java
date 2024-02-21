package edu.sejong.ex.dept;

//value Object = bean
/*이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) */
public class DeptDto {
private int deptno;
private String dname;
private String loc;

public DeptDto() {
	
}
public DeptDto(int deptno, String dname, String loc) {
	// TODO Auto-generated constructor stub
	this.deptno = deptno;
	this.dname = dname;
	this.loc = loc;
}
public DeptDto(int deptno) {
	this.deptno = deptno;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
}
