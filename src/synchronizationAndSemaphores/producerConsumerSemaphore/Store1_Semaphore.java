package synchronizationAndSemaphores.producerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
public class Store1_Semaphore {
    private int maxsize;
    private List<Object> items;
    public Store1_Semaphore(int maxSize)
    {
        this.maxsize=maxSize;
        this.items= new ArrayList<>();
    }
    public void setMaxsize(int maxsize){
        this.maxsize=maxsize;
    }
    public int getMaxsize()
    {
        return maxsize;
    }
    public void setItems(List<Object> items)
    {
        this.items=items;
    }
    public List<Object> getItems(){
        return items;
    }
    public void addItems(){
        this.items.add(new Object());
        System.out.println("Item produced. Count is: "+this.items.size());
    }
    public void removeItems(){
        this.items.remove(this.items.size()-1);
        System.out.println("Item Removed. Count is: "+this.items.size());
    }
}
