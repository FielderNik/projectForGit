public class mainClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, world");
        int count = 1;
        while (count <= 10){
            System.out.println("Count: " + count);
            count++;
            Thread.sleep(1000);
        }
        for (int i = 0; i < 5; i++){
            System.out.print("H: " + i + " | ");
        }
    }
}
