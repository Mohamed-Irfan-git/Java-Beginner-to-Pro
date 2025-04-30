package DSA.Backtracking;

import java.util.ArrayList;

public class PathCount {
    public static void main(String[] args) {
//        System.out.println(countPaths(4,2));
//      ArrayList<String> ans = path1("",3,3);
//        System.out.println(ans);
//        diagnalPath("",3,3);
        boolean[][] td={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
      //  pathRestriction("",td,0,0);
        pathRestrictionBacktracking("",td,0,0);


    }
    static int countPaths(int r,int c) {
        if(r==1 || c==1){
            return 1;
        }
        return countPaths(r-1,c)+countPaths(r,c-1);

    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> path1(String p,int r,int c){

        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(path1(p+'D',r-1,c));

        }
        if(c>1){
            list.addAll(path1(p+'R',r,c-1));
        }
        return list;
    }

    static void diagnalPath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1&&c>1){
            diagnalPath(p+'D',r-1,c-1);
        }

        if(r>1){
            diagnalPath(p+'V',r-1,c);
        }
        if(c>1){
            diagnalPath(p+'H',r,c-1);
        }
    }


    static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathRestriction(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestriction(p+'R',maze,r,c+1);
        }
    }

    static void pathRestrictionBacktracking(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
            pathRestrictionBacktracking(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictionBacktracking(p+'R',maze,r,c+1);
        }
        if(c>0){
            pathRestrictionBacktracking(p+'C',maze,r,c-1);
        }
        if(r>0){
            pathRestrictionBacktracking(p+'D',maze,r-1,c);
        }

        maze[r][c] = true;
    }


}
