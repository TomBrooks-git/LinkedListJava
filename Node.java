public class Node {
    private int data;
    private Node next;

    //constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Node()
    {
        data = 0;
        next = null;
    }

    public Node(int data_)
    {
        data = data_;
        next = null;
    }

    public Node(int data_, Node node_)
    {
        data = data_;
        next = node_;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public int getData()
    {
        return data;
    }

    public void setData(int data_)
    {
        data = data_;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node node_)
    {
        next = node_;
    }

    public void displayNode()
    {
        System.out.println("Node ID: " + data);
    }


}
