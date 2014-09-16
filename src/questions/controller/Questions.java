package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;

	public Questions()
	{
		questionScanner = new Scanner(System.in);
	}

	public void start()
	{
		// askQuestions();
		askQuestionsGUI();
	}

	private void askQuestionsGUI()
	{
		asking: if (true)
		{
			String name = "";
			while (name.equals(""))
			{
				name = JOptionPane.showInputDialog("Who the hell are you?");
			}
			String answer = JOptionPane.showInputDialog("Go away " + name + ".");
			if (answer.equalsIgnoreCase("ok") || answer.equals(""))
			{
				break asking;
			}
			JOptionPane.showMessageDialog(null, "hi");
		}

	}

	/*
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String answer = questionScanner.next();
		System.out.println("Hello \"" + answer + "\". How are you?");
		questionScanner.nextLine();
		answer = questionScanner.nextLine();
		System.out.println("I honestly couldn't care less");
	}
	*/
}
