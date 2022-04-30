package testing;

public class Encapsutar_test {
   
    public static void main(String[] args) {
        
        Encapsular var = new Encapsular();

        var.setName("Sonia");

        String name = var.getName();
        System.out.println("getName(): " + name); // getName(): Sonia

    }
}
