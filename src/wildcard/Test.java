package wildcard;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public final class Test {
    public static void main(String[] args) {
        LinkedList<Long> list = new LinkedList<>();
        list.add(0L);
        list.add(1L);
        Long y = Collections.max(list);
    }

    public static <T extends Comparable<T>> T max(Collection<T> xs){
        Iterator<T> xi = xs.iterator();
        T w = xi.next();
        while(xi.hasNext()){
            T x = xi.next();
            if(w.compareTo(x)<0) w = x;
        }
        return w;
    }
}
