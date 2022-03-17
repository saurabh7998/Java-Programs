import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class AddTwoNumbersLL {

  public static void main(String[] args) {
    ListNode head1 = new ListNode(2);
    head1.next = new ListNode(3);
    head1.next.next = new ListNode(4);


    ListNode head2 = new ListNode(7);
    head2.next = new ListNode(8);
    head2.next.next = new ListNode(9);

    // 243 + 789 = 1023 -> result should be 3201 (reverse)

    ListNode resultHead = sumAndReverse(head1, head2);
    while (resultHead != null) {
      System.out.print(resultHead.val + " ");
      resultHead = resultHead.next;
    }

  }

  public static ListNode sumAndReverse(ListNode head1, ListNode head2) {

    List<Integer> list1 = new ArrayList<>();
    while (head1 != null) {
      list1.add(head1.val);
      head1 = head1.next;
    }

    List<Integer> list2 = new ArrayList<>();
    while (head2 != null) {
      list2.add(head2.val);
      head2 = head2.next;
    }

    int num1 = 0;
    int j1 = 0;
    for (int i = list1.size() - 1; i >= 0; i--) {
      num1 += list1.get(i) * Math.pow(10, j1);
      j1++;
    }

    int num2 = 0;
    int j2 = 0;
    for (int i = list2.size() - 1; i >= 0; i--) {
      num2 += list2.get(i) * Math.pow(10, j2);
      j2++;
    }


    int result = num1 + num2;

    ListNode head = new ListNode(result % 10);
    result /= 10;
    ListNode temp = head;

    while (result != 0) {
      ListNode node = new ListNode(result % 10);
      head.next = node;
      head = head.next;
      result = result/10;
    }


    return temp;
  }
}
