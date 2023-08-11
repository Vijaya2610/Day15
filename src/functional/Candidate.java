package functional;

import java.util.function.Predicate;

class Candidate {
    public boolean checkAge(int age) {
        if (age > 18) {
            System.out.println("valid age");
        } else {
            System.out.println("invalid age");
        }
        return false;
    }
    
    public static void main(String[] args) {
        Candidate candidate = new Candidate();

        Predicate<Integer> ageCheckPredicate = candidate::checkAge;

        int[] ageArray = {12, 23, 11, 19, 35, 22};

        for (int age : ageArray) {
            if (ageCheckPredicate.test(age)) {
                System.out.println(age + " is a valid age");
            } else {
                System.out.println(age + " is an invalid age");
            }
        }
    }
}