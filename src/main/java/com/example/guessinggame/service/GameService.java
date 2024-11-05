package com.example.guessinggame.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class GameService {

    private int targetNumber;
    private boolean isGameWon;

    public GameService() {
        resetGame();
    }

    public String checkGuess(int guess) {
        if (isGameWon) {
            return "游戏已结束！您已经猜对了数字。";
        }

        if (guess < targetNumber) {
            return "猜小了！再试试吧。";
        } else if (guess > targetNumber) {
            return "猜大了！再试试吧。";
        } else {
            isGameWon = true;
            return "恭喜！您猜对了数字。";
        }
    }

    public void resetGame() {
        this.targetNumber = new Random().nextInt(100) + 1;
        this.isGameWon = false;
    }
}

