package pattern_questions;

public class HollowRectangle {
    public static void main(String[] args) {
        for(int r=1;r<4;r++){
            for(int c=1;c<6;c++){
                if(c!=1 && c!=5 && r==2){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
