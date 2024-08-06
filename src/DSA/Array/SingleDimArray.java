package DSA.Array;

public class SingleDimArray {
    public static void main(String[] args) {

        float[] marks = {44.2f, 14.5f, 44.3f, 15.1f, 14.8f, 25.6f, 65.7f, 96.9f, 41.1f, 10.2f};

        int arrLen = marks.length;

//        //Sum of float values available in marks array. Prob - 1
//        float sum = 0;
//        for(float mark : marks){
//            sum = sum + mark;
//        }
//        System.out.println("Sum of all values in array --> " + sum);


///////////////////////////////////////////////////////////////////////////////////

//        Find Specific element available into array or not - Prob 2
//        float sum = 0;
//        boolean isInArray = false;
//        float num = 65.0f;
//        for(float mark : marks){
//            if( num == mark) {
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray == true){
//            System.out.println("Element present in array");
//        }else{
//            System.out.println("Element not present in array");
//        }

//////////////////////////////////////////////////////////////////////////////////////////////

//        Print average of all values into array - Prob - 3
//        float sum = 0;
//        for(float mark : marks){
//            sum = sum + mark;
//        }
//        float arrAvg = sum / arrLen;
//        System.out.println(arrAvg);

////////////////////////////////////////////////////////////////////////


//        Sum of 2D array(Matrix)
//        int[][] arrMark1 = {{9,5,6},
//                            {2,3,5}};
//
//        int[][] arrMark2 = {{14,3,58},
//                            {17,29,25}};
//
//        int[][] sum = new int[2][3];
//
//        for(int i = 0; i<arrMark1.length; i++ ){ // Row number of times
//            for(int j = 0; j<arrMark1[i].length; j++){ // column number of times
//                //System.out.format("Setting value for i=%d and j=%d \n",i,j);
//                sum[i][j] = arrMark1[i][j] + arrMark2[i][j];
//                System.out.print(sum[i][j]+ " ");
//
//            }
//            System.out.println("");
//
//        }

///////////////////////////////////////////////////////////////////////////////////////

//        Reverse Array
//
//        int[] arr = {15, 22, 20, 14, 55, 63, 66};
//
//        int[] rev = new int[arr.length];
//
//        int j = arr.length;
//
//        for (int i = 0; i < arr.length; i++) {
//            rev[j-1] = arr[i];
//            j = j-1;
//        }
//        for (int revs : rev)
//            System.out.print(revs + " ");

////////////////////////////////////////////////////////////////////////////////////////////


    }

}
