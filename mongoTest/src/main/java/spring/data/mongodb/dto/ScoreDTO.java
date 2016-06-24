package spring.data.mongodb.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="score")
public class ScoreDTO {
	@Id
	String _id;
	String id;
	String name;
	String dept;
	String addr;
	int java;
	int servlet;
	int bonus;
	int spring;
	public ScoreDTO(){
		
	}
	public ScoreDTO(String _id, String id, String name, String dept, String addr, int java, int servlet, int bonus,
			int spring) {
		super();
		this._id = _id;
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.addr = addr;
		this.java = java;
		this.servlet = servlet;
		this.bonus = bonus;
		this.spring = spring;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getServlet() {
		return servlet;
	}
	public void setServlet(int servlet) {
		this.servlet = servlet;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	@Override
	public String toString() {
		return "ScoreDTO [_id=" + _id + ", id=" + id + ", name=" + name + ", dept=" + dept + ", addr=" + addr
				+ ", java=" + java + ", servlet=" + servlet + ", bonus=" + bonus + ", spring=" + spring + "]";
	}
	
}
