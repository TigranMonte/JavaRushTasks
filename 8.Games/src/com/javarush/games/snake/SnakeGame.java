package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    private Snake snake;
    private Apple apple;

    private int turnDelay;
    private boolean isGameStopped;
    private static final int GOAL = 28;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            createNewApple();
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }
        if (!snake.isAlive) {
            gameOver();
        }
        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
    }
    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            snake.setDirection(Direction.LEFT);
        } else if (key == Key.RIGHT) {
            snake.setDirection(Direction.RIGHT);
        } else if (key == Key.DOWN) {
            snake.setDirection(Direction.DOWN);
        } else if (key == Key.UP) {
            snake.setDirection(Direction.UP);
        }
        if (key == Key.SPACE && isGameStopped == true) {
            createGame();
        }

    }

    private void createGame() {
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        score = 0;
        drawScene();
        setScore(score);
    }

    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }
    private void createNewApple() {
        Apple newApple;
        do {
            int x = getRandomNumber(WIDTH);
            int y = getRandomNumber(HEIGHT);
            newApple = new Apple(x, y);
        } while (snake.checkCollision(newApple));
        apple = newApple;
    }
    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.TRANSPARENT, "Game Over", Color.INDIGO, 40);
    }
    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.TRANSPARENT, "You WIN!", Color.INDIGO, 40);
    }
}
