public class LibraryMember {

    private int memberId;
    private String memberName;
    private int booksIssued;

    public LibraryMember(int memberId, String memberName, int booksIssued) {
        this.memberId = memberId;
        this.memberName = memberName;
        if (booksIssued >= 0) {
            this.booksIssued = booksIssued;
        }
    }

    public void setMemberId(int memberId) { this.memberId = memberId; }
    public int getMemberId() { return memberId; }

    public void setMemberName(String memberName) { this.memberName = memberName; }
    public String getMemberName() { return memberName; }

    public void setBooksIssued(int booksIssued) {
        if (booksIssued >= 0) this.booksIssued = booksIssued;
    }
    public int getBooksIssued() { return booksIssued; }

    public void issueBook() { booksIssued++; }
    public void returnBook() { if (booksIssued > 0) booksIssued--; }

    public void displayDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Books Issued: " + booksIssued);
        System.out.println("----------------------");
    }
}
