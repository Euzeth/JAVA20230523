package Ch20Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChattingSever extends JFrame implements ActionListener, KeyListener, MouseListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextField txt1;
	JTextArea area1;
	JScrollPane scroll1;
	
	ChattingSever(){
		super("Chatting Server");
		setBounds(100, 100, 400, 400);
		
		//Panel
		JPanel panel = new JPanel();	//패널생성
		panel.setLayout(null);
		
		//Btn_Component
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(230, 10, 130, 30);
		btn2 = new JButton("1:1 요청");
		btn2.setBounds(230, 60, 130, 30);
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(230, 110, 130, 30);
		btn4 = new JButton("입력");
		btn4.setBounds(230, 320, 130, 30);
		
		//Txt_Component
		txt1 = new JTextField();
		txt1.setBounds(10,320,210,30);
		
		//TxtArea_Component
		area1 = new JTextArea();
		area1.setBounds(10, 10, 210, 300);
		
		//ScrollPanel_Component
		scroll1 = new JScrollPane(area1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll1.setBounds(10, 10, 210, 300);
		
		//Event처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this);
		btn4.addMouseListener(this);
		
		//Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1);
		
		//Frame
		add(panel);	//프레임에 panel추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txt1) {
			if(e.getKeyCode()==10) {
				System.out.println("입력");
				String str = txt1.getText();
				area1.append(str+"\n");
				txt1.setText("");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장합니다.");
		}else if(e.getSource()==btn2) {
			System.out.println("1:1대화를 요청합니다.");
		}else if(e.getSource()==btn3) {
			System.out.println("대화기록을 확인합니다.");
		}else if(e.getSource()==btn4) {
			System.out.println("입력");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==btn4) {
			String str = txt1.getText();
			area1.append(str+"\n");
			txt1.setText("");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	}

public class C01Ex {
	
	public static void main(String[] args) {
		
		new ChattingSever();
		
		
		
		
		
	}
}

