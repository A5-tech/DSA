package pattern_questions;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        for(int r=1;r<7;r++){
            if(r==1 || r==5 || r==6){
                for(int i=1;i<7-r+1;i++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
           else {
                for(int c=1;c<7-r+1;c++){
                    if(c==1 || c==7-r){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
