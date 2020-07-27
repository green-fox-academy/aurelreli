package teacherstudent;

public class Student {
  public void learn() {
    System.out.println("the student is learning");
  }
  public void question(Teacher teacher) {
    teacher.answer();
  }
}
