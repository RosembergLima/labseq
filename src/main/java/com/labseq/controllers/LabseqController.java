package com.labseq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.labseq.services.LabseqService;

@RestController
public class LabseqController {

    @Autowired
    private LabseqService labseqService;

    @GetMapping("/labseq/{value}")
    public ResponseEntity<Object> getLabseqValue(@PathVariable int value) {
        return ResponseEntity.ok(labseqService.getLabseqValue(value));
    }
}