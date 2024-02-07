package practica;

public class PrincpalLam {
    public static void main(String[] args) {

        Personas per = new Personas();
        per.say("Diego");

        Lambda lab = new Lambda() {
            @Override
            public void say(String nombre) {
                System.out.println("hola " + nombre);
            }
        };
        lab.say("paloma");

        Lambda otro = nombre -> System.out.println("Hola " + nombre);
        otro.say("diego");


    }
    public int nombre1(int a){
        return 0;
    }
}
