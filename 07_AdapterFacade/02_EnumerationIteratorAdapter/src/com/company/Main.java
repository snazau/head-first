package com.company;

import Adapters.EnumerationToIteratorAdapter;
import Adapters.IteratorToEnumeratorAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("enumerationAsIterator example");

        Vector dayNamesVector = new Vector();
        dayNamesVector.add("Sunday");
        dayNamesVector.add("Monday");
        dayNamesVector.add("Tuesday");
        dayNamesVector.add("Wednesday");
        dayNamesVector.add("Thursday");
        dayNamesVector.add("Friday");
        dayNamesVector.add("Saturday");

        Enumeration daysEnumeration = dayNamesVector.elements();
        EnumerationToIteratorAdapter enumerationAsIterator = new EnumerationToIteratorAdapter(daysEnumeration);

        while (enumerationAsIterator.hasNext()) {
            System.out.println(enumerationAsIterator.next());
        }
        System.out.println();

        System.out.println("iteratorAsEnumerator example");

        ArrayList dayNamesArrayList = new ArrayList();
        dayNamesArrayList.add("Sunday");
        dayNamesArrayList.add("Monday");
        dayNamesArrayList.add("Tuesday");
        dayNamesArrayList.add("Wednesday");
        dayNamesArrayList.add("Thursday");
        dayNamesArrayList.add("Friday");
        dayNamesArrayList.add("Saturday");

        Iterator daysEnumerationIterator = dayNamesArrayList.iterator();
        IteratorToEnumeratorAdapter iteratorAsEnumeration = new IteratorToEnumeratorAdapter(daysEnumerationIterator);

        while(iteratorAsEnumeration.hasMoreElements()) {
            System.out.println(iteratorAsEnumeration.nextElement());
        }
        System.out.println();
    }
}
