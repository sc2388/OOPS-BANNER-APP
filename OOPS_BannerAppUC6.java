public class OOPS_BannerAppUC6 {
    public static String[] getOPattern() {
        return new String[]{
                "   ***  ",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "******",
                "**   **",
                "**   **",
                "******",
                "**     ",
                "**     ",
                "**     "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " **** ",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                    String.join(" ",
                            oPattern1[i],
                            oPattern2[i],
                            pPattern[i],
                            sPattern[i]
                    )
            );
        }
    }
}