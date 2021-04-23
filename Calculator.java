public class Calculator {
  public int add(int a, int b){
    return a + b;
  }
  public int sub(int a, int b){
    return a - b;
  }
  public int mul(int a, int b){
    return a * b;
  }
  public int div(int a, int b){
    try {
      return a / b;
    }
    catch(Exception e) {
      System.out.println("Error de división por cero");
      return 0;
    } 
  }
  public int mod(int a, int b){
    return a % b;
  }
}
