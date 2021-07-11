import utils.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 限制：
 * 0 <= 节点个数 <= 5000
 */
public class ReverseList24 {

    // 栈
    public ListNode reverseListA(ListNode head) {
        // 定义栈，将链表的依次压如栈底
        Stack<ListNode> stack = new Stack<>();
        if(head == null) return null;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        // 获取栈顶元素，并将其作为头结点
        ListNode cur = stack.pop();
        // 指向头头结点
        ListNode p = cur;
        // 依次出栈
        while (!stack.empty()) {
            // 依次加入链表
            cur.next = stack.pop();
            cur = cur.next;
        }
        // 最后一个元素为空
        cur.next = null;
        return p;
    }

    // 迭代
    public ListNode reverseListB(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            // 获取下一个节点
            ListNode next = cur.next;
            // 当前节点的下一节点指向prev
            cur.next = prev;
            // 再反过来赋值，就达到了prev到达头结点
            prev = cur;
            // 遍历下一个节点
            cur = next;
        }
        return prev;
    }


}
