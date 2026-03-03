public class OOPS_BannerAppUC7 {
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                " **   **",
                "  ***  "
        };

        String[] pPattern = {
                "******",
                "**   **",
                "**   **",
                "******",
                "**     ",
                "**     ",
                "**     "
        };

        String[] sPattern = {
                " **** ",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "****  "
        };

        String[] spacePattern = {
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            StringBuilder builder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                builder.append(pattern[row]).append("  ");
            }
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}