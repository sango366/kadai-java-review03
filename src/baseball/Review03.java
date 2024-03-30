package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ" ,80,59,4);
        tokyo.report();
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        yokohama.report();
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        hanshin.report();
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        yomiuri.report();
        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        hiroshima.report();
        BaseBallTeam tyuunichi = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        tyuunichi.report();


    }

}
