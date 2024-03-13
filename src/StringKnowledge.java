public class StringKnowledge {
    public static void main(String[] args) {
        System.out.println("Testing EndOther");
        System.out.println(endOther("abDe", "Abde"));
        System.out.println(endOther("aysDe", "Abde"));
        System.out.println(endOther("rtdDe", "Aotde"));
        System.out.println(endOther("bErt", "Bert"));
        System.out.println(endOther("ernIe", "ernIe"));
        System.out.println("FindingRepeats");
        System.out.println(findRepeats("aabaa"));
        System.out.println(findRepeats("ab"));
        System.out.println(findRepeats("afr"));
        System.out.println(findRepeats("jytd"));
    }


    public static boolean endOther(String a, String b) {
        // Convert both strings to lowercase
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        if (lowerB.endsWith(lowerA)) {
            return true;
        }

        return lowerA.endsWith(lowerB);
    }

    public static boolean findRepeats(String toTest) {
        // Scan each character of the string
        for (int i = 0; i < toTest.length(); i++) {
            for (int j = i + 1; j <= toTest.length(); j++) {
                String substring = toTest.substring(i, j);
                if (substring.length() >= 2) {
                    if (toTest.indexOf(substring, i + 1) != -1) {
                        return true;
                    }
                }
            }
        }
        // If no repeating substrings were found, return false
        return false;
    }
}
