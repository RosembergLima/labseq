package com.labseq.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.labseq.services.LabseqService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LabseqControllerTests {

    @Mock
    private LabseqService labseqService;

    @InjectMocks
    private LabseqController labseqController;

    @Test
    public void testGetLabseqValue() {
        int value = 10;
        int expectedResult = 20;
        when(labseqService.getLabseqValue(value)).thenReturn(expectedResult);
        ResponseEntity<Object> responseEntity = labseqController.getLabseqValue(value);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResult, responseEntity.getBody());
    }

}
