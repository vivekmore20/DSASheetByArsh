import java.util.*;
class SetMatrixZeroes {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
    }
    

public static void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> li1=new ArrayList<>();
        List<Integer> li2=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    li1.add(i);
                    li2.add(j);
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(li1.contains(i) || li2.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}