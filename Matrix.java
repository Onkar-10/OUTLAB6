import java.util.HashMap;
import java.io.* ;
import java.io.FileWriter;
import java.util.*;

public class Matrix
{
    float[][] a;
  Matrix(int n,float v){
    a= new float[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        a[i][j]=v;
    }
  }
  Matrix(int n,int m,float v){
    //System.out.println("oh yeah");
    a= new float[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        a[i][j]=v;
    }
    //System.out.println(a[0][0]);

  }
  Matrix(int n,int m){
    a= new float[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        a[i][j]=0;
    }
  }
  Matrix(int n){
     a= new float[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        a[i][j]=0;
    }
  }
  public Matrix add(Matrix obj){
    //System.out.println(obj.a.length);
    //System.out.println(a[1][2]);
    Matrix temp;
    if(obj.a.length==a.length && obj.a[0].length==a[0].length){
        temp=new Matrix(a.length,a[0].length);
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            temp.a[i][j]=a[i][j]+obj.a[i][j];
        }
    }
    }
    else{
        temp=new Matrix(1,1);   //value added is 0.0 not 0! DOUBT 
        System.out.println("Matrices cannot be added");
    }
    return temp ;
  }

  public Matrix matmul(Matrix obj){   //Maatrix_object * Argument Matrix_object
    //System.out.println(obj.a.length);
    //System.out.println(a[1][2]);
    Matrix temp;
    if(obj.a.length==a[0].length){
        temp=new Matrix(a.length,obj.a[0].length);
        for(int i=0;i<a.length;i++){
        for(int j=0;j<obj.a[0].length;j++){
            for(int k=0;k<a[0].length;k++){
                temp.a[i][j]+=a[i][k]*obj.a[k][j];
            }
        }
    }
    }
    else{
        temp=new Matrix(1,1);   //value added is 0.0 not 0! DOUBT 
        System.out.println("Matrices cannot be multiplied");
    }
    return temp ;
  }

  public void scalarmul(int mult_factor){
    //System.out.println(obj.a.length);
    //System.out.println(a[1][2]);
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            a[i][j]*=mult_factor;
        }
    }
  }

  public int getrows(){
       return a.length;
  }

  public int getcols(){
      return a[0].length;
  }

  public float getelem(int row_no,int col_no){
      if(row_no>=0 && row_no<a.length && col_no>=0 && col_no<a[0].length){
          return a[row_no][col_no];
      }
      else{
          System.out.println("Index out of bound");
          return -100;
      }
  }

  public void setelem(int row_no,int col_no,float value){
    if(row_no>=0 && row_no<a.length && col_no>=0 && col_no<a[0].length){
        a[row_no][col_no]=value;
    }
    else{
        System.out.println("Index out of bound");
    }
  }

  public void printmatrix(){
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[0].length-1;j++){
              System.out.print(a[i][j]+" ");
          }
          System.out.println(a[i][a[0].length-1]);   //for lat iteation
      }

      /*for(int j=0;j<a[0].length-1;j++){     //for last iteration
        System.out.print(a[a.length-1][j]+" ");
      }
        System.out.print(a[a.length-1][a[0].length-1]); */
  }


}





