package potential.energy;

public class PotentialEnergy {

    public static final double acceleration = 10;

    public double hight;
    public double weight;

    public PotentialEnergy(double h, double w){
        this.hight = h;
        this.weight = w;
    }

    public double getEnergyPot(){
        return hight*weight*acceleration;
    }

}
