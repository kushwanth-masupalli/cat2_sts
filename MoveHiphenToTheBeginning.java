public class MoveHiphenToTheBeginning {

    public static String moveHyphen(String str) {
        int hyphenCount = 0;
        StringBuilder sb = new StringBuilder();

      
        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphenCount++;
            } else {
                sb.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hyphenCount; i++) {
            result.append('-');
        }
        result.append(sb);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "a-bc-d-e";
        System.out.println(moveHyphen(input)); 
    }
}
