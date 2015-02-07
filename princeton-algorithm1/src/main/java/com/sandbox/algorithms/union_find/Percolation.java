package com.sandbox.algorithms.union_find;

/**
 * @author tkmay02
 * @since 11/15/14
 */
public interface Percolation {

    public void open(int i, int j);          // open site (row i, column j) if it is not open already

    public boolean isOpen(int i, int j);     // is site (row i, column j) open?

    public boolean isFull(int i, int j);     // is site (row i, column j) full?

    public boolean percolates();             // does the system percolate?



}
