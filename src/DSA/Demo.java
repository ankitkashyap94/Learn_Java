package DSA;

public class Demo {

    public static void main(String[] args) {

        double now = System.currentTimeMillis();

        Demo demo = new Demo();

        System.out.println(demo.findSum(9999));
        System.out.println("Time taken " + (System.currentTimeMillis() - now) +" Miliseconds");

    }

//    public  int findSum(int nos) {
//
//        return nos * (nos + 1)/2;
//
//
//    }

    public  int findSum(int nos) {
        int sum = 0;
       for (int i=1; i<=nos; i++){
        sum = sum + i ;
       }
       return sum;
    }


}
