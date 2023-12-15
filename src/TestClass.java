import java.util.stream.IntStream;

class Solution {
    static int count=0;
    public static boolean IsSafe(int n, boolean[] column, boolean[] lefDiag, boolean[] rigDiag, int row, int col) {
        if(column[col])return false;
        else if(lefDiag[row+col]) return false;
        else return !rigDiag[row - col + n - 1];
    }

    public static void Solve(int n,char[][] chex_board,int row,boolean[] lef_diag,boolean[] rig_diag,boolean[] column){
        if(row==n){
            count++;
        }else{
            for(int col=0;col<n;col++){
                if(IsSafe(n,column,lef_diag,rig_diag,row,col)){
                    chex_board[row][col]='Q';
                    column[col]=true;
                    lef_diag[row+col]=true;
                    rig_diag[row-col+n-1]=true;
                    Solve(n,chex_board,row+1,lef_diag,rig_diag,column);
                    chex_board[row][col]='-';
                    column[col]=false;
                    lef_diag[row+col]=false;
                    rig_diag[row-col+n-1]=false;
                }
            }

        }

    }
    public static int totalNQueens(int n) {
        count=0;
        char[][] CheckBoard=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                CheckBoard[i][j]='-';
            }
        }
        boolean[] column = new boolean[n];
        boolean[] lef_diag = new boolean[2*n-1];
        boolean[] rig_diag = new boolean[2*n-1];
        IntStream.range(0, n).forEach(i -> column[i] = false);
        for(int i=0;i<2*n-1;i++){
            lef_diag[i]=false;
            rig_diag[i]=false;
        }
//        int count=0;
        Solve(n,CheckBoard,0,lef_diag,rig_diag,column);
        return count;
    }
}