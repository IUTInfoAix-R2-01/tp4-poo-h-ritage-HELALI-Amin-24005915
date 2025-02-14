package tp3exosYaip7;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        member = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString() {
        return "Name : " + name + " Member Type : " + memberType;
    }

    public static void main(String[] args) {
        Customer d1 = new Customer("Amin");

        System.out.println(d1);

        d1.setMember(true);
        d1.setMemberType("Gold");

        System.out.println(d1);
    }
}
