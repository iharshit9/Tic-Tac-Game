import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1[]=new Button[9];
	int x=100,y=100;
	FDemo()
	{
		Font f =new Font("Brush Script MT",Font.ITALIC,30);
		setFont(f);
		setLayout(null);
		int i,j,k=0;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				b1[k]=new Button();
				b1[k].setSize(100,100);
				b1[k].setLocation(x,y);
				add(b1[k]);
				b1[k].addActionListener(this);
				k++;
				x+=100;
			}
			x=100;
			y+=100;
		}
	}
	int c=1;
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(c%2==0)
		{
			b.setLabel("O");
		}
		else
		{
			b.setLabel("X");
		}
		c++;
		b.removeActionListener(this);
	}
}
class Demo123
{
public static void main(String ar[])
{
	FDemo f=new FDemo();
	f.setVisible(true);
	f.setSize(600,800);
	f.setLocation(200,100);
}
}