
public class Edificio implements ImpactoEcologico {
    private double consumoEnergia; // kWh
    private double emisionesCO2PorKWh; // kgCO2/kWh

    public Edificio(double consumoEnergia, double emisionesCO2PorKWh) {
        this.consumoEnergia = consumoEnergia;
        this.emisionesCO2PorKWh = emisionesCO2PorKWh;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return consumoEnergia * emisionesCO2PorKWh;
    }
}
