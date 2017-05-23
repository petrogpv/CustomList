package com.petro.customlist;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Администратор on 23.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new UnchangeableArrayListList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.remove(0);
        integers.set(0,2);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        iterator = integers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



     }

}
