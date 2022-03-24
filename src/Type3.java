public class Type3 extends Visitable{

    private String id;

    public Type3 (String id){
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public double getVal() {
        return 50000;
    }

    @Override
    public double getCostFactorSchool() {
        return 0.009;
    }


}
