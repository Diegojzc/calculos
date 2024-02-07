package practica;

public enum Dias{
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private final boolean laborable;

    Dias(boolean laborable) {
        this.laborable = laborable;
    }

    @Override
    public String toString() {
       if (laborable){
           return "el dia " + this.name().toLowerCase()+ " es laborable";
       }
       return "el dia " + this.name().toLowerCase() + " no es laborable";
    }
}

