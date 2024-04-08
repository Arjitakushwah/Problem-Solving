# Interview Questions
 ## --1--
 can we delete a node given the node itself as a parameter?
 efficient way that the given node is last node
 https://leetcode.com/problems/delete-node-in-a-linked-list/description/

 ## --2--
 find the nth node from last
       Approach-- nth from last = m-n+1
       2nd approach -- slow fast pointer appraoch

## --3--
 delete nth node from last
 similar slow fast approach
    https://leetcode.com/problems/remove-nth-node-from-end-of-list/

## --4--
finding intersection of two linked list
https://leetcode.com/problems/intersection-of-two-linked-lists/

## --5--
finding the middle element of linked list 
naive approach--
            find the length then find the mid again traverse to find the mid element

Slow and Fast pointer Approach--
            slow=slow.next
            fast=fast.next.next (fast will run in 2x speed)
            cases= odd length && even length(right middle || left middle)

https://leetcode.com/problems/middle-of-the-linked-list/





