package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Fox fox = new Fox();
        Bear bear = new Bear();
        Ball ball = new Ball();
        ball.roll(fox);
        hare.tryEatBall(ball);
        bear.tryEatBall(ball);
        fox.eated(ball);
    }
}
