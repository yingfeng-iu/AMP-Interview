package interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import interview.model.Classroom;

@RepositoryRestResource(collectionResourceRel = "classrooms", path = "classrooms")
public interface ClassroomRepository extends CrudRepository<Classroom, String> {
    @Query("SELECT c FROM Classroom c WHERE c.department =?1 and c.courseID=NULL")
    List<Classroom> findAvailableClassroomsByDepartment(String department);

    @Query("SELECT c FROM Classroom c WHERE c.department =?1 and c.courseID=NULL limit 1")
    Classroom findAvailableClassroomByDepartment(String department);
}

