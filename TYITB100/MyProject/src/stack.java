import abc.oveflowException;

public class stack {
    int top=-1,n;

    int []arr=new int[5];
    void push(int e) throws ArrayIndexOutOfBoundsException
    {

            top++;
            if(top>=5)
                throw new ArrayIndexOutOfBoundsException("Overflow");
            arr[top]=e;
    }
    int pop() throws Exception {
        if(top==-1)
            throw new Exception("Underflow");
      return arr[top--];
    }
}
