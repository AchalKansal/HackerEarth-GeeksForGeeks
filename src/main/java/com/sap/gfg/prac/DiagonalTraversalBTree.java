package com.sap.gfg.prac;

import java.util.ArrayDeque;
import java.util.Queue;

public class DiagonalTraversalBTree {

    public static void main ( String[] args ) {

        Node root = new Node ( 8 );
        root.left = new Node ( 3 );
        root.right = new Node ( 10 );
        root.left.left = new Node ( 1 );
        root.right.left = new Node ( 6 ); //
        root.right.right = new Node ( 14 );
        root.right.right.left = new Node ( 13 );
        root.right.left.left = new Node ( 4 );
        root.right.left.right = new Node ( 7 );

        diagonalPrint ( root );
    }

    private static void diagonalPrint ( Node root ) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new ArrayDeque<> ();
        Node current = root;
        q.add ( root );

        while (current != null) {
            if(current.right!=null){
                q.add ( current.right );
            }
            current = current.right;
        }
        while (q.size () > 0) {
            Node popElement = q.peek ();
            System.out.println (popElement.data+" ");
//            if(popElement.left.right!=null){
//                System.out.println (popElement.data+" ");
//            }
            if(popElement.left !=null){
                q.add ( popElement.left );
            }
            q.remove (popElement);
        }

    }
}
