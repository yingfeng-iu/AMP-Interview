package interview.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.sql.Time;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String instructor;
	private String department;
	private Integer numberOfRegistrations;
	@ManyToOne
	@JoinColumn(name = 'classroomID')
	private Classroom classroom;
	private Integer startTime;
	private Integer weekDay;

}
