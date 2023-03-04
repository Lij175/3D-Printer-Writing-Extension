
import java.util.NoSuchElementException;

public class LinkedPointList {
	// fields
	private ListNode front;

	// Constructs an empty LinkedIntList
	public LinkedPointList() {
		front = null;
	}

	// Constructs a LinkedIntList from the given ListNode
	public LinkedPointList(ListNode list) {
		front = list;
	}

	// returns the amount of elements in the linked list
	public int size() {
		int size = 0;

		for (ListNode current = front; current != null; current = current.next) {
			size++;
		}
		return size;
	}

	// sets every value in the the given list to zero
	public void zeroOut() {
		for (ListNode current = front; current != null; current = current.next) {
			current.data = new double[] {0,0};
		}
	}

	// adds the given value to the end of the list
	public void add(double[] value) {
		ListNode current = front;
		if (front != null) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		} else {
			front = new ListNode(value);
		}
	}

	// returns a string representation of the linked list
	public String toString() {
		String list = "front";
		for (ListNode current = front; current != null; current = current.next) {
			list += " -> " + "(" + current.x + ", " + current.y + ")";
		}
		list += " -> null";
		return list;
	}

	// returns weather or not the list is empty
	public boolean isEmpty() {
		return front == null;
	}
	
	// reverses the order of the LinkedIntList
	public void reverse() {
		if (front != null) {
			if (front.next == null) {
				return;
			} else if (front.next.next == null) {
				front.next.next = front;
				front = front.next;
				front.next.next = null;
			} else {
				ListNode current = front;
				while (current.next.next != null) {
					current = current.next;
				}
				ListNode end = current.next;
				current.next = null;
				reverse();
				end.next = front;
				front = end;
			}
		}

	}

}