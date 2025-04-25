public class TrickyLoop {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 3; )
            System.out.print(i++ + " ");
            System.out.println("Done");
    }
}