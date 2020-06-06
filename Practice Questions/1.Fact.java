public class Fact
{
    int c, f = 1;
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    if(N < 0){
      System.out.println("Number should be non-negative.");
    }else
    {
      for (c = 1; c <= N; c++){
        f = f*c;
      System.out.println("Factorial of "+N+" is = "+f);
    }}
  }
}
