package printable;

public class Todo implements Printable{
  String task;
  int priority;
  boolean done;

  public Todo(String task, int priority, boolean done) {
    this.task = task;
    this.priority = priority;
    this.done = done;
  }

  @Override
  public void printAllFields() {
    System.out.println("task: " + task + " priority: " + priority + " done: " + done);
  }
}
