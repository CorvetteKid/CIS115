import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello from CIS115!");
    System.out.println("Gonna do some programming");
    System.out.println("");
    //ask user for age
    System.out.println("What is your age?");
    int age;
    Scanner kb = new Scanner(System.in);
    //TODO: use scanner to get age value
    age=kb.nextInt();
    //output answer
    System.out.println("you are " + age);

    //tell them next years age
    int nextAge;
    nextAge= age + 1;
    System.out.println("soon you will be " + nextAge);
    System.out.println("When is your birth month?");
    String bDay;
    bDay=kb.next();
    System.out.println("you will turn " + nextAge + " in " + bDay);




  }
}