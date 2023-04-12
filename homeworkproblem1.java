import java.util.*;
class Linklist{
    node head;
    class node{
        int data;
        node next;
        node(int data){
        this.data=data;
        this.next=null;
        }
    }
    
void insert(int data)
{
node newnode=new node(data);
if(head==null)
{
head=newnode;
}
node curnode=head;
while(curnode.next!=null)
{
curnode=curnode.next;    
}
curnode.next=newnode;
newnode.next=null;
}
void displayindex(int data)
{
node curnode=head;
int index=1;
while(curnode.data!=data && curnode!=null)
{
curnode=curnode.next;
index++;
}
if(curnode==null)
System.out.println("This data not present in your list");

System.out.println("INDEX :"+index);
}    
    
}

class Main1{
    public static void main(String [] args)
    {
    Linklist list=new Linklist();
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    for(int i=1;i<=n;i++)
    list.insert(x.nextInt());
    int key=x.nextInt();
    list.displayindex(key);
    }
}