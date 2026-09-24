package first.robot.validations;

import java.lang.reflect.Method;

public class ValidationRunner {

  public static void main(String[] args) {
    run();
  }

  public static void run() {

    ValidationTests tests = new ValidationTests();

    int passed = 0;
    int total = 0;

    for (Method method : ValidationTests.class.getDeclaredMethods()) {

      if (!method.getName().contains("Test")) {
        continue;
      }

      if (method.getParameterCount() != 0) {
        continue;
      }

      if (method.getReturnType() != boolean.class) {
        continue;
      }

      total++;

      try {
        boolean result = (boolean) method.invoke(tests);

        if (result) {
          passed++;
        }

      } catch (Exception e) {
        // A test that throws counts as failed.
      }
    }

    System.out.println();
    System.out.println("Passed: " + passed + "/" + total);
  }
}
