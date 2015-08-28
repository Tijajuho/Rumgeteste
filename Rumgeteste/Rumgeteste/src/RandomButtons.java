import java.awt.EventQueue;

public class RandomButtons {
	RandomButtons(){
		
	}

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUIClass();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});


	}
}
