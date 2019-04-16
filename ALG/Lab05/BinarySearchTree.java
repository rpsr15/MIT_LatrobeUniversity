import java.io.*;

public class BinarySearchTree<T extends Comparable<T> > 
{
   private BSTNode<T> root;

   public BinarySearchTree()
   {
   }

   public void displayElements(PrintWriter p)
   {
      displaySubtreeInOrder(root, p);
   }

   private void displaySubtreeInOrder(BSTNode<T> localRoot, PrintWriter p)
   {
   }

   public boolean insertElement(T data)
   {
   }
   
   public T contains(T data)
   {
      // This can be implemented iteratively or recursively.  You will
      // need to add a private helper method if using a recursive
      // approach.
   }
   
   public boolean removeElement(T data)
   {
   }
}

