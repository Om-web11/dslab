class DequeArray
{
    static final int MAX = 5;

    int[] deque = new int[MAX];
    int front = -1;
    int rear = -1;

    // Insert at end
    void insertEnd(int value)
    {
        if (rear == MAX - 1)
        {
            System.out.println("Deque Overflow");
        }
        else
        {
            if (front == -1)
            {
                front = 0;
            }

            rear++;
            deque[rear] = value;

            System.out.println(value + " inserted at end");
        }
    }

    // Delete at beginning
    void deleteBegin()
    {
        if (front == -1 || front > rear)
        {
            System.out.println("Deque Underflow");
        }
        else
        {
            System.out.println(deque[front] + " deleted from beginning");

            front++;

            if (front > rear)
            {
                front = rear = -1;
            }
        }
    }

    // Display deque
    void display()
    {
        if (front == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.print("Deque elements: ");

            for (int i = front; i <= rear; i++)
            {
                System.out.print(deque[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        DequeArray d = new DequeArray();

        d.insertEnd(10);
        d.insertEnd(20);
        d.insertEnd(30);

        d.display();

        d.deleteBegin();

        d.display();
    }
}
