package com.datastructures.list;

import com.datastructures.List.LinkedList;
import com.datastructures.List.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

public class ListTest {
    @Test
    public void addToListTest() {
        //Given
        List<String> str = new LinkedList<>();

        //When

        str.add("One");
        str.add("Two");
        str.add("Three");


        //Then
        Assert.assertEquals(0, str.size());
    }
}
