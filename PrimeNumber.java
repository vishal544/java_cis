//Programming assignment 6 problem 1
// Print true if integer is a prime number

class PrimeNumber
 {
  public static void main(String[] args)
 {
    int num = 17;
    int i;


    for (i=2; i < num ;i++ ){
      int n = num%i;
      if (n==0){
        System.out.println(" ");

        break;
      }
    }
    if(i == num){
      System.out.println("True");
    }
  }
} 