public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println("Before return");
        display();
        System.out.println("After method call");
    }

    static void display() {
        System.out.println("Inside method");
        return;
    }
}
