package com.example.demo.entities;

import java.util.ArrayList;

public class Matrix {
    private ArrayList<ArrayList<Integer>> matrix;

    public Matrix() {
    }

    public Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }
}
