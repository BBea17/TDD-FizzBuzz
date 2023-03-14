public class Operaciones {
    public String suma(String numero){
        int sum, num;
        sum = 0;
        String sumaFinal;
        String coma = "";
        String[] N = numero.split(",");

        if (numero.equals("")){
            return "0";
        }

        for (int i = 0; i < numero.length();i++){
            coma = numero.substring(i);
        }

        if(coma.equals(",")) {
            return "-1";
        }

        for(int i = 0; i< N.length;i++){
            num = Integer.parseInt(N[i]);
            sum=sum+num;
        }

        sumaFinal=String.valueOf(sum);
        return sumaFinal;
    }
}
