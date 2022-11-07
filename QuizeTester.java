package Tester;

import Interface.Data;
import Interface.Measurable;
import Interface.Quiz;

public class QuizeTester {
    public static void main(String[] args){
        Measurable [] m = new Quiz[3];
        m[0] = new Quiz(90);
        m[1] = new Quiz(99);
        m[2] = new Quiz(25);

        double avg = Data.max1(m);
        double max = Data.max1(m);
        System.out.println("The Average is " +max);
    }
}
