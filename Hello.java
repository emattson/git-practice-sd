import java.util.Scanner;
import java.io.*;
public class Hello {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Please enter your name and hit return.");
String name = in.nextLine();
System.out.println("Hello " + name);
}
}
