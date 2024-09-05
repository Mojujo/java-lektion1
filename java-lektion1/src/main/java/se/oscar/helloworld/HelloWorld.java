package se.oscar.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String [] lektion = {"Hello,", "I have", "already", "learned", "this"};
        int n= 0;

        for(int i=1;i<=lektion.length; i++) {
            System.out.print(lektion[n]+ " ");
            n++;
        }
    }
}
