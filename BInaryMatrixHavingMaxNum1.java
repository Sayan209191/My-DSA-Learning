public class BInaryMatrixHavingMaxNum1 {
    // Given a binary matrix n*n (contain 0,1) , al rows are sorted
    // find the row which contains max number of 1 and also the no of 1
    public static int[] findMaxRow(int mat[][],int n){
        int ans[]=new int[2];
        int maxNum=Integer.MIN_VALUE;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count=n-j;
                    break;
                }
            }
            if(count>maxNum){
                maxNum=count;
                row=i;
            }
        }
        ans[0]=row;
        ans[1]=maxNum;
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][]={{0,0,1},{1,1,1},{0,0,0}};
        int ans[]=findMaxRow(matrix,3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
