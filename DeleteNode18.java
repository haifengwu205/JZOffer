import utils.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 *
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 * 说明：
 *
 * 题目保证链表中节点的值互不相同
 * 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
 */
public class DeleteNode18 {
    // 链表
    // 保存前一个节点，判断下一个节点，如果下一个节点是要删除的节点
    // 那么让上一个节点的后指针指向下一个节点的后续节点
    public ListNode deleteNode(ListNode head, int val) {
        // 判空
        if(head == null) return null;
        // 如果头节点等于要删除的值，输出下一个节点
        if(head.val == val) return head.next;
        // 定义输出头
        ListNode cur = head;
        // 遍历查找
        while(head.next != null) {
            // 下一个节点是要删除的节点
            if(head.next.val == val) {
                // 当前节点指向下一个节点的后续节点，并结束遍历
                head.next = head.next.next;
                break;
            }
            // 继续遍历
            head = head.next;
        }
        return cur;
    }
}
