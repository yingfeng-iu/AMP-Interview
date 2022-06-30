package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import model.Classroom;

@RepositoryRestResource(collectionResourceRel = "classrooms", path = "classrooms")
public interface ClassroomRepository extends CrudRepository<Classroom, String> {

}

