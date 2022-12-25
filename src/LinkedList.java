public class LinkedList {
    class Node{
        int value;
        Node next;
    }
    Node head;

    void add(int newValue){
        Node newNode=new Node();
        newNode.value = newValue;
        newNode.next=head;
        head=newNode;
    }
    public String toString(){
        Node tmp=head;
        String result="[";
        while(tmp != null){
            result=result+Integer.toString(tmp.value) + "-";
            tmp=tmp.next;
        }
        result = result + "]";
        return result;
    }
}
