package tdd;

/**
 * 井字游戏
 * “井字游戏”是两个人使用纸和铅笔玩的一种游戏，双方轮流在一个3×3的网格中画X和O，最先在水平、垂直或对角线上将自己的3个标记连起来的玩家获胜。
 * 需求1：
 * 定义边界，棋子放在哪些地方非法
 * 可将棋子放在3×3棋盘上任何没有棋子的地方。
 * 测试分为三步：
 * 1. 如果棋子放在超出了X轴边界的地方，就引发RuntimeException异常；
 * 2. 如果棋子放在超出了Y轴边界的地方，就引发RuntimeException异常；
 * 3. 如果棋子放在已经有棋子的地方，就引发RuntimeException异常。
 */
public class TicTacToe {

    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside board");
        } else if (y < 1 || y > 3) {
            throw new RuntimeException("Y is outside board");
        }
    }

}
