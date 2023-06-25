package multiArray;

public class MultiArrayPrac {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // B2에 접근하려면?
        System.out.println(seats[1][1]);

        // C5에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫줄에는 3칸, 둘째줄에는 4칸, 셋째줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3에 접근하려면?
        System.out.println(seats2[0][2]);

        // A5에 접근하려면?
        // A5는 없으므로 ArrayIndexOutOfBoundsException 오류 발생
        // index값 오류
        System.out.println(seats2[0][4]);

        // 3차원 배열
        // ex) 1차원 배열이 3개로 구성되어있는 2차원 배열이 3개의 배열로 구성
        String[][][] seats3 = new String[][][]{
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };
    }
}
