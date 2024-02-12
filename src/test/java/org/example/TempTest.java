package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TempTest {

    @org.junit.jupiter.api.Test
    void main() {
        System.out.println("Nothing to test");
        throw new RuntimeException("Soe error");
    }
}