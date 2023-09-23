package synchronizationAndSemaphores.producerConsumer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
public class Store1 {
    private int maxsize;
    private List<Objects> items;
    public Store1(int maxsize)
    {
        this.maxsize=maxsize;
        this.items = new ArrayList<>();
    }
    public int getMaxsize()
    {
        return maxsize;
    }
    public void setMaxsize(int maxsize)
    {
        this.maxsize=maxsize;
    }
    public List<Objects> getItems(){
        return items;
    }
    public void setItems(List<Objects> items)
    {
        this.items=items;
    }
    public void addItem()
    {
        this.items.add(null);
        System.out.println("Production done. New Count: "+this.items.size());
    }
    public void removeItem()
    {
        this.items.remove(this.items.size()-1);
        System.out.println("Item Consumed. New Count: "+this.items.size());
    }
}
