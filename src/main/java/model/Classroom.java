package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String address;
	private String department;
	private Integer seatCapacity;
	
}
