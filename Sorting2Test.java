package edu.touro.mco264;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Sorting2Test {
    // Arrange - Act - Assert
    private Sorting2 sortVar = new Sorting2();


    @Test
    void sort(){

        int[] list = new int[] {7, 3, 0, -5, 12, 4};
        sortVar.sort(list);



    }
}
