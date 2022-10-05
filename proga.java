  class inf {
     public static void main(String[] args) {
         long[] a = new long[]{6, 8, 10, 12,14, 16, 18};
         double[] x= new double[17];
         for (int j=0; j<x.length; j++){
             x[j]= Math.random()*22-9;
         }
         double [][] d = new double[7][17];
         for(int i = 0; i<7; i++){
             for (int j=0;j<17;j++) {
                 if (a[i] == 6){
                     d[i][j] = Math.pow(Math.pow(Math.tan(x[j]) * Math.pow((Math.PI - ((1 / 3) / (1 / 3 - x[j]))), x[j]), 2), 1 / 3);
                 }
                 if ((a[i] == 8)|(a[i] == 14) |(a[i] == 18)) {
                     d[i][j] =  Math.asin(Math.pow(Math.cos(x[j]),2));
                 }
                 if ((a[i] == 10)|(a[i] == 12)|(a[i] == 16)){
                     d[i][j]=  Math.asin(Math.pow(Math.cos(Math.pow((Math.sin(x[j])*(Math.sin(x[j])+1/3)),2)), (Math.pow(3/4*(1/2*(Math.pow(x[j],1/3))),Math.atan((x[j]+2)/22)))*(Math.pow((x[j]/(x[j]+1)),(2/3)/Math.cos(x[j]))+1/4)));
                 }
             }
             }
         for (int i=0;i<d.length;i++){
             for (int j=0; j<d[0].length;j++){
                 System.out.printf("%.5f",d[i][j]+" ");

             }
             System.out.println();
         }
     }
 }