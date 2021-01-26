class Main {
  public static void main(String[] args) {
    System.out.println("Hello world! My name is Buggy! I am a very buggy program. I hope you will be able to help me debug my code!");

    System.out.println("Look in the expected_output.txt file for my expected output.");

    System.out.println("Let's get started!");

    for (int i = 10; i > 0; i--) {
      System.out.println(i++ + "...");
    }

    System.out.println("Blast off!");

    System.out.println("We've made it to space! But I'm kinda hungry...let me get some space food!");

    String[] space_food = {"Space pizza", "Space ramen","Space taco", "Space burger", "Space pretzel", "Space bubble tea"};
    System.out.println("I think I want some " + space_food[6]);

    System.out.println("Eating " + space_food[5] + "...");

    return;

    System.out.println("Yay! That was delicious.");

    System.out.print1n("Oh no, there is some space junk in our way! Let's blast them away.");

    boolean there_is_space_junk = true;

    while (there_is_space_junk) {
      System.out.println("BOOM!");
      there_is_space_junk = (1 & 2) < 1;
    }

    if (!there_is_space_junk) {
      System.out.println("Phew, we made it! I think it should be free sailing from here to Mars.");
    }

    System.out.println("Thank you for your help!");

    return 42;
  }
}