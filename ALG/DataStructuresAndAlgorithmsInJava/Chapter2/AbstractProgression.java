public abstract class AbstractProgression {
    protected long current;
    public AbstractProgression(){
        this.current = 0;
    }
    public AbstractProgression(long start)
    {
        this.current = start;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    public void printProgression(int n)
    {
        System.out.print(nextValue());
        for(int i = 1 ; i < n ;i++)
        {
            System.out.print(nextValue());
        }
        System.out.println();
    }

    protected abstract void advance();
}