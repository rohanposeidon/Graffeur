import java.io.*;
import java.util.concurrent.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI
{
	public static void main(String[] args) throws IOException
	{
		Runtime.getRuntime().exec("cmd /k del Function.class");
		Frame l=new Frame("Login page");
		Font font=new Font("Serif",Font.PLAIN,24);
		l.setFont(font);
		l.addWindowListener
		(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			}
		);
		Color clr=new Color(255,0,0);
		l.setBackground(clr);
		Panel login=new Panel(null);
		Panel SignUp=new Panel(null);
		Frame Sign=new Frame("Sign up page");
		
		Sign.addWindowListener
		(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			}
		);
		Sign.setBackground(clr);
		Sign.setFont(font);
		l.add(login);
		Sign.add(SignUp);
		l.setSize(1900,1100);
		l.setResizable(false);
		Sign.setSize(1900,1100);
		Sign.setResizable(false);
		Button enter1=new Button("Login");
		Button enter2=new Button("Sign Up");
		Button enter3=new Button("Register");
		Button enter4=new Button("Continue without account");
		TextField username=new TextField();
		TextField password=new TextField();
		TextField username2=new TextField();
		TextField password2=new TextField();
		Label unable=new Label("Incorrect credentials");
		Label impossible=new Label("Username unavailable");
		unable.setBounds(500,900,300,60);
		impossible.setBounds(500,900,300,60);
		enter1.setBounds(500,300,150,60);
		enter2.setBounds(500,500,150,60);
		
		enter3.setBounds(500,600,150,60);
		enter4.setBounds(500,600,300,60);
		username.setBounds(100,300,150,60);
		password.setBounds(300,300,150,60);
		username2.setBounds(100,300,150,60);
		password2.setBounds(300,300,150,60);
		
		enter1.setVisible(true);
		enter2.setVisible(true);
		enter3.setVisible(true);
		enter4.setVisible(true);
		username.setVisible(true);
		password.setVisible(true);
		username2.setVisible(true);
		password2.setVisible(true);
		unable.setVisible(false);
		impossible.setVisible(false);
		login.add(enter1);
		login.add(enter2);
		login.add(username);
		login.add(password);
		login.add(enter4);
		login.add(unable);
		SignUp.add(username2);
		SignUp.add(password2);
		SignUp.add(enter3);
		SignUp.add(impossible);
		l.setVisible(true);
		login.setVisible(true);
		SignUp.setVisible(true);
		Frame f=new Frame("Graffeur - Driving your Expression into the 2 Dimensions");
		
		f.setFont(font);
		f.addWindowListener
		(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
				public void windowIconified(WindowEvent we)
				{
					System.exit(0);
				}
			}
		);
		
		JLabel label2=new JLabel();
		try {
			label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
		} catch (IOException e1) {
			 
		//label2.setVisible(false);	
		label2.setVisible(true);
		}
		//Graph g = new Graph();
		//g.printGraph();
		//label2.setVisible(false);
		Panel controlPanel =new Panel(null);
		Panel panel = new Panel(null);
		f.add(controlPanel);
		f.setBackground(clr);
		f.setSize(1900,1100);
		f.setResizable(false);
		BorderLayout layout = new BorderLayout();
	    layout.setHgap(10);
	    layout.setVgap(10);
	    panel.setLayout(layout);
	    
	    TextField func=new TextField();
		func.setBounds(880,40,300,30);
		func.setVisible(true);
		Button ent=new Button("Enter");
		ent.setBounds(1209,40,59,30);
		ent.setVisible(true);
		Label l9=new Label("Please wait while the Graph is being loaded(typically takes about 3 seconds)");
		l9.setBounds(600,80,900,50);
		l9.setVisible(true);
		Label l10=new Label("Enter the function required:");
		l10.setBounds(600,35,300,50);
		l10.setVisible(true);
		JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setMaximumSize(new java.awt.Dimension(300,300));
        jLabel1.setPreferredSize(new java.awt.Dimension(300,300));
        jLabel1.setVisible(true);
        jLabel1.setBounds(500,500,300,300);
        String arg="graph.png";
        ImageIcon icon=new ImageIcon(arg);
        JLabel label=new JLabel();
        label.setIcon(icon);
        label.setVisible(true);
        Graph g=new Graph();
        
		ent.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					String mid=func.getText();
					String text = new String("public class Function extends Graph\n{\n\tstatic double fu(double x)\n\t{\n\t\treturn " + mid + ";\n\t}\n}");
					try
					{
						FileOutputStream fileOut = new FileOutputStream("Function.java");
						fileOut.write(text.getBytes());
						fileOut.close();
					}
					catch (Exception e1)
					{
					}
					try
					{
						Runtime.getRuntime().exec("cmd /k javac Function.java");
					} 
					catch (IOException e1)
					{
						e1.printStackTrace();
					}
					try
					{
						TimeUnit.SECONDS.sleep(3);
					}
					catch(Exception e2)
					{
					}
					g.printGraph();
					//Graph g = new Graph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 g.printGraph();
						 
					}
					l9.setVisible(false);
					l10.setVisible(false);
					ent.setVisible(false);
					func.setVisible(false);
			        label2.setBounds(600,0,1082,1080);
					label2.setVisible(true);
					label.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		label2.setVisible(true);
        label2.setBounds(600,0,1082,1080);
        controlPanel.add(label2);
       // label2.setVisible(false);
        Button b1=new Button("UP-LEFT");
		Button b2=new Button("UP");
		Button b3=new Button("UP-RIGHT");
		Button b4=new Button("LEFT");
		Button b5=new Button("RIGHT");
		Button b6=new Button("DOWN-LEFT");
		Button b7=new Button("DOWN");
		Button b8=new Button("DOWN-RIGHT");
		TextField t=new TextField();
		Label lab=new Label("PAN OPTIONS");
		b1.setBounds(100,130,150,30);
		b2.setBounds(260,130,150,30);
		b3.setBounds(420,130,150,30);
		b4.setBounds(100,170,150,30);
		b5.setBounds(420,170,150,30);
		b6.setBounds(100,210,150,30);
		b7.setBounds(260,210,150,30);
		b8.setBounds(420,210,150,30);
		t.setBounds(260,170,150,30);
		lab.setBounds(250,260,180,60);
		lab.setVisible(true);
		Label d1=new Label();
		Label d2=new Label();
		Label d3=new Label();
		Label d4=new Label();
		
		d1.setBounds(1750,400,100,40);
		d2.setBounds(1750,450,100,40);
		d3.setBounds(1750,500,100,40);
		d4.setBounds(1750,550,100,40);
		Graph a=new Graph();
		d1.setText("Xmax="+a.xh);
		d2.setText("Ymax="+a.yh);
		d3.setText("Xmin="+a.xl);
		d4.setText("Ymin="+a.yl);
		
		b1.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					try {
						g.panII(Integer.parseInt(t.getText()));
							}
							catch(Exception E)
							{
								g.panII();
							
				}
				g.printGraph();
				try {
					label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					label2.setVisible(true);
				} catch (IOException e1) {
					 
						   
					}  
				d1.setText("Xmax="+a.xh);
				d2.setText("Ymax="+a.yh);
				d3.setText("Xmin="+a.xl);
				d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b2.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{

					if(t.getText()!=null)
					{
						try {
					g.panUp(Integer.parseInt(t.getText()));
						}
						catch(Exception E)
						{
							g.panUp();
						}
					}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
						//label2.setVisible(true);
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b3.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
						try {
					g.panI(Integer.parseInt(t.getText()));
					}
					catch(Exception E)
					{
						g.panI();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b4.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
						try {
					
					g.panLeft(Integer.parseInt(t.getText()));
						}
					catch(Exception E)
					{
						g.panLeft();
					}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}}
		);
		b5.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
						try {
					g.panRight(Integer.parseInt(t.getText()));
					}
						catch(Exception E)
					{
						g.panRight();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b6.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
					try{g.panIII(Integer.parseInt(t.getText()));
					}
					catch(Exception E)
					{
						g.panIII();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b7.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
					try{g.panDown(Integer.parseInt(t.getText()));
					}
					catch(Exception E)
					{
						g.panDown();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b8.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t.getText()!=null)
					{
					try{g.panIV(Integer.parseInt(t.getText()));
					}
					catch(Exception E)
					{
						g.panIV();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}  
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		b5.setVisible(true);
		b6.setVisible(true);
		b7.setVisible(true);
		b8.setVisible(true);
		t.setVisible(true);
		Button b9=new Button("Zoom IN Y");
		Button b10=new Button("Zoom IN X");
		Button b11=new Button("Zoom OUT Y");
		Button b12=new Button("Zoom OUT X");
		Button b13=new Button("ZOOM OUT");
		Button b14=new Button("ZOOM IN");
		Label lab4=new Label("ZOOM OPTIONS");
		TextField t3=new TextField();
		TextField t2=new TextField();
		b9.setBounds(260,470,150,30);
		b12.setBounds(100,510,150,30);
		b11.setBounds(260,550,150,30);
		b10.setBounds(420,510,150,30);
		t2.setBounds(260,510,150,30);
		b13.setBounds(100,620,150,30);
		t3.setBounds(260,620,150,30);
		b14.setBounds(420,620,150,30);
		lab4.setBounds(240,680,200,30);
		lab4.setVisible(true);
		b9.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t2.getText()!=null)
					{
					try{g.zoomInY(Double.parseDouble(t2.getText()));
					
					}
					
					catch(Exception E)
					{
						g.zoomInY();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b10.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t2.getText()!=null)
					{
					try{g.zoomInX(Double.parseDouble(t2.getText()));
					}
					catch(Exception E)
					{
						g.zoomInX();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b11.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t2.getText()!=null)
					{try {
					g.zoomOutY(Double.parseDouble(t2.getText()));
					}
					catch(Exception E)
					{
						g.zoomOutY();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b12.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t2.getText()!=null)
					{try {
					g.zoomOutX(Double.parseDouble(t2.getText()));
					}
					catch(Exception E)
					{
						g.zoomOutX();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);

		b13.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t3.getText()!=null)
					{try {
					g.zoomOut(Double.parseDouble(t3.getText()));
					}
					catch(Exception E)
					{
						g.zoomOut();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		b14.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(t3.getText()!=null)
					{try {
					g.zoomIn(Double.parseDouble(t3.getText()));
					}
					catch(Exception E)
					{
						g.zoomIn();
					}}
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					label2.setBounds(600,0,1082,1080);
			        controlPanel.add(label2);
					label2.setVisible(true);
					controlPanel.repaint();
				}
			}
		);
		Button b21=new Button("Reset");
		Button b22=new Button("integrate");
		TextField low=new TextField(); 
		Label l7=new Label("From");
		TextField high=new TextField();
		Label l8=new Label("To");
		b21.setBounds(100,870,100,30);
		b22.setBounds(100,910,100,30);
		low.setBounds(210,910,100,30);
		l7.setBounds(210,950,100,30);
		high.setBounds(320,910,100,30);
		l8.setBounds(320,950,100,30);
		b9.setVisible(true);
		b10.setVisible(true);
		b11.setVisible(true);
		b12.setVisible(true);
		t2.setVisible(true);
		b13.setVisible(true);
		b14.setVisible(true);
		t3.setVisible(true);
		b21.setVisible(true);
		b22.setVisible(true);
		low.setVisible(true);
		l7.setVisible(true);
		high.setVisible(true);
		l8.setVisible(true);
		b21.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
						g.reset();
					g.printGraph();
					try {
						label2.setIcon(new ImageIcon(ImageIO.read(new File("graph.png"))));
					} catch (IOException e1) {
						 
						   
					}
					d1.setText("Xmax="+a.xh);
					d2.setText("Ymax="+a.yh);
					d3.setText("Xmin="+a.xl);
					d4.setText("Ymin="+a.yl);
					controlPanel.repaint();
				}
			}
		);
		Button b23=new Button("save image");
		TextField t23=new TextField();
		b23.setBounds(100,800,100,30);
		t23.setBounds(250,800,100,30);
		b23.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					try
					{
						g.exportImage(t23.getText());
					}
					catch (Exception e2)
					{
					}
				}
			}
		);
		TextField l11=new TextField();
		l11.setBounds(420,910,180,30);
		l11.setVisible(true);
		Label val=new Label("Value");
		val.setBounds(425,950,65,30);
		val.setVisible(true);
		b22.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Double k=g.integrate(Double.parseDouble(low.getText()),Double.parseDouble(high.getText()));
					l11.setText(Double.toString(k));
                    controlPanel.add(l11);
                    controlPanel.add(val);
                    
				}
			}
		);
		
		d1.setVisible(true);
		d2.setVisible(true);
		d3.setVisible(true);
		d4.setVisible(true);
		controlPanel.add(d1);
		controlPanel.add(d2);
		controlPanel.add(d3);
		controlPanel.add(d4);
		controlPanel.add(b21);
		controlPanel.add(b22);
		controlPanel.add(b23);
		b23.setVisible(true);
		controlPanel.add(low);
		controlPanel.add(l7);
		controlPanel.add(high);
		controlPanel.add(l8);
		controlPanel.add(b1);
		controlPanel.add(b2);
		controlPanel.add(b3);
		controlPanel.add(b4);
		controlPanel.add(b5);
		controlPanel.add(b6);
		controlPanel.add(b7);
		controlPanel.add(b8);
		controlPanel.add(t);
        controlPanel.add(label);
        controlPanel.add(l9);
        controlPanel.add(func);
		controlPanel.add(ent);
		controlPanel.add(l10);
		controlPanel.add(lab);
		controlPanel.add(b9);
		controlPanel.add(b10);
		controlPanel.add(b11);
		controlPanel.add(b12);
		controlPanel.add(t2);
		controlPanel.add(b13);
		controlPanel.add(b14);
		controlPanel.add(t3);
		controlPanel.add(lab4);
		controlPanel.add(l11);
		controlPanel.add(val);
		controlPanel.add(t23);
		enter1.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					String u=username.getText();
					String p=password.getText();
					if(g.login(u,p))
					{
						f.setVisible(true);
						label2.setVisible(false);
					}
					else
					{
						unable.setVisible(true);
					}
				}
			}
		);
		enter2.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						l.setVisible(false);
						Sign.setVisible(true);
					}
				});
		enter3.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						l.setVisible(false);
						String u=username2.getText();
						String p=password2.getText();
						
						if(g.createaccount(u,p))
						{
							f.setVisible(true);
							Sign.setVisible(false);
						}
						else 
						{
							impossible.setVisible(true);
						}
					}
				});
		enter4.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						l.setVisible(false);
						f.setVisible(true);
						label2.setVisible(false);
					}
				});
		
        
}}