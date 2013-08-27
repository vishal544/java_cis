public class Test{


public static double check1(double[]arr){
return check2(arr,0,0.0);
}

private static double check2(
   double[]arr,int next,double s)
{
 if(next>=arr.length) return s;
 return check2(arr,next+1,s+arr[next]);
}

public static void main(String[] args){
  double[]a={1.0,1.0,2.0,2.0};
  System.out.println(check1(a));
}
}