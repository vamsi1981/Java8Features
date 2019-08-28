interface MyFunctionalInterface {
    public void execute();
}
public class MyFunctionalImplementation {
public static void main(String[] args) {
	MyFunctionalInterface lambda = () -> {
	    System.out.println("Executing...");
	};
}
}
