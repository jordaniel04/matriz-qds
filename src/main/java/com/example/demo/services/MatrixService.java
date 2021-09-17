package com.example.demo.services;

import com.example.demo.constants.Messages;
import com.example.demo.entities.Matrix;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MatrixService {
    public int[][] rotateMatrix(Matrix matrix) {
        matrixDimensionValidation(matrix);
        int dimension = matrix.getMatrix().size();
        int[][] nreMatrix = new int[dimension][dimension];

        //traverse the original matrix
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                //Rotate the matrix counterclockwise 90°
                nreMatrix[dimension - 1 - j][i] = matrix.getMatrix().get(i).get(j);
            }
        }

        return nreMatrix;
    }

    private void matrixDimensionValidation(Matrix matrix) {
        int columnSize = matrix.getMatrix().size();

        matrix.getMatrix().forEach(row -> {
            if (columnSize != row.size()) throw new ResponseStatusException(HttpStatus.CONFLICT, Messages.THE_SIZE_BETWEEN_COLUMNS_AND_ROWS_DOES_NOT_MATCH);
        });
    }
}
