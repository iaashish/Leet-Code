class Solution {
    public void gameOfLife(int[][] board) {
        int[] neighbors = {0, 1, -1};
        
        int rows = board.length;
        int cols = board[0].length;
        
        
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                
                int live = 0;
                
                for(int i =0;i<3;i++){
                    for(int j=0;j<3;j++){
                        //if both are same it means that it is the current location we should bypass that
                        if(!(neighbors[i] == 0 && neighbors[j] == 0)){
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);
                            System.out.println("i:"+i+" j:"+j+" r: "+r+ " c:"+c+ " rows:"+row+ " cols:"+col);
                            //r should never be -1 it means it is going out of the bounsds
                            if((r < rows && r >= 0) && (c<cols && c >=0) && (Math.abs(board[r][c]) == 1)){
                                
                                live += 1;
                                System.out.println("live: "+live);
                            }
                        }
                    }
                }
                
                System.out.println(live);
                
                //if there are more than few live then make it dead
                if((board[row][col] == 1) && (live < 2 || live > 3)){
                    board[row][col] = -1;
                }
                //if a current one is dead and have more than 3 neighbors make it alive
                if(board[row][col] == 0 && live == 3){
                    board[row][col] = 2;
                }
            }
        }
        
        for(int row=0; row<rows;row++){
            for(int col = 0;col<cols;col++){
                if(board[row][col] > 0){
                    board[row][col] = 1;
                }else{
                    board[row][col] = 0;
                }
            }
        }
    }
}