public abstract class Visitable{

    public abstract String accept(Visitor v);

    public void computeAllTaxes(){
        double val = getVal();
        double c1 = getCostFactorMunicipal();
        double c2 = getCostFactorSchool();

        double tax1 = tax(val,c1);
        double tax2 = tax(val,c2);

        System.out.println(" Municipal taxes for " + getId() + " are: "+tax1);
        System.out.println(" School taxes for " + getId() + " are: "+tax2);

    }
    public abstract double getVal();
    public abstract double getCostFactorSchool();
    public double getCostFactorMunicipal(){
        return 0.08;
    }
    public abstract String getId();

    public double tax(double val, double costFactor){
        return val * costFactor;
    }
}
