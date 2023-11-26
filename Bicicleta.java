
public class Bicicleta implements ImpactoEcologico {

    public Bicicleta() {
        // Los atributos de una bicicleta tienen un impacto mínimo, pero podrían añadirse si es necesario.
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Retornamos un valor simbólico mínimo
        return 0.01;
    }
}
