public interface StudentInter {
    void save(Student st) throws Exception;
    void update(Student st) throws Exception;
    void select(Student st) throws Exception;
    void delete(Student st) throws Exception;
    Student stud(int id) throws Exception;
}
