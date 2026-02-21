import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        // O (9 rows)
        map.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        // P (9 rows)
        map.put('P', new String[]{
                "*******    ",
                "**     **  ",
                "**      ** ",
                "**     **  ",
                "*******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
        });

        // S (9 rows)
        map.put('S', new String[]{
                "  *****  ",
                " **      ",
                "**       ",
                "**       ",
                "  ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****  "
        });

        return map;
    }


    public static void displayBanner(String msg,
                                     HashMap<Character,String[]> map) {

        int height = map.get('O').length;

        for(int row = 0; row < height; row++) {

            StringBuilder sb = new StringBuilder();

            for(char ch : msg.toCharArray()) {
                sb.append(map.get(ch)[row]).append("   ");
            }

            System.out.println(sb);
        }
    }


    public static void main(String[] args) {

        HashMap<Character,String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);
    }
}
