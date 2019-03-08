public class Tile{
    Creature creature;
    public Tile()
    {
        this.creature = null;
    }
    public String getCreatureName(){
        if(this.creature != null)
        return "|"+this.creature.getName()+"|";
        else
        return "|    |";
    }

    public Creature getCreature()
    {
        return this.creature;
    }

    public boolean isEmpty()
    {
        if(this.creature == null)
        return true;
        else
        return false;
    }

    public String sayHello()
    {
        return "hello";
    }
    public void removeCreature()
    {
        this.creature = null;
    }

    public void setCreature(Creature creature)
    {
        if(this.creature == null)
        this.creature = creature;
        else
        System.out.println("creature already exits");
    }
}