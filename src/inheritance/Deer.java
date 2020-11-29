package inheritance;

public class Deer extends Animal {

    @Override
    public void height() {
        System.out.println("Average deer height " + 4 + " feet");
        super.height();
    }
}
