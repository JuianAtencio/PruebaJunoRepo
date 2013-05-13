public class Imprimir {
    public boolean devuelve_mensaje(boolean dato) {
        if (dato != true) {
            System.out
                    .println("Aja programa de prueba para repo en Git  falso");
            dato = false;
        } else {
            System.out.println("Aja programa de prueba para repo en Git true");
            dato = true;
        }
        return dato;
    }

    public boolean devuelve_mensaje2(boolean dato) {
        if (dato != true) {
            System.out
                    .println("Aja 2 MNS programa de prueba para repo en Git  falso");
            dato = false;
        } else {
            System.out
                    .println("Aja 2 MNS programa de prueba para repo en Git true");
            dato = true;
        }
        return dato;
    }
}
