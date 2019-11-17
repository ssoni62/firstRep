package hello;

public class ByteShortIntLong {

    public static void main(String[] args) {

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        long myyMaxValue=Integer.MAX_VALUE;
        System.out.println("Long Max Value: "+ myyMaxValue);
        System.out.println("Integer Minimum Value= " + myMinValue);
        System.out.println("Integer Maximum Value= " + myMaxValue);

        System.out.println("Busted Max Valaue "+ (myMaxValue+5));
        System.out.println("Busted Min Value: "+ (myMinValue-5));

    }
}
