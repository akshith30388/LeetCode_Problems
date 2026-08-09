class Solution {

    static List<List<String>> ans;
    static int N;
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        N=n;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        //grid, row=0
        solve(board,0);
        return ans;
    }
    public static void solve(char board[][],int row){
        if(row>=N){
            List<String> rows=new ArrayList<>();
            for(int i=0;i<N;i++){
                rows.add(String.valueOf(board[i]));
            }
            ans.add(rows);
            return ;
        }
        for(int col=0;col<N;col++){
            board[row][col]='Q';
            if(isValid(board,row,col)){
                solve(board,row+1);
            }
            board[row][col]='.';
        }
    }
    public static boolean isValid(char board[][],int row,int col){
        //upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upward left Diagonal 
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //upward Right Diagonal 
        for(int i=row-1,j=col+1;i>=0 && j<N;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
}