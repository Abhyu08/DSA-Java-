```
Interface Queue<E>

Type Parameters:
E - the type of elements held in this queue

All Superinterfaces:
Collection<E>, Iterable<E>

All Known Subinterfaces:
BlockingDeque<E>, BlockingQueue<E>, Deque<E>, TransferQueue<E>

Basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods
exists in two forms:
one throws an exception if the operation fails, the other returns 
a special value (either null or false, depending on the operation).

Summary of Queue methods
Throws exception	Returns special value
Insert	add(e)				offer(e)
Remove	remove()			poll()
Examine	element()			peek()
```
```
Queue , Deque<E> --> BlockingDeque : A Deque that additionally supports blocking operations that wait for the deque to become non-empty when retrieving an element, and wait for space to become available in the deque when storing an element.

public interface BlockingQueue<E>  extends Queue<E> :A Queue that additionally supports operations that wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element.

public interface Deque<E> extends Queue<E> : A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended queue" and is usually pronounced "deck". Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as(plus) those with no fixed size limit.


	                      	Summary of Deque methods
	      	First Element (Head)		      Last Element (Tail)
Throws exception		      Special value		      Throws exception		      Special value
Insert	addFirst(e)		      offerFirst(e)		      addLast(e)		      offerLast(e)
Remove	removeFirst()		      pollFirst()		      removeLast()		      pollLast()
Examine	getFirst()		      peekFirst()		      getLast()		          peekLast()


public interface TransferQueue<E> extends BlockingQueue<E> :A BlockingQueue in which producers may wait for consumers to receive elements.
A TransferQueue may be useful for example in message passing applications in which producers sometimes (using method transfer(E))
await receipt of elements by consumers invoking take or poll, while at other times enqueue elements (via method put) without waiting for receipt. 

```
