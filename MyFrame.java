import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener, ActionListener{
	
	boolean b=false;
	boolean end=false;
	
	JButton button;
    String sign="X";
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JLabel label8;
	JLabel label9;
	JLabel line1;
	JLabel line2;
	JLabel line3;
	JLabel line4;
	
	MyFrame(){
		
		button=new JButton("Play again");
		
		button.setBackground(Color.yellow);
		button.setBounds(350, 150,100,25);
		button.addActionListener(this);
		button.setVisible(false);
		
		label1=new JLabel();
		label1.setBounds(0,0, 100, 100);
		label1.setBackground(Color.LIGHT_GRAY);
		label1.addMouseListener(this);
		label1.setOpaque(true);
		
		label2=new JLabel();
		label2.setBounds(102,0, 100, 100);
		label2.setBackground(Color.LIGHT_GRAY);
		label2.addMouseListener(this);
		label2.setOpaque(true);
		
		label3=new JLabel();
		label3.setBounds(204,0, 100, 100);
		label3.setBackground(Color.LIGHT_GRAY);
		label3.addMouseListener(this);
		label3.setOpaque(true);
		
		label4=new JLabel();
		label4.setBounds(0,102, 100, 100);
		label4.setBackground(Color.LIGHT_GRAY);
		label4.addMouseListener(this);
		label4.setOpaque(true);
		
		label5=new JLabel();
		label5.setBounds(102,102, 100, 100);
		label5.setBackground(Color.LIGHT_GRAY);
		label5.addMouseListener(this);
		label5.setOpaque(true);
		
		label6=new JLabel();
		label6.setBounds(204,102, 100, 100);
		label6.setBackground(Color.LIGHT_GRAY);
		label6.addMouseListener(this);
		label6.setOpaque(true);
		
		label7=new JLabel();
		label7.setBounds(0,204, 100, 100);
		label7.setBackground(Color.LIGHT_GRAY);
		label7.addMouseListener(this);
		label7.setOpaque(true);
		
		label8=new JLabel();
		label8.setBounds(102,204, 100, 100);
		label8.setBackground(Color.LIGHT_GRAY);
		label8.addMouseListener(this);
		label8.setOpaque(true);
		
		label9=new JLabel();
		label9.setBounds(204,204, 100, 100);
		label9.setBackground(Color.LIGHT_GRAY);
		label9.addMouseListener(this);
		label9.setOpaque(true);
		
		
		
		line1=new JLabel();
		line1.setBounds(100,0,2,304);
		line1.setBackground(Color.black);
		line1.setOpaque(true);
		
		line2=new JLabel();
		line2.setBounds(202,0,2,304);
		line2.setBackground(Color.black);
		line2.setOpaque(true);
		
		line3=new JLabel();
		line3.setBounds(0,100,304,2);
		line3.setBackground(Color.black);
		line3.setOpaque(true);
		
		line4=new JLabel();
		line4.setBounds(0,202,304,2);
		line4.setBackground(Color.black);
		line4.setOpaque(true);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,345);
		this.setLayout(null);
		
		this.add(button);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);
		this.add(label7);
		this.add(label8);
		this.add(label9);
		this.add(line1);
		this.add(line2);
		this.add(line3);
		this.add(line4);
		this.setVisible(true);
	}
	
	public boolean isFilledTable() {
		if(!label1.getText().equals("") 
		&& !label2.getText().equals("") 
		&& !label3.getText().equals("") 
		&& !label4.getText().equals("") 
		&& !label5.getText().equals("") 
		&& !label6.getText().equals("") 
		&& !label7.getText().equals("") 
		&& !label8.getText().equals("") 
		&& !label9.getText().equals("") 
				) {
			end=true;
			return true;
		}
		else
			return false;
	}
	public boolean isOccupied(JLabel label){
		if(!label.getText().equals("")) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isWin() {
		String label1Text=label1.getText();
		String label2Text=label2.getText();
		String label3Text=label3.getText();
		String label4Text=label4.getText();
		String label5Text=label5.getText();
		String label6Text=label6.getText();
		String label7Text=label7.getText();
		String label8Text=label8.getText();
		String label9Text=label9.getText();
		if(label1Text.equals(label2Text) && label1Text.equals(label3Text) && label1Text!="") {
			label1.setBackground(Color.green);
			label2.setBackground(Color.green);
			label3.setBackground(Color.green);
			b=true;		
			end=true;
		}
		if(label4Text.equals(label5Text) && label4Text.equals(label6Text) && label4Text!="") {
			label4.setBackground(Color.green);
			label5.setBackground(Color.green);
			label6.setBackground(Color.green);
			b=true;	
			end=true;
		}
		if(label7Text.equals(label8Text) && label7Text.equals(label9Text) && label7Text!="") {
			label7.setBackground(Color.green);
			label8.setBackground(Color.green);
			label9.setBackground(Color.green);
			b=true;	
			end=true;
		}
		if(label1Text.equals(label4Text) && label1Text.equals(label7Text) && label1Text!="") {
			label1.setBackground(Color.green);
			label4.setBackground(Color.green);
			label7.setBackground(Color.green);
			b=true;	
			end=true;
		}
		if(label2Text.equals(label5Text) && label2Text.equals(label8Text) && label2Text!="") {
			label2.setBackground(Color.green);
			label5.setBackground(Color.green);
			label8.setBackground(Color.green);
			b=true;	
			end=true;
		}
		if(label3Text.equals(label6Text) && label3Text.equals(label9Text) && label3Text!="") {
			label3.setBackground(Color.green);
			label6.setBackground(Color.green);
			label9.setBackground(Color.green);
			b=true;
			end=true;
		}
		if(label1Text.equals(label5Text) && label1Text.equals(label9Text) && label1Text!="") {
			label1.setBackground(Color.green);
			label5.setBackground(Color.green);
			label9.setBackground(Color.green);
			b=true;	
			end=true;
		}
		if(label3Text.equals(label5Text) && label3Text.equals(label7Text) && label3Text!="") {
			label3.setBackground(Color.green);
			label5.setBackground(Color.green);
			label7.setBackground(Color.green);
			b=true;
			end=true;
		}
		return b;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==label1 && !end && !isOccupied(label1)) {
			label1.setText(sign);
			label1.setFont(new Font("MV Boli",Font.BOLD,45));
			label1.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label2 && !end && !isOccupied(label2)) {
			label2.setText(sign);
			label2.setFont(new Font("MV Boli",Font.BOLD,45));
			label2.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label3 && !end && !isOccupied(label3)) {
			label3.setText(sign);
			label3.setFont(new Font("MV Boli",Font.BOLD,45));
			label3.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label4 && !end && !isOccupied(label4)) {
			label4.setText(sign);
			label4.setFont(new Font("MV Boli",Font.BOLD,45));
			label4.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label5 && !end && !isOccupied(label5)) {
			label5.setText(sign);
			label5.setFont(new Font("MV Boli",Font.BOLD,45));
			label5.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label6 && !end && !isOccupied(label6)) {
			label6.setText(sign);
			label6.setFont(new Font("MV Boli",Font.BOLD,45));
			label6.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label7 && !end && !isOccupied(label7)) {
			label7.setText(sign);
			label7.setFont(new Font("MV Boli",Font.BOLD,45));
			label7.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label8 && !end && !isOccupied(label8)) {
			label8.setText(sign);
			label8.setFont(new Font("MV Boli",Font.BOLD,45));
			label8.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
		if(e.getSource()==label9 && !end && !isOccupied(label9)) {
			label9.setText(sign);
			label9.setFont(new Font("MV Boli",Font.BOLD,45));
			label9.setHorizontalAlignment(JLabel.CENTER);
			if(sign=="X") {
				sign="O";
			}
			else
				sign="X";
			
			if(isWin() || isFilledTable()) {
				System.out.println("THE END");
				b=false;
			}
			if(end) {
				button.setVisible(true);
				//end=false;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			label1.setText("");
			label2.setText("");
			label3.setText("");
			label4.setText("");
			label5.setText("");
			label6.setText("");
			label7.setText("");
			label8.setText("");
			label9.setText("");
			label1.setBackground(Color.LIGHT_GRAY);
			label2.setBackground(Color.LIGHT_GRAY);
			label3.setBackground(Color.LIGHT_GRAY);
			label4.setBackground(Color.LIGHT_GRAY);
			label5.setBackground(Color.LIGHT_GRAY);
			label6.setBackground(Color.LIGHT_GRAY);
			label7.setBackground(Color.LIGHT_GRAY);
			label8.setBackground(Color.LIGHT_GRAY);
			label9.setBackground(Color.LIGHT_GRAY);
			button.setVisible(false);
			end=false;
		}
	}

}
