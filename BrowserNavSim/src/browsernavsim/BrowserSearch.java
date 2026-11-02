/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package browsernavsim;

/**
 *
 * @author USER
 */
public class BrowserSearch {

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
}