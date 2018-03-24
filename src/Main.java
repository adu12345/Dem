 
 import java.util.*;
 public class Main {
  public static String yuefen(int a,int b){
          int y = 1;
          for(int i=a;i>=1;i--){
              if(a%i==0&&b%i==0){
                  y = i;
                  break;
              }
          }
         int z = a/y;
         int m = b/y;
         if(z==0) {
             return "0";
        }
         return ""+z+"/"+m;
      }
     public static void main(String[] args) {
         // TODO Auto-generated method stub
    	 System.out.println("201571030302");
         int x,y,i,a1;
         int d1=0;
         String d = null;
         System.out.println("1、整数计算式，2、真分数计算式");
          Scanner scan1=new Scanner(System.in);
          a1=scan1.nextInt();
  if(a1==1){
          System.out.println("请输入题目的数量");
          Scanner scan2=new Scanner(System.in);
          x=scan2.nextInt();
         int daan[]=new int [x];
         System.out.println("请输入数值的范围");
         y=scan2.nextInt();
        for(i=0;i<x;i++){
             int a=(int)(Math.random()*y);//随机生成一个1-10的整数
              int b=(int)(Math.random()*y);//随机生成一个1-10的整数
              int c=(int)(Math.random()*3);//随机生成一个1-4的整数，0表示加法，1表示减法，2表示乘法，3表示除法
              if(c==0)
              {
                  d1=a+b;
                  System.out.print(a+"+"+b+"=       ");
              }
              if(c==1)
              {
                  d1=a-b;
                  System.out.print(a+"-"+b+"=       ");
              }
              if(c==2)
              {
                  d1=a*b;
                  System.out.print(a+"*"+b+"=       ");
              }
             if(c==3)
             {
                 d1=a/b;
                  System.out.print(a+"/"+b+"=       ");
              }
              if((i+1)%3==0){
                  System.out.println();
              }
              daan[i]=d1;
          }
          System.out.println("是否显示答案（显示请输入1）");
          if(scan2.nextInt()==1){
              for(i=0;i<x;i++){
              System.out.print(daan[i]+"     ");
              }
          } 
          }
  if(a1==2){
             int M,Z;
             System.out.println("请输入题目的数量");
             Scanner scan2=new Scanner(System.in);
             x=scan2.nextInt();
             String daan[]=new String [x];
              int x1,x2,B,m1,m2;
              System.out.println("请输入分母数值的范围");
             B=scan2.nextInt();
             for(i=0;i<x;i++){
                 m1=1+(int)(Math.random()*B);//随机生成一个小于B的分母
                 x1=1+(int)(Math.random()*m1);//生成一个比分母小的分子，实现真分数
                  m2=1+(int)(Math.random()*B);//随机生成一个小于B的分母
                 x2=1+(int)(Math.random()*m2);//生成一个比分母小的分子，实现真分数
                 int c=(int)(Math.random()*3);//生成运算符
                 if(c==0){
                     Z=x1*m2+x2*m1;
                     M=m1*m2;
                     d=yuefen(Z,M);
                     System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"=       ");
                 }
                 if(c==1){
                     Z=x1*m2-x2*m1;
                      M=m1*m2;
                      d=yuefen(Z,M);
                      System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"=       ");
                  }
                  if(c==2){
                      Z=x1*x2;
                      M=m1*m2;
                     d=d=yuefen(Z,M);
                    System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"=       ");
                 }
                if(c==3){
                   Z=m1*x2;
                    M=m2*x1;
                     d=d=yuefen(Z,M);
                     System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"=       ");
                 }
                 if((i+1)%3==0){
                     System.out.println();
                 }
                daan[i]=d;
                
             }
             System.out.println("是否显示答案（显示请输入1）");
            if(scan2.nextInt()==1){
                 for(i=0;i<x;i++){
                 System.out.print(daan[i]+"     ");
                 }
             }
             
         }
 
         
     }
     }