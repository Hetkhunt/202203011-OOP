import java.util.*;
class Linkedlist{
    node head;
    class node{
        int data;
        node next;
        node(int data)
        {
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
else{
node curnode=head;
while(curnode.next!=null)
{
curnode=curnode.next;    
}
curnode.next=newnode;
newnode.next=null;
}
}

void print(){
    node curnode=head;
    while(curnode!=null)
    {
    System.out.print(curnode.data+"-->");
    curnode=curnode.next;
    }
    System.out.println("NULL");
}
   void deleteall(int data)
   {
    node curnode=head;
    node nextnode=curnode.next;
    while(nextnode!=null)
    {
    if(nextnode.data>=25)
    {
    curnode.next=nextnode.next;
    nextnode=curnode.next;
    continue;
    }
    
    curnode=nextnode;
    nextnode=nextnode.next;
    }
   }
}
class Main{
    public static void main(String [] args)
    {
    Linkedlist list=new Linkedlist();
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    for(int i=1;i<=n;i++)
    {
    list.insert(x.nextInt());    
    }
    list.print();
    list.deleteall(25); 
    list.print();
    }
}