/**
 * @author: Tulika Sharad
 * @version: 1.0
 */
 
public class OOPSBannerApp_3 {
    public static void main(String[] args) {
        // Line 1
        String line1 = String.join(""," OOOO ", "  OOOO ", "  PPPP  ", "  SSSS ");
        
        // Line 2
        String line2 = String.join("","O    O", " O    O", " P   P ", " S     ");
        
        // Line 3
        String line3 = String.join("","O    O", " O    O", " PPPP  ", "  SSS  ");
        
        // Line 4
        String line4 = String.join("","O    O", " O    O", " P     ", "     S ");
        
        // Line 5
        String line5 = String.join(""," OOOO ", "  OOOO ", " P     ", " SSSS  ");

        // Printing the result
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}