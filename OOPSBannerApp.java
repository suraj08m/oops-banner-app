/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and efficiency 
 * by utilizing the String.join() method to create each line of the banner.
 * * @author Nallana Sai Suraj
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Each line corresponds to a row in the banner for the letters O, O, P, S.
        // We use String.join(" ", ...) to join parts of each line with spaces.

        
        System.out.println(String.join("   ", "    ***", "    ***", "  ******", "   *****"));

        
        System.out.println(String.join(" ", " **", "    **", "**", "    **", " **", "   **", "  **"));

        
        System.out.println(String.join(" ", "**", "     ** **", "     ** **", "    ** **"));

        
        System.out.println(String.join(" ", "**", "     ** **", "     ** **", "    **  **"));

        
        System.out.println(String.join(" ", "**", "     ** **", "     ** ******", "      ***"));

        
        System.out.println(String.join(" ", "**", "     ** **", "     ** **", "            **"));

        
        System.out.println(String.join(" ", "**", "     ** **", "     ** **", "             **"));

        
        System.out.println(String.join(" ", " **", "   **", "  **", "   **", " **", "            **"));

        
        System.out.println(String.join("   ", "    ***", "    ***", "  **", "      *****"));
    }
}