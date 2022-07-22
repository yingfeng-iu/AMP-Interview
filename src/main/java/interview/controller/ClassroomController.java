package interview.controller;

import java.util.ArrayList;
import java.util.List;

import interview.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import interview.model.Classroom;
import interview.repository.ClassroomRepository;
import interview.repository.CourseRepository;

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
	// URL: /classrooms/findAll
	@GetMapping("/classrooms/findAll")
	public List<Classroom> getAvailableClassrooms(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		Course course = courseRepository.findById(courseId);
		return (List<Classroom>) classroomRepository.findAvailableClassroomsByDepartment(course.getDepartment());
	}
        
    /**
     * Reserve an available classroom for the given course.
     * @param courseId ID of the given course.
     * @return classroom reserved
     */
	// URL: /classrooms/reserve
	@GetMapping("/classrooms/reserve")
	public Classroom reserveClassroom(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		Course course = courseRepository.findById(courseId);
		Classroom classroom = classroomRepository.findAvailableClassroomByDepartment(course.getDepartment());
		//throw error if no classroom found
		course.setClassroom(classroom);
		courseRepository.save(course);

//		classroom.setCourseID(courseId);
//		classroomRepository.save(classroom);
		return classroom;
	}

    /**
     * Reserve available classrooms for the given courses.
     * @param courseIds list of IDs of the given courses.
     * @return classrooms reserved
     */
	@GetMapping('/classrooms/reserveAll')
	// URL: /classrooms/reserveAll
	public List<Classroom> reserveClassrooms(@RequestParam List<Integer> courseIds) {
		// TODO replace below with implementation
		List<Classroom> classrooms = new ArrayList<Classroom>();
		//sort courses
		courseIds.forEach((courseId) -> {
			Course course = courseRepository.findById(courseId);
			Classroom classroom = classroomRepository.findAvailableClassroomByDepartment(course.getDepartment());
			if (classroom.isPresent()) {
				classroom.setCourseID(courseId);
				classroomRepository.save(classroom);
				classrooms.add(classroom);
			}// else throw error
		});
		return classrooms;
	}


}
