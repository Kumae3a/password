package com.mycompany.passgenerate;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PassGenerate {

	private static int position;
	private static int line;
	static List<Character> arr = new ArrayList<>();

	public static void main(String[] args) {

//        PssSet lettersNumbers = new LettersNumbers(arr);
//        PssSet number = new Numbers(arr);
//        PssSet letters = new Letters(arr);
//        PssSet lettNumbSymb = new LettNumbSymb(arr);
		JFrame jFrame = getJFrame();

	}

	public static void printAll() {
		for (int j = 0; j < line; j++) {

			System.out.print(arr.get((int) (Math.random() * arr.size())));

		}
	}

	public static JFrame getJFrame() {

		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 150);
		// jFrame.setResizable(false);
		jFrame.setVisible(true);
//         jFrame.setMinimumSize(new Dimension(500, 350));
//         jFrame.setMaximumSize(new Dimension(600, 400));
		jFrame.setTitle("pawsord generator");
		jFrame.setLocationRelativeTo(null);

		JPanel jPanelmove = new JPanel();
		JPanel jPanelBut = new JPanel();
		JPanel jPanelText = new JPanel();
		JLabel numb = new JLabel("Введите длинну пароля");
		jFrame.getContentPane().add(BorderLayout.SOUTH, jPanelBut);
		jFrame.getContentPane().add(BorderLayout.CENTER, jPanelmove);
		jFrame.getContentPane().add(BorderLayout.NORTH, jPanelText);

		JTextField length = new JTextField(3);
		JRadioButton letterButton = new JRadioButton("буквы");
		JRadioButton numbButton = new JRadioButton("цифры");
		JRadioButton letNumButton = new JRadioButton("буквы и цифры");
		JRadioButton letNumSymButton = new JRadioButton("буквы, цифры, сиволы");
		JButton jButton = new JButton("Результат");
		letterButton.setSelected(true);

		ButtonGroup group = new ButtonGroup();
		group.add(letterButton);
		group.add(numbButton);
		group.add(letNumButton);
		group.add(letNumSymButton);

		jPanelmove.add(letterButton);
		jPanelmove.add(numbButton);
		jPanelmove.add(letNumButton);
		jPanelmove.add(letNumSymButton);
		jPanelText.add(numb);
		jPanelText.add(length);
		jPanelBut.add(jButton);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (letterButton.isSelected()) {
					PssSet letters = new Letters(arr);
					letters.listArr();
				} else if (numbButton.isSelected()) {
					PssSet number = new Numbers(arr);
					number.listArr();
				} else if (letNumButton.isSelected()) {
					PssSet lettersNumbers = new LettersNumbers(arr);
					lettersNumbers.listArr();
				} else if (letNumSymButton.isSelected()) {
					PssSet lettNumbSymb = new LettNumbSymb(arr);
					lettNumbSymb.listArr();
				}
				int numbLength;
				numbLength = Integer.parseInt(numb.getText());
				for (int j = 0; j < numbLength; j++) {

					JLabel label = new JLabel((arr.get((int) (Math.random() * arr.size()))).toString());

				}
			}

		});

		return jFrame;
	}

}
