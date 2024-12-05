class a
{
    private int value;

    public void setValue(int x)
    {
        value = x;
    }
    public int getValue()
    {
        return value;
    }

}
class b
{
    public static void main(String [] args) {
        a r=new a();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}