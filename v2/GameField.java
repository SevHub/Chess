import java.awt.*;


public class GameField extends Panel{
	Panel[] arr;
	
	
	GameField(Dimension s) {
		arr=new Panel[64];
		int arrCounter=0;
		
		setSize(this.getSize());
		setLocation(0,0);
		setLayout(new GridLayout(9,9));
		add(new Label(""));
		for (int i=0;i<8;i++) {
			add(new Label( ((char) (97+i))+""));
		}
		for (int i=1;i<9;i++) {							//creating a chess typical field
			add(new Label(""+i));
			Panel hlp=null;
			for (int j=0;j<8;j++) {
				hlp= new Panel();
				hlp.setSize(100,100);
				if (i%2==0) {
					if (j%2==0)
						hlp.setBackground(Color.gray);
					else 
						hlp.setBackground(Color.lightGray);
				}
				else {
					if (j%2==1)
						hlp.setBackground(Color.gray);
					else 
						hlp.setBackground(Color.lightGray);
				}
				hlp.add(new Label((((i-1)*8)+j)+""));
				arr[arrCounter]=hlp;					// inserting panels into PanelArray
				add(hlp);
				
			}
			
		}
		
	}
}
