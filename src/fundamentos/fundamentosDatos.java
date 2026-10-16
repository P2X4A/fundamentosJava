package fundamentos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class fundamentosDatos {

	public static void main(String[] args) {
		Queue<String> cola = new LinkedList<>();
		cola.add("Alicia"); // ["Alicia"]
		cola.add("Bob");    // ["Alicia", "Bob"]
		String primero = cola.poll(); // "Alicia" → ["Bob"]
	}
	}
	
	
