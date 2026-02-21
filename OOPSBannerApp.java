/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * @author Nallana Sai Suraj
 * @version 6.0
 */
class CharacterPatternMap {

    public String[] getPattern(char ch) {

        switch (ch) {

            case 'O':
                return new String[]{
                        "   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "
                };

            case 'P':
                return new String[]{
                        "*******  ",
                        "**    ** ",
                        "**     **",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       ",
                        "**       ",
                        "**       "
                };

            case 'S':
                return new String[]{
                        "  ***** ",
                        " **     ",
                        "**      ",
                        " **      ",
                        "   ***   ",
                        "      ** ",
                        "       ** ",
                        "      ** ",
                        " *****  "
                };

            default:
                return new String[]{" "};
        }
    }
}



public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatternMap map = new CharacterPatternMap();

        String word = "OOPS";

        String[] o = map.getPattern('O');
        String[] p = map.getPattern('P');
        String[] s = map.getPattern('S');

        for (int i = 0; i < o.length; i++) {

            System.out.println(
                    o[i] + "   " +
                    o[i] + "   " +
                    p[i] + "   " +
                    s[i]
            );
        }
    }
}

