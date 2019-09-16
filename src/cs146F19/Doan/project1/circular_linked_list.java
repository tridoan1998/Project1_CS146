package cs146F19.Doan.project1;

public class circular_linked_list {
	Node head;
	Node tail;
	int size;
	class Node{
		Node linknext;
		int data;
		Node(int newdata)
		{
			data = newdata;
			linknext = null;
		}
	}
	
	circular_linked_list()
	{
		head = tail = null;
		size = 0;
	}
	
	public void insert(int number)
	{
		Node n = new Node(number);

		//no node
		if(head == null)
		{
			head = tail = n;
			n.linknext = head;
		}

		//one or more node	x
		else 
		{
			tail.linknext = n;
			n.linknext = head;
			tail = n;
		}
		this.size++;
	}
	
	public void delete(int k)
	{
		//empty list 
		if(head == null)
		{
			System.out.println("The list is empty!");
		}
		//one node 
		else if(head.linknext == head)
		{
			System.out.println(head.data);
			//head = null;
		}
		
		//two or more node 
		else
		{
			Node curr = head;
			Node prev = null;
			while(!hasOnlyOneLeft())
			{
				int count = 0;
				while(count < k)
				{
					prev = curr;
					curr = curr.linknext;
					count++;
				}
				prev.linknext = curr.linknext;
				//check if the node we delete is the first node 
				// if so, move the head to next link
				if(curr == head)
				{
					head = head.linknext;
				}
				Node temp = curr;
				curr = curr.linknext;
				temp = null;
				print();
				System.out.println();
				this.size--;
			}
	}
}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		return false;
	}
	
	public boolean hasOnlyOneLeft()
	{
		Node iterator = head;
		if(head != null && head.linknext == iterator)
		{
			return true;
		}
		return false;
	}
	public void print()
	{
		if(head == null)
		{
			System.out.printf("The list is empty!");
		}
		Node temp = head;
		System.out.printf("%3d", temp.data);
		temp = temp.linknext;
		while(temp != head)
		{
			System.out.printf("%3d", temp.data);
			temp = temp.linknext;
		}
	}	
}