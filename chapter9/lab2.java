package chapter9;

public class lab2 {

    public static void main(String[] args) {
        Stack<String> airports = new ArrayStack<>();
        airports.push("BHM");
        airports.push("ATL");
        airports.push("LAX");

        if(!airports.isEmpty()) {
            String airport1 = airports.pop();
            String airport2 = airports.pop();
            System.out.println(airport1);
            System.out.println(airport2);
        }
        System.out.println(airports);

    }

}
