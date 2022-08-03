package twoDArray;

public class BinarySearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
           int end= (matrix.length*matrix[0].length-1);
           int mid=(s+end)/2;
           while(s<=end){
               if(matrix[mid/matrix[0].length][mid % matrix[0].length]==target){
                   return true;
               }else if(matrix[mid/matrix[0].length][mid % matrix[0].length]>target)
               {
                   end=mid-1;
               }else{
                   s=mid+1;
               }
                 mid=(s+end)/2;
           }
           return false;
           
           
       }
}
