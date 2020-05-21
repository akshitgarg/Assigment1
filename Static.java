import java.util.*;  
public class Static  //mycodeschool 14 to 21
{
	int top=-1;
	int []arr;
	public Static(int n)
	{
		arr=new int[n];
	}
     public void push( int data)
     {
        top++;
        arr[top]=data;
        System.out.println(arr[top]);
     }
     public int pop()
     {
       if(isEmpty()!=false)
       {
       	top--;
           
       }
       return (arr[top]);
     }

     public int peek()
     { 
          return (arr[top]);

     }
     public boolean isEmpty()
     {
           if(top==-1)
           {
           	 return true;
           }
           else
           {
           	 return false;
           }
     }
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
      Static s=new Static(n);
      System.out.println("enter data ");
      int data=sc.nextInt();
      s.push(data);
      int t=s.peek();
      System.out.println("peek value is" +t);
      int pop1=s.pop();
      System.out.println("pop value is"+pop1);
	}
}