import java.util.ArrayList;
import java.util.Arrays;

public class mainVisitor {

    public static void main(String[] args) {

        ArrayList<Visitable> toVisit = new ArrayList<Visitable>();
        Type1 b1 = new Type1("building T1-1");
        Type1 b2 = new Type1("building T1-2");
        Type2 b3 = new Type2("building T2-1");
        Type2 b4 = new Type2("building T2-2");
        Type3 b5 = new Type3("building T3-1");
        Type3 b6 = new Type3("building T3-2");

        toVisit = new ArrayList<Visitable>(Arrays.asList(b1, b2, b3, b4, b5, b6));
        //missing code for some of the visitor pattern goes here
        SchoolVisitor schoolVisitor = new SchoolVisitor();
        MunicipalVisitor municipalVisitor = new MunicipalVisitor();

        //Compute municipal and school taxes for each building to visit
        for (Visitable current : toVisit) {
            //code to pay municipal taxes for current building
            //code to pay municipal taxes for current building
            System.out.println(current.accept(municipalVisitor));
            System.out.println(current.accept(schoolVisitor));
        }



    }

}

