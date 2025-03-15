import java.util.ArrayList;
import java.util.List;

public class Curs {
	private String numeCurs;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    // Adăugare student
    public void addStudentToCourse(Student student) {
        studenti.add(student);
        System.out.println("Studentul " + student.getNume() + " a fost adăugat la cursul " + numeCurs);
    }

    // Eliminare student
    public void removeStudentFromCourse(Student student) {
        studenti.remove(student);
        System.out.println("Studentul " + student.getNume() + " a fost eliminat din cursul " + numeCurs);
    }

    // Schimbare profesor
    public void addTeacherToCourse(Profesor profesor) {
        this.profesor = profesor;
        System.out.println("Profesorul " + profesor.getNume() + " predă acum cursul " + numeCurs);
    }

    public void removeTeacherFromCourse() {
        System.out.println("Profesorul " + profesor.getNume() + " nu mai predă cursul " + numeCurs);
        this.profesor = null;
    }

    public void printCourseDetails() {
        System.out.println("Curs: " + numeCurs);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNume() : "Niciun profesor"));
        System.out.println("Studenți înscriși: " + studenti.size());
    }
}
