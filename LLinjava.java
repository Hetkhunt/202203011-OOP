class LinkedList
{     node head;
      int size;
      LinkedList(){
         
         this.size=0;
      }
class node
{
String data;
node next;
     node(String data){
            this.data=data;
            this.next=null;
           }
}

 
    public void addfirst(String data)
{   node newnode=new node(data);
size++;
   if(head==null)
   {
    head=newnode;
    return ;
   }
   newnode.next=head;
   head=newnode;
}
  public void printlist(){
    node curnode=head;
    if(head==null)
    {
    System.out.println("list is empty");
    return;
    }
    while(curnode!=null)
    {
    System.out.print(curnode.data+"-->");
    curnode=curnode.next;
    }
    System.out.println("NULL");
  }
  public void addlast(String data)
  {
  node newnode=new node(data);
  size++;
  if(head==null)
  {
  head=newnode;
  return;
  }
  node curnode=head;
  while(curnode.next!=null)
  {
   curnode=curnode.next;
  }
  curnode.next=newnode;
  }
  public void set(int n,String data)
  {
    node newnode=new node(data);
    node curnode=head;
    for(int i=1;i<=n-1;i++)
    {
    curnode=curnode.next;    
    }
    newnode.next=curnode.next.next;
    curnode.next=newnode;
    
  }
  public int size()
  {
     return size; 
  }
  public void delete(int n)
  { size--;
    if(head==null)
    {
    System.out.println("list is empty");
    return;
    }
  if(n==0)
 { head=head.next;
  return;
 }
 node curnode=head;
 for(int i=1;i<=n-1;i++)
 {
    curnode=curnode.next; 
 }
  curnode.next=curnode.next.next;
  curnode=null;
  }
  public void add(int n,String data)
  {
    node newnode=new node(data);
    node curnode=head;
    for(int i=1;i<=n-1;i++)
    {
    curnode=curnode.next;
    }
    newnode.next=curnode.next;
    curnode.next=newnode;
    
  }
  public void display(int n)
  {
    node curnode=head;
    for(int i=1;i<=n;i++)
    curnode=curnode.next;
    
    System.out.println(curnode.data);
  }

}
class LLinjava{
        public static void main(String [] args)
{
    LinkedList list=new LinkedList();
    list.addfirst("apple");
    list.printlist();
    list.addfirst("is");
    list.printlist();
    list.addfirst("This");
    list.printlist();
    list.addlast("juice");
    list.printlist();
    list.add(2,"a");
    list.printlist();
    System.out.println("size of the list is:"+list.size());
    list.delete(3);
    list.printlist();
    list.add(2,"apple");
    list.printlist();
    list.set(2,"pineapple");
    list.display(0);
    list.printlist();
    
}

}
