package githubgreeter;

import static githubgreeter.GitHubGreeter.welcome;
import static githubgreeter.GitHubGreeter.wishes;

public class Main{
  public static void main(String[] args) {
    // Instantiate a GitHubGreeter object


    GitHubGreeter greeter = new GitHubGreeter();


    // Call the methods you wrote and confirm the correct format
    String nametest = welcome("Mike");
    String wishtest = wishes();
    System.out.println(nametest + " " + wishtest);
  // testtttt

  }



}
