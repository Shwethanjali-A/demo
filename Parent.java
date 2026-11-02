class Parent {
    int a = 10;

    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int b = 20;

    void display() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}