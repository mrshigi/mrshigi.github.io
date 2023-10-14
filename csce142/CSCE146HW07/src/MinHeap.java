/*
 *Sean Raudat for CSCE 146, HW07
 */
public class MinHeap<E extends Comparable<E>> 
{
        private E[] items;
        private int size;

        public MinHeap() 
        {
                this.size = 0;
                items = (E[]) new Comparable[100];
        }

        public int size() 
        {
                return size;
        }

        public void insert(E e) 
        {
                if (size >= items.length) 
                {
                        return;
                }
                items[size] = e;
                bubbleUp(size);
                size++;
        }

        public E remove()//remove a sheepy
        {
                if (size > 0) 
                {
                        E popped = items[0];
                        items[0] = items[--size];
                        bubbleDown(0);
                        return popped;
                }
                return null;
        }

        public E peek() 
        {
                if (size > 0) 
                {
                        return items[0];
                }
                throw null;
        }

        public void update(E item) //updates the list
        {
                int i = 0;
                E temp = null;
                for (i = 0; i < size; i++) 
                {
                        if (items[i].compareTo(item) == 0) 
                        {
                                temp = items[i];
                                items[i] = item;
                                break;
                        }
                }
                if (temp.compareTo(item) < 0) 
                {
                        bubbleDown(i);
                }
                else 
                {
                        bubbleUp(i);
                }

        }

        public boolean isEmpty() 
        {
                return size == 0;
        }

        private void bubbleUp(int current) 
        {
                while (items[current].compareTo(items[parentIndex(current)]) < 0) 
                {
                        swap(current, parentIndex(current));
                        current = parentIndex(current);
                }
        }

        private void bubbleDown(int i) 
        {
                if (!isItLeafIndex(i)) 
                {
                        if ((items[i].compareTo(items[leftChildIndex(i)]) > 0) || (items[i].compareTo(items[rightChild(i)])) > 0) //compares right and left sides
                        {
                                if (items[leftChildIndex(i)].compareTo(items[rightChild(i)]) < 0) 
                                {
                                        swap(i, leftChildIndex(i));
                                        bubbleDown(leftChildIndex(i));
                                } 
                                else 
                                {
                                        swap(i, rightChild(i));
                                        bubbleDown(rightChild(i));
                                }
                        }
                }
        }

        private void swap(int x, int y) 
        {
                E tmp;
                tmp = items[x];
                items[x] = items[y];
                items[y] = tmp;
        }

        private int parentIndex(int i) 
        {
                return (i - 1) / 2;
        }

        private int leftChildIndex(int i) 
        {
                return (i * 2) + 1;
        }

        private int rightChild(int i) 
        {
                return (i * 2) + 2;
        }

        private boolean isItLeafIndex(int i) 
        {
                if (rightChild(i) >= size || leftChildIndex(i) >= size) 
                {
                        return true;
                }
                return false;
        }

        public String toString() 
        {
                String result = "{";
                for (int i = 0; i < size - 1; i++) 
                {
                        result = result + items[i].toString() + ", ";
                }
                if (size > 0)
                {
                        result = result + items[size - 1].toString();
                }
                result = result + "}";
                return result;
        }

        public void clear() 
        {
                size = 0;
                for (int i = 0; i < size; i++)
                        items[i] = null;
        }

}