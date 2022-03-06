import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class TwelveDays {

    public String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
            "tenth", "eleventh", "twelfth" };

    public String[] gifts = {
            "twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping", "nine Ladies Dancing",
            "eight Maids-a-Milking", "seven Swans-a-Swimming", "six Geese-a-Laying", "five Gold Rings",
            "four Calling Birds", "three French Hens", "two Turtle Doves", "a Partridge in a Pear Tree" };

    public List<String> giftsList = Arrays.asList(gifts);

    {
        Collections.reverse(giftsList);
    }

    String verse(int verseNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = verseNumber - 1; i > 0; i--) {

            sb.append(String.format(" %s,", giftsList.get(i)));
        }

        if (verseNumber == 1) {
            sb.append(String.format(" %s.\n", giftsList.get(0)));
        } else {
            sb.append(String.format(" and %s.\n", giftsList.get(0)));
        }

        String ret = String.format("On the %s day of Christmas my true love gave to me:%s", days[verseNumber - 1],
                sb.toString());

        // System.out.println(ret);
        return ret;
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i < endVerse; i++) {
            sb.append(String.format("%s\n", this.verse(i)));
        }
        sb.append(String.format("%s", this.verse(endVerse)));
        return sb.toString();
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
    }

    String sing() {
        return this.verses(1, 12);
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
    }
}
