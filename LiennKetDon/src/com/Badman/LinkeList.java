package com.Badman;

public class LinkeList {
	 Node head;
	    public LinkeList()
	    {
	        this.head=null;
	    }
	    public boolean isEmpty()
	    {
	        if(head==null)
	            return true;
	        else
	            return false;
	    }
	    public void Insert_Head(int x)
	    {
	        if(isEmpty())
	            head=new Node(x,null);
	        else
	            head=new Node(x,head);
	    }
	    public void Insert_Tail(int x)
	    {
	        Node temp;
	        if(isEmpty())
	            head=new Node(x, null);
	        else
	        {
	            temp=head;
	            while(temp.next!=null)
	                temp=temp.next;
	            temp.next=new Node(x,null);
	        }
	    }
	    public void Insert(int x, int vt)
	    {
	       
	        Node temp;
	        int count;
	        if(isEmpty())
	        {
	            if(vt==0)
	                head=new Node(x,null);
	            else
	                return;
	        }
	        else
	        {
	            if(vt==0)
	                Insert_Head(x);
	            else if(vt==1)
	            {
	                head.next=new Node(x,head.next);
	            }
	            else
	            {
	                count=0;
	                temp=head;
	                while(temp.next!=null)
	                {
	                    temp=temp.next;
	                    count++;
	                    if(count+1==vt)
	                        break;
	                }
	                if(count+1!=vt)
	                    return;
	                else
	                {
	                    Node p= new Node(x,temp.next);
	                    temp.next=p;                   
	                }

	            }
	        }
	       
	    }
	    public void Delete_Head()
	    {
	        if(!isEmpty())
	        {
	            if(head.next==null)
	                head=null;
	            else
	                head=head.next;
	        }
	    }
	    public void Delete_Tail()
	    {
	        Node temp;
	        if(!isEmpty())
	        {
	            if(head.next==null)
	                head=null;
	            else
	            {
	                temp=head;
	                while(temp.next.next!=null)
	                    temp=temp.next;
	                temp.next=null;
	            }

	        }
	    }
	    public void Delete(int vt)
	    {
	        int count=1;
	        Node temp;
	        if(isEmpty())
	            return ;
	        else
	        {
	            if(vt<1)
	                return ;
	            else
	            {
	                if(vt==1)
	                    head=head.next;
	                else
	                {
	                    temp=head;
	                    while(temp.next.next!=null)
	                    {
	                        count++;
	                        if(count==vt)
	                            break;
	                        temp=temp.next;
	                    }
	                    if(count!=vt)
	                        return;
	                    else
	                        temp.next=temp.next.next;

	                }           
	            }

	        }
	    }
	    public void print()
	    {
	        Node temp=head;
	        while(temp!=null)
	        {
	            System.out.print(temp.data+ " -> ");
	            temp=temp.next;
	        }
	        System.out.println(" null");
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        LinkeList myList= new LinkeList();
	        myList.Insert_Head(4);
	        myList.Insert_Head(3);
	        myList.Insert_Head(1);
	        myList.Insert_Tail(7);
	        myList.Insert_Tail(8);
	        myList.Insert_Tail(9);
	        myList.Insert_Tail(13);
	        myList.Insert(37, 5);
	        myList.Delete_Head();
	        myList.Delete_Tail();
	        myList.Delete(5);
	        myList.print();

	    }

}
