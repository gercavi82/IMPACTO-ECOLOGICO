import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(new Edificio(5000, 0.45));
        objetos.add(new Auto(15000, 0.20));
        objetos.add(new Bicicleta());

        for (ImpactoEcologico objeto : objetos) {
            if (objeto instanceof Edificio) {
                System.out.println("Impacto Ecológico del Edificio:");
            } else if (objeto instanceof Auto) {
                System.out.println("Impacto Ecológico del Auto:");
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Impacto Ecológico de la Bicicleta:");
            }
            System.out.println(objeto.obtenerImpactoEcologico());
        }
    }
}
