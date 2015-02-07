package com.sandbox.algorithms.union_find;

/**
 * @author tkmay02
 * @since 11/15/14
 */
public class Union {

    public void dynamicConnectivity(final List<>) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}


