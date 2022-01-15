package OGS;

public class Student {
    String name, stuNo;
    int classes;
    Course fizik;
    Course mat;
    Course kimya;
    double avarage = 0.0;
    boolean isPass = false;

    public Student(String name, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if(mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0  || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Not girisleri tamamlanmamis.")
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " this.avarage);
            if(this.isPass) {
                System.out.println("Sinifi Gecti.");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    
    public void printNote() {
        System.out.println("-----------------");
        System.out.println("Ogrenci: " + this.name);
        System.out.println("Matematik notu: " + this.mat.note);
        System.out.println("Fizik notu: " + this.fizik.note);
        System.out.println("Kimya notu: " + this.kimya.note);
    }
}
