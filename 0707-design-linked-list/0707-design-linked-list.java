class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node ptr=head;
        for(int i=0;i<index;i++){
            ptr=ptr.next;
        }
        return ptr.val;
    }
    
    public void addAtHead(int val) {
        Node n=new Node(val);
        n.next=head;
        head=n;
        size++;
    }
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(head==null){
            head=n;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null){
               ptr=ptr.next;
            }
            ptr.next=n;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return ;
        }
        if(index==0){
            addAtHead(val);
            return ;
        }
        Node ptr=head;
        Node n=new Node(val);
        for(int i=1;i<index;i++){
            ptr=ptr.next;
        }
        n.next=ptr.next;
        ptr.next=n;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0|| index>=size){
            return ;
        }
        if(index==0){
            head=head.next;
            size--;
            return ;
        }
        Node ptr=head;
        for(int i=1;i<index;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */