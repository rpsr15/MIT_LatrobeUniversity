public class Portfolio<T>{
    T[] data;
    public Portfolio(int capacity)
    {
        this.data = (T[])new Object[capacity]; // compiler warning

    }

    public T get(int index){
        return data[index];
    }

    public void set(int index, T element)
    {
        data[index] = element;
    }
}