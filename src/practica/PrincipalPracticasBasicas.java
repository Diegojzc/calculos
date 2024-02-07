package practica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrincipalPracticasBasicas {
    public static void main(String []args){
   FuncionaInterface suma= (n1,n2)->(n1+n2);
        FuncionaInterface resta= (n1,n2)->(n1-n2);
        FuncionaInterface mult= (n1,n2)->(n1*n2);
        FuncionaInterface div= (n1,n2)->(n1/n2);

        List<FuncionaInterface> operaciones = new ArrayList<>();
        operaciones.add(suma);
        operaciones.add(resta);
        operaciones.add(mult);
        operaciones.add(div);

       operaciones.forEach(n-> System.out.println(n.operar(8,2)));


    }
}
