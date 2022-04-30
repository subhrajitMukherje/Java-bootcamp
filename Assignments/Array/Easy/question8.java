/*
question link:-https://leetcode.com/problems/reshape-the-matrix/
*/
public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c>mat.length*mat[0].length||r*c<mat.length*mat[0].length){
            return mat;
        }
            int[][] result=new int[r][c];
            int m=0;
            int n=0;
            for(int i=0;i<mat.length*mat[0].length;i++){
                int row=i/mat[0].length;
                int col=i%mat[0].length;
                result[m][n]=mat[row][col];
                n++;
            if(n==c){
                m++;
                n=0;
            }else if(m==r){
                break;
            }        
            }
        return result;
    }