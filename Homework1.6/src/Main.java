public class Main 
{
    public static void main(String[] args) 
    {
        Adresa adresa1 = new Adresa("Strada Libertății 10", "București", "010203");
        Adresa adresa2 = new Adresa("Strada Primăverii 5", "Cluj-Napoca", "400500");

        Profesor profesor = new Profesor("Dr. Ion Popescu", adresa1);
        Student student1 = new Student("Ana Ionescu", adresa2);
        Student student2 = new Student("Mihai Georgescu", adresa1);

        Curs cursJava = new Curs("Java Programming", profesor);
        cursJava.addStudentToCourse(student1);
        cursJava.addStudentToCourse(student2);
        cursJava.printCourseDetails();

        // Schimbare adresă profesor
        profesor.setAdresa(new Adresa("Strada Universității 1", "Timișoara", "300100"));
        System.out.println("Adresa nouă a profesorului: " + profesor.adresa);

        // Schimbare profesor la curs
        Profesor profesorNou = new Profesor("Prof. Maria Dumitrescu", adresa2);
        cursJava.addTeacherToCourse(profesorNou);
        cursJava.printCourseDetails();
    }
}