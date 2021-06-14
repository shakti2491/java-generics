package wildcard;

import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Box<?> box = new Box<>("bac");
        Object o = box.take();
    }

    public static <A extends Comparable<A>> A max(Collection<A> xs){
        Iterator<A> xi = xs.iterator();
        A w = xi.next();
        while(xi.hasNext()){
            A x = xi.next();
            if(w.compareTo(x)<0) w = x;
        }
        return w;
    }
}
