import java.util.ArrayList;
import java.util.List;
public class MyStack
{ 
    private ArrayList <String> stack = new ArrayList<String>();  

    public MyStack()
    {
    }

    public void push (String s)
    {
        stack.add(s);
    }

    public void pop ()
    {
        stack.remove(stack.size()-1);
    }

    public int getCount()
    {
        return stack.size();
    }

    public String getElement(int index)
    {
        return stack.get(index);
    }

    public static void main(String[] args)
    {
    MyStack s1 = new MyStack();
    s1.push("xxz19200293");
    s1.push("zxxds359850568");
    for (int i=0; i<s1.getCount();i++)
    {
        System.out.println(s1.getElement(i));
    }

    }

}
