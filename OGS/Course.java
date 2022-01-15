public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    String note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.print ("İslem basarili");
        } else {
            System.out.print(t.name + " Akademisyeni bu dersi veremez.");

        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır. ")
        }
    }
}
