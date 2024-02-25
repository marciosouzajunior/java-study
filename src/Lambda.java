public class Lambda {

    // Functional interface, contains only one method
    interface MyInterface {
        void run();
    }

    public static void main(String... args) {

        Lambda lambda = new Lambda();

        // Using anonymous class to implement the interface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };

        // Implementing interface using lambda
        MyInterface myInterface1 = () -> System.out.println("Hello World!");

        myInterface.run();
        myInterface1.run();

    }
}