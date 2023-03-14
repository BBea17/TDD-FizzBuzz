public class FizzBuzz {
    public String FizzBuzz(int numero){
        String numeroIndivisible = Integer.toString(numero);

        if(numero % 5 == 0 && numero % 3 == 0){
            return "FizzBuzz";
        }
        if(numero % 5 == 0 && numero % 3 != 0){
            return "Buzz";
        }
        if(numero % 3 == 0 && numero % 5 != 0){
            return "Fizz";
        }
        return numeroIndivisible;
    }

}
