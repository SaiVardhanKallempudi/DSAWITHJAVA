package Basics.BasicTask;

public class TaskOneCountup {
    public void countUp() {

        // TODO : countup to 10
        // using for loop because we know when to stop
        for (int i = 0; i <= 10; i++) {
            // now print each element
            System.out.println(i);
        }
    }
    public void countDown(int n){
        for(int i =n; i>=0; i--){
            System.out.println(i);
        }
    }
}