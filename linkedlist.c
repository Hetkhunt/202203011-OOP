#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
void print(struct node* ptr)
{  while(ptr!=NULL)
{
  printf("%d -->  ",ptr->data);
  ptr=ptr->next;  
}
printf("NULL");
}
struct node* addfirst(struct node* first,int data)
{
 struct node* ptr=(struct node*)malloc(sizeof(struct node));
 ptr->next=first;
 ptr->data=data;
 return ptr;   
}
struct node* addat(struct node* first,int data,int index)
{
  struct node* ptr=(struct node*)malloc(sizeof(struct node));
  struct node* p=first;
  for(int i=0;i!=index-1;i++)
  {
    p=p->next;
  } 
  ptr->data=data;
  ptr->next=p->next;
  p->next=ptr;
  return first; 
}
struct node* addlast(struct node* first,int data)
{
 struct node* ptr=(struct node*)malloc(sizeof(struct node));
 struct node* p=first;
 while(p->next!=NULL)
 p=p->next;
p->next=ptr;
ptr->next=NULL;
 ptr->data=data;
 return first;   
}
void deletefirst(struct node* first)
{
struct node* ptr=first;
 first=first->next;
free(ptr);

}

int main(){
    struct node *first;
    struct node *second;
    struct node *third;
    first=(struct node*)malloc(sizeof(struct node));
    second=(struct node*)malloc(sizeof(struct node));
    third=(struct node*)malloc(sizeof(struct node));
    first->next=second;
    second->next=third;
    third->next=NULL;
    first->data=5;
    second->data=10;
    third->data=15;
    addat(first,20,3);
    addlast(first,25);
    deletefirst(first);
    print(first);
    return 0;
}
