import java.util.HashMap;

public class OOPSBannerApp {

    // ---------- Utility method to build character map ----------
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character,String[]> map = new HashMap<>();

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
                "*******  ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });

        // S (9 rows)
        map.put('S', new String[]{
                "  *****  ",
                " **      ",
                "**       ",
                "**       ",
                " ***   ",
                "     ** ",
                "      **",
                "     ** ",
                " *****  "
        });

        return map;
    }


    // ---------- Render banner ----------
    public static void displayBanner(String msg,
                                     HashMap<Character,String[]> map) {

        msg = msg.toUpperCase();

        int height = map.get('O').length;

        // outer loop = rows
        for(int row=0; row<height; row++){

            StringBuilder line = new StringBuilder();

            // inner loop = characters
            for(char ch : msg.toCharArray()){

                String[] pattern = map.get(ch);

                if(pattern != null){
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }


    // ---------- MAIN ----------
    public static void main(String[] args) {

        HashMap<Character,String[]> map = createCharacterMap();

        displayBanner("OOPS", map);
    }
}
