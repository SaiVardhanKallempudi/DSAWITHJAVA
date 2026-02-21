package Day1.BasicMath;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable();
    }
    public static void printTable(){
        int number =5;
        for(int i=0; i<=10; i++){
            System.out.println(number +" * "+i+" = "+number*i);
        }
    }
}
