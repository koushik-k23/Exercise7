public class Type2 implements Visitable {

    private String id;

    public Type2(String id){
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
