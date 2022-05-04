package Home;

public class Student {
    private static StringBuilder name;
    private static int course;
    private static int grade;


    Student(StringBuilder name, int course, int grade) {
        setName(name);
        setCourse(course);
        setGrade(grade);
    }

    public static StringBuilder getName() {
        System.out.println("Имя " + name);
        return name;
    }

    public void setName(StringBuilder s) {
        if (s.length() > 3) {
            name = s;
            System.out.println("Имя принято " + name);
        } else {
            System.out.println("Имя не принято");
        }
    }

    public static int getCourse() {
        System.out.println("Курс " + course);
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            course = i;
            System.out.println("Курс принят " + course);

        } else {
            System.out.println("Курс направильный ");
        }
    }

    public static int getGrade() {
        System.out.println("Оценка " + grade);
        return grade;
    }

    public void setGrade(int g) {
        if (g > 0 && g < 11) {
            grade = g;
            System.out.println("Оценка принята " + grade);
        } else {
            System.out.println("Оценка не принята ");
        }
    }

    public static void showInfo() {

        System.out.println("Имя :" + getName() + " Курса " + getCourse() + "  Ср. Оценкка " + getGrade());

    }

}

class TestStudent extends Student {

    TestStudent(StringBuilder name, int course, int grade) {
        super(name, course, grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student(new StringBuilder("Nina"),2,10);
        s1.showInfo();

    }
}
