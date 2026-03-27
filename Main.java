public class Main {
    public static void main(String[] args) {
        LibraryMember m1 = new LibraryMember(1, "Nora", 2);
        LibraryMember m2 = new LibraryMember(2, "Sara", 0);
        m1.displayDetails();
        m2.displayDetails();
        m1.issueBook();
        m1.returnBook();
        System.out.println("After updates:");
        m1.displayDetails();
    }
}
