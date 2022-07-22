package interview.model;

public class ClassroomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(name = "classroomId")
    private Classroom classroom;
    @JoinColumn(name = "courseId")
    private Course course;
    private Date startsAt;
    private Integer weekDay;
}
