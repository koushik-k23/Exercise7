public class Type1 extends Visitable{

    private String id;

    public Type1(String id){
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
        return 150000;
    }

    @Override
    public double getCostFactorSchool() {
        return 0.02;
    }


}
