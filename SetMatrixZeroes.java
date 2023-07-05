import java.util.*;
class SetMatrixZeroes {
    public static void main(String[] args) {
        // 
        int size=20;
        Integer[] arr=new Integer[size];

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    
}
// public static void setZeroes(int[][] matrix) {
//         int row=matrix.length;
//         int col=matrix[0].length;
//         List<Integer> li1=new ArrayList<>();
//         List<Integer> li2=new ArrayList<>();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(matrix[i][j]==0){
//                     li1.add(i);
//                     li2.add(j);
//                 }
//             }
//         }
        
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(li1.contains(i) || li2.contains(j)){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
// }

int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
if(isStable(input1)){
    min=Math.min(min,input1);
    max=Math.max(max,input1);

}
if(isStable(input2)){
    min=Math.min(min,input2);
    max=Math.max(max,input2);
    
}
if(isStable(input2)){
    min=Math.min(min,input3);
    max=Math.max(max,input3);
    
}
if(isStable(input4)){
    min=Math.min(min,input4);
    max=Math.max(max,input4);
    
}
if(isStable(input5)){
    min=Math.min(min,input5);
    max=Math.max(max,input5);
    
}
if(min==Integer.MAX_VALUE && max=Integer.MIN_VALUE){
    return 0;
}
return max-min;
