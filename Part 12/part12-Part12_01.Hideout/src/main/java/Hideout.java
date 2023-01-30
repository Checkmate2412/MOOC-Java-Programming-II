import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> t;

    public Hideout() {
        this.t = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        this.t.add(toHide);
    }
    
    public T takeFromHideout() {
        T element = null;
        for (int i = 0; i < t.size(); i++) {
            element = this.t.get(t.size() - 1);
            this.t.remove(this.t.remove(i));
        }
        return element;
    }
    
    public boolean isInHideout() {
        return !this.t.isEmpty();
    }
}
