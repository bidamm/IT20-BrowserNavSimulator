package browsersim;

/**
 * Manually implemented array-based stack for browser navigation.
 * Last webpage visited is always on top (LIFO: Last In, First Out).
 */
public class BrowserHistoryStack {

    private String[] pages;
    private int top;
    private int capacity;

    public BrowserHistoryStack(int capacity) {
        this.capacity = capacity;
        this.pages = new String[capacity];
        this.top = -1;
    }

    public void push(String url) {
        if (isFull()) {
            return;
        }
        top++;
        pages[top] = url;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String url = pages[top];
        pages[top] = null;
        top--;
        return url;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return pages[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}
