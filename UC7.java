public class UC7 {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character Character to store
         * @param pattern Banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to retrieve character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to retrieve pattern
         * @return pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create pattern for letter O
     */
    public static CharacterPatternMap getOPattern() {

        String[] pattern = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        return new CharacterPatternMap('O', pattern);
    }

    /**
     * Utility method to create pattern for letter P
     */
    public static CharacterPatternMap getPPattern() {

        String[] pattern = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        return new CharacterPatternMap('P', pattern);
    }

    /**
     * Utility method to create pattern for letter S
     */
    public static CharacterPatternMap getSPattern() {

        String[] pattern = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        return new CharacterPatternMap('S', pattern);
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] letters = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        StringBuilder bannerLine;

        for (int i = 0; i < 7; i++) {

            bannerLine = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                bannerLine.append(letter.getPattern()[i]).append("   ");
            }

            System.out.println(bannerLine);
        }
    }
}



