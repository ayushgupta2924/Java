class Test
{
    int a=10;
    void display()
    {
        System.out.println(a);
    }
    public static void main(String arg[])
    {
        Test t=new Test();
        System.out.println(t.a);
        t.display();
    }
}