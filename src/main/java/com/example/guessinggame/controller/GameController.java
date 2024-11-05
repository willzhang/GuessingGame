package com.example.guessinggame.controller;

import com.example.guessinggame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
@CrossOrigin // 允许跨域请求
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/guess")
    public String guessNumber(@RequestParam("number") int number) {
        return gameService.checkGuess(number);
    }

    @PostMapping("/reset")
    public String resetGame() {
        gameService.resetGame();
        return "游戏已重置。";
    }
}

