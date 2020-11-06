package com.company.chairs;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
