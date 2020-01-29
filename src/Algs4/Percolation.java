package Algs4;

public class Percolation {
    boolean[][] open ;
    int[][] ids ;
    int N ;
    int dx[] = {0,0,1,-1};
    int dy[] = {1,-1,0,0};
    int top_block =  0 ;
    int bottom_block = 0 ;
    int open_count = 0 ;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if(n<=0)
            throw new IllegalArgumentException();
        this.N = n;
        open = new boolean[n+1][n+1];
        ids = new int[n+1][n+1];
        for(int i = 0 ; i <= n ; i++)
            for(int j = 0 ; j <= n ;j++)
                ids[i][j] =getId(i,j);
            //
        top_block = getId(0,0);
        bottom_block = getId(0,1);
        for(int i = 1 ; i <= N ; i++)
            union(1,i,0,0);
        for(int i = 1 ; i <= N ; i++)
            union(N , i , 0,1);


    }

    private void union(int row , int col , int srow , int scol)
    {
        int sroot = root(srow,scol);
        int root = root(row , col);
        if(sroot!=root)
            ids[getRow(root)][getRow(root)] = sroot;

    }
    private int root(int row , int col)
    {
        while(ids[row][col]!= getId(row , col))
        {
            int id = ids[row][col];
            row = getRow(id);
            col = getCol(id);
        }
        return ids[row][col];
    }
    private int getId(int row , int col)
    {
        return (row*N)+col;
    }
    private int getRow(int id)
    {
        return id / N ;
    }
    private int getCol(int id)
    {
        return id %N ;
    }
    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(open[row][col])
            return ;
        open_count++;
        open[row][col] = true;
        for(int i = 0 ; i < 4; i++)
        {
            int nx = row+dx[i], ny=col+dy[i];
            if(nx<1 || nx >N)
                continue;
            if(ny < 1 || ny > N)
                continue;
            //check if not connected union them
            if(!connected(row , col , nx,ny))
                union(row , col , nx , ny);
        }
    }
    private boolean connected(int row , int col , int srow , int scol)
    {
        return root(row,col) == root(srow , scol);
    }
    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        return open[row][col];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){
        return connected(row , col , 0,0);
    }

    // returns the number of open sites
    public int numberOfOpenSites(){
        return open_count;
    }

    // does the system percolate?
    public boolean percolates(){
        return root(0,0) == root(0,1);
    }

    // test client (optional)
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        Percolation p = new Percolation(N);
        System.out.println(p.percolates());
    }
}
