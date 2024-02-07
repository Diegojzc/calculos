package CalculosNeperianos;

public class CalculosNeperianos {


    public static double numNeo(double num) {
        if (num > 0){
            return Math.log1p(num);
            }
        return num;
    }

    public static double raiz(double num){

        return  Math.sqrt(num);
    }
}
