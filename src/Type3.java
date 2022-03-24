public class Type3 implements Visitable{

    private String id;

    public Type3 (String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }
}
