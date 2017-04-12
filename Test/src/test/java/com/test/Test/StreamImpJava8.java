package com.test.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.testng.annotations.Test;
import org.testng.collections.Lists;




public class StreamImpJava8 {

	
	@Test
	public void sorting_reverse() {

	    Stream.of("One", "Two", "Three", "Four")
	            .sorted(Collections.reverseOrder())
	            .forEach(System.out::println);

	}
	
	
	@Test
	public void reverse_stream_collect_to_list() {

	    Iterator<String> reversedStream = Stream
	            .of("One", "Two", "Three", "Four")
	            .collect(Collectors.toCollection(LinkedList::new))
	            .descendingIterator();

	    List<String> listReversedOrder = StreamSupport.stream(
	            Spliterators.spliteratorUnknownSize(reversedStream,
	                    Spliterator.ORDERED), false).collect(
	            Collectors.<String> toList());

	    System.out.println(listReversedOrder);
	}
	
	@Test
	public void iterator_to_list_guava() {

	    Iterator<String> reversedStream = Stream
	            .of("One", "Two", "Three", "Four")
	            .collect(Collectors.toCollection(LinkedList::new))
	            .descendingIterator();

	    List<Iterator<String>> reversedList = Lists.newArrayList(reversedStream);

	    System.out.println(reversedList);
	}
	
	public static IntStream reverseOrderStream(IntStream intStream) {
	    int[] tempArray = intStream.toArray();
	    return IntStream.range(1, tempArray.length + 1).boxed()
	            .mapToInt(i -> tempArray[tempArray.length - i]);
	}

	@Test
	public void intstream_reverse_order() {

	    reverseOrderStream(IntStream.of(1, 4, 5, 6, 7)).forEach(
	            System.out::println);
	}
}
