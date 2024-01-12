public class LinkedList {

    public static class Node{ //class
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    //addFirst
    public void addFirst(int data){
        if(head == null){
            Node newNode = new Node(data);
            head = tail = newNode;
            return;
        }
        //step1 -> create new node
        Node newNode = new Node(data);
        size++;
        //step2 -> new Node next = head
        newNode.next = head; //link
        //step3 -> newNode = head;
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        //step1 -> creating a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
                return;
        }
        //step2 -> tail.next = newnode
        tail.next = newNode;
        //step3 -> tail = newNode
        tail = newNode;
    }

    //Printing the Linked List
    public void print(){ //Time complexity will be O(n)
        if(head == null){
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Add in the Middle
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        
        while(i<idx-1){ 
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove first
    public int removeFirst(){ //remove the head, the garbage collector will automatically remove the node.
        if(size == 0){
            System.out.println("Linked List is Empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //prev node : i =size-2;
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data; // tail ka data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    //Search(Iterative)
    public int itrSearch(int key){ // Time complexity will be O(N);
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Search (Recursive)
    public int helper(Node head, int key){ //O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //Reversing a Linked List
    public void reverse(){ //Time Complexity will be O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){ // Remember these 4 steps
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /*Find and Remove Nth Node from end
    nth node from end will be (size-n+1)th node from the start */
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int idxToFind = sz-n;
        Node prev = head;
        while( i < idxToFind ){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Check Palindrome or not?
    public Node findMid(Node head){
        //Slow-Fast Approach
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find Middle
        Node mid = findMid(head);

        //Reverse 2nd Half
        Node curr = mid;
        Node prev = null;
        while(curr != null){ // Reversing 4 steps
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node right = prev; //right part ka head is prev
        Node left = head;

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left= left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.add(2, 9);

        ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        System.out.println(ll.itrSearch(9));
        System.out.println(ll.recSearch(3));

        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
//Time complexity -> O(1);