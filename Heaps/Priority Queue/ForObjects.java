import java.util.*;

public class ForObjects {
    static class Student implements Comparable<Student> { //overeiding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
    }
}


// Comparable - Using Comparable, now classes can compare their objects.
/*
 * if the compare to function returns the positive value then it means that the first number is greater than the second number
 * if negative then vice versa
 * if it returns zero then that means the elements are equal.
 */