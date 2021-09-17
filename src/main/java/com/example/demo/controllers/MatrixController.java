package com.example.demo.controllers;

import com.example.demo.constants.Constants;
import com.example.demo.entities.Matrix;
import com.example.demo.services.MatrixService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = Constants.MATRIX, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MatrixController {
    private MatrixService matrixService;

    public MatrixController(MatrixService mat) {
        this.matrixService = mat;
    }

    @PostMapping("rotate")
    public int[][] rotateMatrix(@RequestBody Matrix matrix) {
        return matrixService.rotateMatrix(matrix);
    }
}
