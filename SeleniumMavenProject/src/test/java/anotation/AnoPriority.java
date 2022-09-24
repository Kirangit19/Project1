package anotation;

import org.testng.annotations.Test;

public class AnoPriority {

	
		@Test(priority=1)
		public void test1(){
			System.out.println("This is Test case 1");
		}
		@Test(priority =2,enabled=false)
		public void test2() {
			System.out.println("This is Test case 2 ");
		}
		@Test(enabled=true,priority=1)
		public void test3() {
			System.out.println("This is test case 3");
		}

}
