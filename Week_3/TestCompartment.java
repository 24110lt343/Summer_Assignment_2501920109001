import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}


class FirstClass extends Compartment{
    @Override
    public String notice(){
        return "This is 1st class AC compartment, people who doesn't own a ticket are not allowed to be in here.";
    }
}

class Ladies extends Compartment{
    @Override
    public String notice(){
        return "This is ladies compartment, no mens are allowed here.";
    }
}

class General extends Compartment{
    @Override
    public String notice(){
        return "This is general compartment, make sure you have a general ticket.";
    }
}

class Luggage extends Compartment{
    @Override
    public String notice(){
        return "This is Luggage compartment. No people are allowed here. Only luggages are allowed";
    }
}


public class TestCompartment{
    public static void main(String[] args) {
        Compartment []cmt = new Compartment[10];
        Random rand = new Random();
        for(int i=0;i<cmt.length;i++){
            int n = rand.nextInt(4)+1;
            switch (n) {
                case 1:{
                    cmt[i] = new FirstClass();
                    break;
                }
                case 2:{
                    cmt[i] = new Ladies();
                    break;
                }
                case 3:{
                    cmt[i] = new General();
                    break;
                }
                case 4:{
                    cmt[i] = new Luggage();
                    break;
                }
            }
        }


        for(Compartment cp : cmt){
            System.out.println(cp.notice());
        }
    }
}