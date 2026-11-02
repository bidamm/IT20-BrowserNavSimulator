package browsersim;

/**
 * Manual linear search through visited webpage records.
 * Does not use Java Collections or built-in array search methods.
 */
public class BrowserSearch {

    /**
     * Searches pages[0 .. count-1] for a keyword.
     * Returns the first matching index (0-based), or -1 if not found.
     */
    public int linearSearch(String[] pages, int count, String keyword) {
        if (pages == null || keyword == null) {
            return -1;
        }

        String key = keyword.trim();
        if (key.length() == 0) {
            return -1;
        }

        for (int i = 0; i < count; i++) {
            if (pages[i] != null && containsIgnoreCase(pages[i], key)) {
                return i;
            }
        }
        return -1;
    }

    private boolean containsIgnoreCase(String text, String keyword) {
        String haystack = text.toLowerCase();
        String needle = keyword.toLowerCase();
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            return true;
        }
        if (m > n) {
            return false;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }
}
