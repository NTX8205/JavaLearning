package 委託.資科B班;

/*
1.	寫一個JAVA程式，將「安逸帶來頹廢，勤勞帶來活力。由儉入奢易，由奢入儉難。」
    這段話以逗號、帶來作為分隔產生新字串。
*/

public class wordsplit {
    public static void main(String[] args) {
        String s = "安逸帶來頹廢，勤勞帶來活力。由儉入奢易，由奢入儉難。";
        System.out.println("字串:" + s);
        System.out.println("若以「，」作為分界字元，則字串被分解成:");
        String[] split0 = s.split("，");
        for (String str : split0) {
            System.out.println(str);
        }
        System.out.println("若以「帶來」作為分界字元，則字串被分解成:");
        String[] split1 = s.split("帶來");
        for (String str : split1) {
            System.out.println(str);
        }

    }
}
