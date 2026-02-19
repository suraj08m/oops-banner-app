/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * Uses String.join() to build each row, stores them in an array,
 * and prints using a for-each loop.
 *
 * @author Nallana Sai Suraj
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[9];

        lines[0] = String.join("   ", "   *** ", "     *** ", "  *******", "      ***** ");
        lines[1] = String.join("   ", " **   **", "  **   **", " **     **", "  **");
        lines[2] = String.join("   ", "**     **", "**     **", "**      **", "**");
        lines[3] = String.join("   ", "**     **", "**     **", "**     **", "  **");
        lines[4] = String.join("   ", "**     **", "**     **", "*******", "      ***");
        lines[5] = String.join("   ", "**     **", "**     **", "**", "              **");
        lines[6] = String.join("   ", "**     **", "**     **", "**     ", "          **");
        lines[7] = String.join("   ", " **   **", "  **   ** ", "**     ", "         **");
        lines[8] = String.join("   ", "   *** ", "     ***  ", " **", "         ***** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
