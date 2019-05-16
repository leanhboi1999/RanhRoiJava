package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ranh extends JFrame {
	JButton btnYes;
	JButton btnNo;

	public Ranh(String tieude) {
		super(tieude);
		addControls();
		addEvents();
	}

	private void addControls() {
		Font fontHoi = new Font("arial", Font.BOLD, 12);

		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new FlowLayout());
		JLabel lblHoi = new JLabel("Bạn cảm thấy hành phúc khi ngồi code java ?");
		lblHoi.setForeground(Color.RED);
		lblHoi.setFont(fontHoi);
		pnMain.add(lblHoi);

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnYes = new JButton("Yes");
		btnNo = new JButton("No");
		pnButton.add(btnYes);
		pnButton.add(btnNo);

		con.add(pnMain);
		con.add(pnButton);

	}

	private void addEvents() {
		btnYes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "java.lang.NullPointerException");
			}
		});

		btnNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

	public void showWindows() {
		this.setSize(300, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
