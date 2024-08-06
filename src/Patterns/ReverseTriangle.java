package Patterns;

public class ReverseTriangle {

    public static void main(String[] args) {

        System.out.println(printReverseTriangle(5));
        
    }
    
    public static Object printReverseTriangle(int rows){
        
        for(int i=0; i<rows; i++){
            
            for(int j = rows; j>i; j--){

                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        return null;
        
        
    }
}
