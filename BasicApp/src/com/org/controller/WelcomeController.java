package com.org.controller;

/**
 * 
 * @author gopal
 *
 */
public class WelcomeController {

	/**
	 * 
	 * @param name
	 */
	public void sayWelcome(String name) {
		if (name != null && !name.trim().isEmpty()) {
			System.out.println("Welcome: " + name);
		} else {
			System.out.println("Welcome: " + name);
		}
	}

	public static void main(String[] args) {
		WelcomeController controller = new WelcomeController();
		String name = null;
		if (args != null && args.length > 0) {
			name = args[0];
		}
		controller.sayWelcome(name);

	}

}
