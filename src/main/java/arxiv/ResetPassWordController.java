package arxiv;
/**

 * 
 * @author Chonghao Zhai 
 *
 */
 
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class ResetPassWordController implements Initializable{
    
	@FXML
	private TextField Email;
	
	private Main app;
	
	public void setApp(Main app) {
		this.app=app;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void Change_to_PassWordTips(ActionEvent event) throws Exception{
		String mail=Email.getText();
		if(mail.equals("")){
		}
		else {
			app.user.requestPasswordReset(mail);
		}
		app.passwordtips();
	}
}