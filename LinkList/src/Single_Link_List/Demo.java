package Single_Link_List;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkeList myList= new LinkeList();
        myList.Insert_Head(1);
        myList.PrintList();
        
        myList.Insert_Head(4);
        myList.PrintList();
        
        myList.Insert_Head(2);
        myList.PrintList();
        
        
        myList.Insert_Head(8);
        myList.PrintList();
        
        myList.Insert_Tail(7);
        myList.PrintList();
        
        myList.Insert(5,3);
        myList.PrintList();
        
        
        //myList.Delete(1);
        //myList.PrintList();
        
       myList.Delete_Head();
        myList.PrintList();
        
        myList.Delete_Tail();
        myList.PrintList();
        
        myList.Delete(4);
        myList.PrintList();
        
       /* myList.Delete_Head();
        myList.Delete_Head();
        myList.Delete_Head();*/
        
        
       // myList.Find();
        //Length();
        
        //System.out.println("So phan tu: ");
        
        
        /*myList.Delete_Head();
        myList.PrintList();
        
        myList.Delete_Tail();
        myList.PrintList();
        
        myList.Delete(5);
        myList.PrintList();
        myList.PrintList();*/
	}
}
