public class Main {
    public static void main(String[] args) throws InterruptedException {
        Time time=new Time(0,0,2);
        for(int i = 0; i < 10;i++){
            Thread.sleep(1000);

            time.previousSecond();

            System.out.println(time);
        }
}
}
