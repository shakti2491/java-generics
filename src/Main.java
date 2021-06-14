import intro.Pair;

public class Main {
    public static void main(String[] args) {
    }

    static void addElements(Object[] objArr){
        objArr[0] = new Pair<>(0,0);
        objArr[1] = new Pair<>("","");
    }

}

class Name extends Pair<String,String>{

    public Name(String a1, String a2) {
        super(a1, a2);
    }
}
