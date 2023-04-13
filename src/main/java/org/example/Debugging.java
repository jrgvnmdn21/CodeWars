package org.example;

import java.util.List;
import java.util.Objects;

public class Debugging {
    public int[] getComputedHashCodes(List<?> objects) {

        int[] hashes = new int[objects.size()];
        int i = 0;
        for (Object object : objects) {

//            if (objects.) {
//                System.out.println("pasok");
//                return new int[]{};
//            }
            hashes[i++] = Objects.hash(object);
        }

        return hashes;
    }
}
