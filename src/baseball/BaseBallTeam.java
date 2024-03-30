package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    // エラー回避のためコントラクタ引数なしも作成する
    public BaseBallTeam() {
    }

    // コントラクタ引数アリを設定する
    public BaseBallTeam(String name, int wins, int loss, int draw) {
        this.name = name;
        this.win = wins;
        this.lose = loss;
        this.draw = draw;
    }

    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

    public void report() {
        double rate = getRate(); // getRateメソッドを呼び出して勝率を求める
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です。");
    }
}