package first.robot.validation;

public class ValidationRunner {

  public static void main(String[] args) {

    run();
  }

  public static void run() {

    ValidationTests tests = new ValidationTests();

    int passed = 0;
    int total = 0;

    total++;
    if (tests.configurationTestA()) {
      passed++;
    }

    total++;
    if (tests.configurationTestB()) {
      passed++;
    }

    total++;
    if (tests.autoTestA()) {
      passed++;
    }

    System.out.println();
    System.out.println("=====================");
    System.out.println("Validation Results");
    System.out.println("=====================");
    System.out.println("Passed: " + passed);
    System.out.println("Total:  " + total);
    System.out.println("Score:  " + passed + "/" + total);
    System.out.println();
  }
}
