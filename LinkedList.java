public class LinkedList {

    private Node head;
    private int count;
    private boolean isEmpty;

    //constructor
    public LinkedList()
    {
        head = null;
        count = 0;
        isEmpty = true;
    }

    public void push(int data_)
    {
        Node currNode = head;

        while(currNode.getNext() != null)
        {
            currNode = currNode.getNext();
        }

        currNode.setNext(new Node(data_));
        count++;
    }

    public int pop()
    {
        if(count == 0)
        {
            System.out.println("List is already empty");
            return -1;
        }
        if(count == 1)
        {
            int ret = head.getData();
            head = null;
            count = 0;
            isEmpty = true;
            return ret;
        }


        Node currNode = head;
        while(currNode.getNext().getNext() != null)
        {
            currNode = currNode.getNext();
        }

        int temp = currNode.getNext().getData();
        count--;
        if (count == 0)
        {
            isEmpty = true;
        }
        currNode.setNext(null);
        return temp;
    }

    public void showList()
    {
        Node currNode = head;

        while(currNode != null)
        {
            currNode.displayNode();
        }
    }

    public int valAtIdx(int idx_)
    {
        if(idx_ < 0 || idx_ >= count)
        {
            System.out.println("Index not found.");
            return -1;
        }

        Node currNode = head;

        for(int i = 0; i < count; i++)
        {
            if(i == idx_)
            {
                return currNode.getData();
            }

            currNode = currNode.getNext();
        }
        return -1;
    }

    public void insertAtIdx(int idx_, int data_)
    {
        if(idx_ < 0 || idx_ >= count)
        {
            System.out.println("Index not found.");
            return;
        }

        Node currNode = head;
        for(int i = 0; i < count; i++)
        {
            if(i == idx_)
            {
                Node temp = currNode.getNext();
                currNode.setNext(new Node(data_));
                currNode.getNext().setNext(temp);
            }

            currNode = currNode.getNext();
        }


    }

    public int removeAtIdx(int idx_)
    {
        if(idx_ < 0 || idx_ >= count)
        {
            System.out.println("Index not found.");
            return -1;
        }
        else if(idx_ == 0)
        {
            int temp = head.getData();
            head = head.getNext();
            count--;
            if(count == 0)
            {
                isEmpty = true;
            }
            return temp;
        }
        else
        {
            Node currNode = head;
            for (int i = 0; i < idx_ - 1; i++) {
                currNode = currNode.getNext();
            }

            Node tempNode = currNode.getNext();
            currNode.setNext(currNode.getNext().getNext());
            count--;
            int temp = tempNode.getData();
            tempNode = null;
            return temp;
        }

    }

}
