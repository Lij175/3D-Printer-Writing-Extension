public class ListNode {
    // data, next
    double[] data;
    double x;
    double y;
    ListNode next;
    
    public ListNode() {
        this.next = null;
    }
    
    public ListNode(double[] data) {
        this.data = data;
        this.next = null;
        this.x = data[0];
        this.y = data[1];
    }
    
    public ListNode(double[] data, ListNode next) {
        this.data = data;
        this.next = next;
        this.x = data[0];
        this.y = data[1];
    }
}

