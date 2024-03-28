package ru.vtb.task5.mebmvcexample;

import org.springframework.stereotype.Service;

@Service
// сервис реализует бизнес-логику
public class Summator {
    int getSum(int x, int y) {
        return x+y;
    }
}
