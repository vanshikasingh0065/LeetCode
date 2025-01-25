"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if(head==None):
            return None       
        temp = head
        map = {}

        while(temp):
            map[temp] = Node(temp.val)
            print(temp.val)
            temp = temp.next
        
        temp = head
        while temp:
            map[temp].next = map.get(temp.next)
            map[temp].random = map.get(temp.random)
            temp = temp.next

        return map[head]


            

        