package greenfox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> stundents;
  private List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    stundents = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.stundents.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }

  public void info() {
    System.out.println(
        "The " + name + " cohort has " + stundents.size() + " students and " + mentors.size() +
            " mentors.");
  }
}
