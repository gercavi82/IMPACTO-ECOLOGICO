
public class Auto implements ImpactoEcologico {
    private double kilometrajeAnual; // km
    private double emisionesCO2PorKm; // kgCO2/km

    public Auto(double kilometrajeAnual, double emisionesCO2PorKm) {
        this.kilometrajeAnual = kilometrajeAnual;
        this.emisionesCO2PorKm = emisionesCO2PorKm;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return kilometrajeAnual * emisionesCO2PorKm;
    }
}
