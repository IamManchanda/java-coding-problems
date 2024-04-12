import java.util.*;

public class Main {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("A", 4),
                s2 = new Student("B", 5),
                s3 = new Student("C", 2),
                s4 = new Student("D", 12);

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);

        System.out.println("PriorityQueue by rank: ");
        while (!pq.isEmpty()) {
            System.out.println(printString(pq.peek()));
            pq.poll();
        }

        PriorityQueue<Student> pqr = new PriorityQueue<>(Collections.reverseOrder());

        pqr.add(s1);
        pqr.add(s2);
        pqr.add(s3);
        pqr.add(s4);

        System.out.println();
        System.out.println("PriorityQueue by rank with reverse order: ");
        while (!pqr.isEmpty()) {
            System.out.println(printString(pqr.peek()));
            pqr.poll();
        }
    }

    private static String printString(Student s) {
        return s.name + " -> " + s.rank;
    }
}
