package Recursion;

public class StarRecursion {
    // will use repeat() in this
    public static void starPatterIncreasing(int rows, int i){
        String str = "x ";
        //base condition
        if(i == rows)
            return;
        // self work or logic
        System.out.println(str.repeat(i));

        // subProblem but same logic with different argument
        starPatterIncreasing(rows,i+1);
    }
    public static void triangle(int row, int column){
        //base condition
        if(row == 0)
            return;
       if(column<row){
           System.out.print("* ");
           triangle(row, column+1);
       } else {
           System.out.println();
           triangle(row-1, 0);
       }
    }


    //
    public static void starPatternTester2(int row, int column){ // r=5, c=0
        if(row == 0)
            return;
        starPatternDecreasing(row,column);
        starPatternTester2(row-1,column);
    }
    //
    public static void starPatternDecreasing(int row, int column){
        if(column == row){
            System.out.println();
            return;
        }
        System.out.print("* ");
        starPatternDecreasing(row, column+1);
    }

    public static void main(String[] args) {
//        starPatterIncreasing(5,2);
//        starPatternDecreasing(5,0);
//        starPatternTester2(6,0);
        triangle(5,0);
    }
}
