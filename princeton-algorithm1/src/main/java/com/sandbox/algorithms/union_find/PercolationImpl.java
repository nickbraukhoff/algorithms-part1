package com.sandbox.algorithms.union_find;

/**
 * @author tkmay02
 * @since 11/15/14
 */
public class PercolationImpl implements Percolation {
    final int nBynGrid;

    public PercolationImpl(final int nBynGrid) {
        if (nBynGrid <= 0) {
            throw new IndexOutOfBoundsException("Grid needs to be greater than 0");
        }
        this.nBynGrid = nBynGrid;
    }

    public int getnBynGrid() {
        return nBynGrid;
    }

    @Override
    public void open(final int row, final int column) {
        if (isNotOutside(row, column)) {

        }

    }

    @Override
    public boolean isOpen(final int row, final int column) {
        if (isNotOutside(row, column)) {

        }
        return false;
    }

    @Override
    public boolean isFull(final int row, final int column) {
        if (isNotOutside(row, column)) {

        }
        return false;
    }

    @Override
    public boolean percolates() {
        return false;
    }

    boolean isNotOutside(final int row, final int column) {
        if (nBynGrid >= row || nBynGrid >= column) {
            return true;
        }
        throw new IndexOutOfBoundsException("Row or Column can not be greater than grid size");

    }

    public static void main(String[] args) {

    }   // test client (optional)
}
