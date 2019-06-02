package com.eprogrammerz.examples.ds.custom.stack;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Yogen Rai
 */
public class Validator {
    @Test
    public void testMyStack() throws ExecutionException, InterruptedException {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(5);
        myStack.push(7);
        myStack.push(1);

        assertEquals(3, myStack.size());

        // peek test
        assertEquals(Integer.valueOf(1), myStack.peek());

        // pop test
        assertEquals(Integer.valueOf(1), myStack.pop());
        assertEquals(2, myStack.size());

        // push test
        myStack.push(100);
        assertEquals(3, myStack.size());
        assertEquals(Integer.valueOf(100), myStack.peek());
    }

    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(2); // [2]
        minStack.push(4); // [4,2]
        minStack.push(1); // [1,4,2]
        minStack.push(5); // [5,1,4,2]
        minStack.push(0); // [0,5,1,4,2]

        assertEquals(0, minStack.min());
        assertEquals(0, minStack.pop());
        assertEquals(1, minStack.min());
        assertEquals(5, minStack.pop());
        assertEquals(1, minStack.min());
        assertEquals(1, minStack.pop());
        assertEquals(2, minStack.min());
    }

    @Test
    public void testSortedStack() {
        SortedStack sortedStack = new SortedStack();
        sortedStack.push(2);
        sortedStack.push(4);
        sortedStack.push(1);
        sortedStack.push(5);
        sortedStack.push(0);

        assertEquals(0, sortedStack.pop());
        assertEquals(1, sortedStack.pop());
        assertEquals(2, sortedStack.pop());
        assertEquals(4, sortedStack.pop());
        assertEquals(5, sortedStack.pop());
    }
}
