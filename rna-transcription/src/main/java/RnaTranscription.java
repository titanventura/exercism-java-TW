import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        Map<Character, Character> mapping = new HashMap<>();

        mapping.put('C', 'G');
        mapping.put('G', 'C');
        mapping.put('A', 'U');
        mapping.put('T', 'A');

        StringBuilder res = new StringBuilder();

        for (Character i : dnaStrand.toCharArray()) {
            res.append(mapping.get(i));
        }
        return res.toString();
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
    }

}
