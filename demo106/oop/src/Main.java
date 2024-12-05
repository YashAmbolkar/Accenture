class student {
    int rollno,marks;
    String name;
    void input(){
        System.out.println("Enter rollno: Name Marks ");
    }
}
class Yash extends student {
    void display(){
        rollno=1; name="Yash"; marks=95;
        System.out.println(rollno+" " +name+" "+marks);
    }
    public static void main(String[] args) {
        Yash y = new Yash();
        y.input();
        y.display();
    }
}