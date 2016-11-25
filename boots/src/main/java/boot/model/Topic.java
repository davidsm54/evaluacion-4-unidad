package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "topics")
public class Topic implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50)
	private String name;
	
	@Column(name = "asigned_group", length = 50)
	private String asignedGroup;
	
	@Column(name = "name_teacher", length = 50)
	private String nameTeacher;

	public Topic(String name, String asignedGroup, String nameTeacher) {
		super();
		this.name = name;
		this.asignedGroup = asignedGroup;
		this.nameTeacher = nameTeacher;
	}

	public Topic() {
		this("", "", "");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getAsignedGroup() {
		return asignedGroup;
	}

	public void setAsignedGroup(String asignedGroup) {
		this.asignedGroup = asignedGroup;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	@Override
	public String toString() {
		return "TopicService [id=" + id + ", name=" + name + ", asignedGroup=" + asignedGroup + ", nameTeacher="
				+ nameTeacher + "]";
	}
		
}
