package practica;

import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {

        List<Personas> personas = new ArrayList<>();
        personas.add(new Personas("diego", "15151", 1500));
        personas.add(new Personas("paloma", "15152", 1800));
        personas.add(new Personas("maya", "15153", 500));
        personas.add(new Personas("gato", "15154", 100));


        System.out.println(personas.stream().anyMatch(n->n.getName().contains("fff")));
        System.out.println(personas.stream().allMatch(n->n.getSalario()>=50));
        personas.forEach(System.out::println);


    }
}

