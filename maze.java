
import java.util.ArrayList;

class maze {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},
                        {true, true, true},
                        {true, true, true}};
                       allPaths("", board, 0, 0);

        
    }
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        

        if (maze[r][c]==false){
            return;
        }

        maze[r][c]=false;

        if (r<maze.length-1){
          allPaths(p, maze, r+1, c);
        }
        if (r<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if (r>0){
            allPaths(p+'U', maze, r-1,c);
        }
         if (c>0){
            allPaths(p+'L', maze, r,c-1);
        }

        maze[r][c]=true;

    }

    // static ArrayList<String> diagonalPathRet(String p, int r , int c){
    //     if (r==1 && c==1){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p)
    //         return list;
    //     }
    //     ArrayList<String> list = new ArrayList<>();

    //     if (r>1 && c>1){
    //         list.addAll(diagonalPathRet(p+'D', r-1, c-1));
    //     }
    //     if (r>1){
    //         list.addAll()
    //     }
    // }
 }
