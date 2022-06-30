package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Classroom;
import repository.ClassroomRepository;
import repository.CourseRepository;

@RestController
public class ClassroomController {

    @Autowired  
    private CourseRepository courseRepository;
    
    @Autowired  
    private ClassroomRepository classroomRepository;

    /**
     * Find all available classroom for the given course.
     * @param courseId ID of the given course.
     * @return list of classrooms available
     */
	@GetMapping("/classrooms/findAll")
	public List<Classroom> getAvailableClassrooms(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		return null;
	}
    
    
    /**
     * Reserve an available classroom for the given course.
     * @param courseId ID of the given course.
     * @return classroom reserved
     */
	@PostMapping("/classrooms/reserve")
	public Classroom reserveClassroom(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		return null;
	}

    /**
     * Reserve available classrooms for the given courses.
     * @param courseIds list of IDs of the given courses.
     * @return classrooms reserved
     */
	@PostMapping("/classrooms/reserveAll")
	public List<Classroom> reserveClassrooms(@RequestParam List<Integer> courseIds) {
		// TODO replace below with implementation
		return null;
	}


}