package tictac;

import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class UserInterface extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public UserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
		//Create 9 box objects, used to pass information to paint methods
		Box b1 = new Box(50,0,125,100);
		Box b2 = new Box(175,0,125,100);
		Box b3 = new Box(300,0,125,100);
		Box b4 = new Box(50,100,125,100);
		Box b5 = new Box(175,100,125,100);
		Box b6 = new Box(300,100,125,100);
		Box b7 = new Box(50,200,125,100);
		Box b8 = new Box(175,200,125,100);
		Box b9 = new Box(300,200,125,100);
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				//Draw the 9 rectangles on the game board
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(3));
				g.drawRect(50, 0, 125, 100);	//1
				g.drawRect(175, 0, 125, 100);	//2
				g.drawRect(300, 0, 125, 100);	//3
				g.drawRect(50, 100, 125, 100);	//4
				g.drawRect(175, 100, 125, 100);	//5
				g.drawRect(300, 100, 125, 100);	//6
				g.drawRect(50, 200, 125, 100);	//7
				g.drawRect(175, 200, 125, 100);	//8
				g.drawRect(300, 200, 125, 100);	//9
			}
		};
		panel.setBounds(5, 5, 486, 313);
		//Listener for box 1
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 50 && e.getY() > 0) && (e.getX() < 175 && e.getY() < 100)) {					
					if(b1.getState().equals("")) {
						paintX(b1);
						b1.setState("X");
					}
					else if(b1.getState().equals("X")) {
						paintO(b1);
						b1.setState("O");
					}
					else if(b1.getState().equals("O")) {
						clearBox(b1);
						b1.setState("");
					}
				}
			}
		});
		//Listener for box 2
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 175 && e.getY() > 0) && (e.getX() < 300 && e.getY() < 100)) {
					if(b2.getState().equals("")) {
						paintX(b2);
						b2.setState("X");
					}
					else if(b2.getState().equals("X")) {
						paintO(b2);
						b2.setState("O");
					}
					else if(b2.getState().equals("O")) {
						clearBox(b2);
						b2.setState("");
					}
				}
			}
		});
		//Listener for box 3
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 300 && e.getY() > 0) && (e.getX() < 425 && e.getY() < 100)) {
					if(b3.getState().equals("")) {
						paintX(b3);
						b3.setState("X");
					}
					else if(b3.getState().equals("X")) {
						paintO(b3);
						b3.setState("O");
					}
					else if(b3.getState().equals("O")) {
						clearBox(b3);
						b3.setState("");
					}
				}
			}
		});
		//Listener for box 4
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 50 && e.getY() > 100) && (e.getX() < 175 && e.getY() < 200)) {
					if(b4.getState().equals("")) {
						paintX(b4);
						b4.setState("X");
					}
					else if(b4.getState().equals("X")) {
						paintO(b4);
						b4.setState("O");
					}
					else if(b4.getState().equals("O")) {
						clearBox(b4);
						b4.setState("");
					}
				}
			}
		});
		//Listener for box 5
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 175 && e.getY() > 100) && (e.getX() < 300 && e.getY() < 200)) {
					if(b5.getState().equals("")) {
						paintX(b5);
						b5.setState("X");
					}
					else if(b5.getState().equals("X")) {
						paintO(b5);
						b5.setState("O");
					}
					else if(b5.getState().equals("O")) {
						clearBox(b5);
						b5.setState("");
					}
				}
			}
		});
		//Listener for box 6
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 300 && e.getY() > 100) && (e.getX() < 425 && e.getY() < 200)) {
					if(b6.getState().equals("")) {
						paintX(b6);
						b6.setState("X");
					}
					else if(b6.getState().equals("X")) {
						paintO(b6);
						b6.setState("O");
					}
					else if(b6.getState().equals("O")) {
						clearBox(b6);
						b6.setState("");
					}
				}
			}
		});
		//Listener for box 7
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 50 && e.getY() > 200) && (e.getX() < 175 && e.getY() < 300)) {
					if(b7.getState().equals("")) {
						paintX(b7);
						b7.setState("X");
					}
					else if(b7.getState().equals("X")) {
						paintO(b7);
						b7.setState("O");
					}
					else if(b7.getState().equals("O")) {
						clearBox(b7);
						b7.setState("");
					}
				}
			}
		});
		//Listener for box 8
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 175 && e.getY() > 200) && (e.getX() < 300 && e.getY() < 300)) {
					if(b8.getState().equals("")) {
						paintX(b8);
						b8.setState("X");
					}
					else if(b8.getState().equals("X")) {
						paintO(b8);
						b8.setState("O");
					}
					else if(b8.getState().equals("O")) {
						clearBox(b8);
						b8.setState("");
					}
				}
			}
		});
		//Listener for box 9
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((e.getX() > 300 && e.getY() > 200) && (e.getX() < 425 && e.getY() < 300)) {
					if(b9.getState().equals("")) {
						paintX(b9);
						b9.setState("X");
					}
					else if(b9.getState().equals("X")) {
						paintO(b9);
						b9.setState("O");
					}
					else if(b9.getState().equals("O")) {
						clearBox(b9);
						b9.setState("");
					}
				}
			}
		});
		contentPane.setLayout(null);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton resetButton = new JButton("");
		resetButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				repaint();
			}
		});
		resetButton.setIcon(new ImageIcon(UserInterface.class.getResource("/tictac/reset.png")));
		resetButton.setBounds(7, 140, 32, 32);
		panel.add(resetButton);
	}
	//Method:	paintX()
	//Purpose:	receives a Box object, clears the rectangle corresponding
	//			to that Box, redraws it, then draws an 'X' inside
	public void paintX(Box b) {
		int xLoc = b.getX() + 40;
		int yLoc = b.getY() + 30;
		Graphics g = this.contentPane.getGraphics();
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g.clearRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
		g.drawRect(b.getX()+5, b.getY()+6, b.getWidth(), b.getHeight());
		g.drawLine(xLoc, yLoc, xLoc + 60, yLoc + 50);
		g.drawLine(xLoc, yLoc + 50, xLoc + 60, yLoc);
	}
	//Method:	paintO()
	//Purpose:	receives a Box object, clears the rectangle corresponding
	//			to that Box, redraws it, then draws an 'O' inside
	public void paintO(Box b) {
		Graphics g = this.contentPane.getGraphics();
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g.clearRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
		g.drawRect(b.getX()+5, b.getY()+6, b.getWidth(), b.getHeight());
		g.drawOval(b.getX()+41, b.getY()+30, 50, 50);
	}
	//Method:	clearBox()
	//Purpose:	receives a Box object, clears the rectangle corresponding
	//			to that box, then redraws it. This is used to reset the box
	//			in case the player accidentally goes too far
	public void clearBox(Box b) {
		Graphics g = this.contentPane.getGraphics();
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g.clearRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
		g.drawRect(b.getX()+5, b.getY()+6, b.getWidth(), b.getHeight());
	}
}
