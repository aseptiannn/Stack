package AseptianStack;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Data Nama ");
        System.out.println("=====================================================");
        DataNama Aseptian = new DataNama("Aseptian", "Nur rijal", 1);
        DataNama Wendi = new DataNama("Wendi", "Purnawan", 2);
        DataNama Adi = new DataNama("Adi", "Cobain", 3);

        Linked stack = new Linked();
        stack.push(Aseptian);
        stack.push(Wendi);
        stack.push(Adi);

        stack.printStack();
        System.out.println("=====================================================");
        System.out.println("Data Pertama Sesudah Stack");
        System.out.println("=====================================================");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("=====================================================");
        System.out.println("Data Selanjutnya sesudah di stack");
        System.out.println("=====================================================");
        stack.printStack();

        //System.out.println(stack.size());
    }

}