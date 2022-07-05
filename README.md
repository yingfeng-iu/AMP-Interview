A simple web app server providing REST APIs for web clients to reserve classrooms for courses, using Spring Boot and H2 in-memory DB.

Assume we have a table of all courses for the semester, and a table of all classrooms on campus:
* All courses follow a weekly schedule, meet once a week at a certain hour on a certain weekday, and last 1 hour.
* The number of students registered for each course is known.
* Each course is offered by a particular department.
* Each classroom belongs to a particular department.
* The seat capacity of each classroom is known.

The classroom reservation must abide to the following rules:
* A classroom can only be reserved for courses offered by its own department.
* A classroom reserved for a course must be able to seat all students registered for that course.

Implement the following APIs for classroom reservation:
* Given a course, find all avaiable classrooms for it.
* Given a course, find an available classroom and reserve it for the course.
* Implement a strategy to reserve classrooms for all courses to the extent possible.

A skeleton of the project is provided on the master branch. Create a feature branch from master and complete the code. Feel free to add new or change existing fields, annotations, methods, classes etc. When you are done, commit your feature branch to the repository.
