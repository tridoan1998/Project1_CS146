package cs146F19.Doan.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class circular_linked_listTest {

	@Test
	void test() {
		circular_linked_list prisoners=new circular_linked_list();
		assertTrue(prisoners.isEmpty()); //before inserting, list is empty
		assertEquals(0, prisoners.size); // Size is 0
		prisoners.insert(5);
		assertFalse(prisoners.isEmpty()); // after inserting element, list is not empty
		assertEquals(1,prisoners.size); //size is 1
	}

}
