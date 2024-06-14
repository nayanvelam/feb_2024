package oops;

public class school {

    public static void main(String[] args) {
        Student std = new Student();
        std.mark();
        std.showDetails();
        
        Teacher t = new Teacher();
        t.rejoin();
        t.resign();
    }
}

class Student {
    public void mark() {
        System.out.println("Mark");
    }

    public void showDetails() {
        System.out.println("Show the marks");
    }
}

interface Principal {
    void resign();
    void rejoin();
}

class Teacher implements Principal {
    @Override
    public void resign() {
        System.out.println("Resigned");
    }

    @Override
    public void rejoin() {
        System.out.println("Rejoined");
    }
}
