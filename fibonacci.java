public class fibonacci {
    public static void main(String[] args) {
  
      int n = 143, firstTerm = 0, secondTerm = 1;
          
      System.out.println("Fibonacci Series Upto " + n + ": ");
      
      while (firstTerm <= n) {
        System.out.print(firstTerm + ", ");
  
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
  
      }
    }
  }