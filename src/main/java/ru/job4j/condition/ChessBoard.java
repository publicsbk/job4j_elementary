package ru.job4j.condition;

public class ChessBoard {
    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int bishopWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (Math.abs(x2 - x1) > 0 && Math.abs(y2 - y1) > 0) {
                if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                    rsl = Math.abs(x2 - x1);
                }
            }
        }
        return rsl;
    }

    public static int towerWay(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }
}

