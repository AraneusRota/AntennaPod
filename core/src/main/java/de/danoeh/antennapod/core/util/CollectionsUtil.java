package de.danoeh.antennapod.core.util;

import androidx.core.util.Predicate;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtil {
    private CollectionsUtil() {}

    /**
     * Keeps predicate matches.
     */
    public static <T> List<T> filter(Iterable<T> it, Predicate<T> predicate) {
        ArrayList<T> matches = new ArrayList<>();
        for (T t : it) {
            if (predicate.test(t)) {
                matches.add(t);
            }
        }
        return matches;
    }

}
