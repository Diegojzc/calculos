package practica;

public class Personas  {

    private String name;
    private String password;
    private int salario;

    public Personas(String name, String password, int salario) {
        this.name = name;
        this.password = password;
        this.salario = salario;
    }
    public Personas(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salario=" + salario +
                '}';
    }


    public void say(String nombre) {
        System.out.println("Hola " + nombre);
    }
    public int suma(int n){
        return 1;
    }
}
