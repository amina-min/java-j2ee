public class QusNo9{
    public static void main(String[] args) {
       
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int i=0;i<numbers.length;i++) {
            System.out.print(positiveNumbers + ",");
        }
    }
}