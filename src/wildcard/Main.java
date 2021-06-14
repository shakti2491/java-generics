package wildcard;

import intro.Pair;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Collection<?> coll = new ArrayList<>();
        List<? extends Number> list = new ArrayList<>();
        Comparator<? super String> comparator = new RuleBasedCollator("< a< b< c< d");
        Pair<String,?> pair = new Pair<>("","");
    }
}
