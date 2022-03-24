public class MunicipalVisitor implements Visitor{
    @Override
    public String visit(Type1 type1) {
        return "Computing municipal taxes for Type1 building named:"+type1.getId();
    }

    @Override
    public String visit(Type2 type2) {
        return "Computing municipal taxes for Type2 building named:"+type2.getId();
    }

    @Override
    public String visit(Type3 type3) {
        return "Computing municipal taxes for Type3 building named:"+type3.getId();
    }
}
